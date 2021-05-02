package com.vamsi.java8.collections;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class MapStremDemo {

    public static void main(String[] args) {
	Employee e = new Employee(10, "vamsi");
	Employee e1 = new Employee(20, "Naga");

	Map<Employee, String> map = new HashMap<>();
	map.put(e, "KingMaker");
	map.put(e1, "KingHimself");

	Map<String, String> partiallyPaidDetailsMap = new HashMap<>();
	partiallyPaidDetailsMap.put("Vamsi", "PO~1");
	partiallyPaidDetailsMap.put("Trish", "INV~2");

	System.out
		.println(partiallyPaidDetailsMap.values().stream().filter(p -> p.split("~")[0].equals("PO")).map(m -> Long.valueOf(m.split("~")[1])).collect(Collectors.toList()));

	List<Object[]> result = new ArrayList<>();
	Object[] objArray = new Object[3];
	objArray[0] = 10;
	objArray[1] = 20;
	objArray[2] = 30;
	result.add(objArray);

	objArray = new Object[3];
	objArray[0] = 40;
	objArray[1] = 50;
	objArray[2] = 60;
	result.add(objArray);
	
	Map<String,String> testMap = new HashMap<>();
	
	testMap.putAll(result.stream().filter(objArr -> objArr != null).collect(Collectors.toMap(objArr -> objArr[0] + "~" + objArr[1] + "~" + objArr[2], objArr -> "" + objArr[0])));

	System.out.println(testMap);

	/*
	 * System.out.println(map.entrySet().stream().filter(entry ->
	 * entry.getValue().equalsIgnoreCase("KingMaker")).distinct()
	 * //.map((entry) -> entry.getKey().getName())
	 * .collect(Collectors.toMap(entry -> entry)));
	 */
    }

    static class Employee {
	private int id;
	private String name;

	public Employee(int id, String name) {
	    this.id = id;
	    this.name = name;
	}

	public int getId() {
	    return id;
	}

	@Override
	public String toString() {
	    return "Employee [id=" + id + ", name=" + name + "]";
	}

	public void setId(int id) {
	    this.id = id;
	}

	public String getName() {
	    return name;
	}

	public void setName(String name) {
	    this.name = name;
	}

    }

}
