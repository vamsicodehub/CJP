package com.vamsi.java8.fi;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.function.BiConsumer;
import java.util.function.BiFunction;
import java.util.function.BiPredicate;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

import com.vamsi.java8.fi.model.Student;

public class PredefinedFIDemo
{
    public static void main(String[] args)
    {
	
	Function<Student, String> function = (s) -> {
	    int marks = s.getMarks();
	    if(marks >= 80)
		return "A[Distinction]";
	    else if(marks >= 60)
		return "B[First Class]";
	    else if(marks >= 50)
		return "C[Second Class]";
	    else if(marks >= 40)
		return "D[Fourth Class]";
	    else
		return "Failed";
	};
	
	Student[] students = {
		new Student("vamsi", 90, ""),
		new Student("sachin",70, ""),
		new Student("kohli", 50, ""),
		new Student("rohit", 40, ""),
		new Student("steve", 30, "")
	};
	
	Consumer<Student> consumer = o->System.out.println(o.toString());
	Predicate<Integer> predicate = t -> t > 80;
	for(Student student : students) {
	    consumer.accept(student);
	    if(predicate.and(predicate).negate().test(student.getMarks()))
		System.out.println(function.apply(student));
	}
	
	Supplier<String> supplier = () -> {
	    String otp = "";
	    Random random = new Random();
	    for(int i=0;i<6;i++) {
//		otp = otp + random.nextInt();
		otp = otp + ((int)(Math.random()*10));
//		otp = otp + ((int)Math.random())*10;
	    }
	    return otp;
	};
	System.out.println("OTP :: "+supplier.get());
	
	BiPredicate<Integer, Integer> biPredicate = (a,b) -> a+b%2==0;
	System.out.println(biPredicate.test(10, 21));
	
	BiFunction<Integer, String, Student> biFunction = (marks,name) -> new Student(name, marks, "");
	List<Student> studentList = new ArrayList<>();
	studentList.add(biFunction.apply(80, "Vamsi"));
	studentList.add(biFunction.apply(70, "Sachin"));
	studentList.add(biFunction.apply(60, "Kohli"));
	studentList.add(biFunction.apply(50, "Rohit"));
	System.out.println(studentList);
	
	BiConsumer<Student, Integer> biConsumer = (s,m) -> s.setMarks(s.getMarks()+m);
	Student stu = new Student("Vamsi", 80, "");
	biConsumer.accept(stu,15);
	System.out.print(stu);
	
    }
    
    //can define methods like below
    Predicate<Integer> test(){
	return t -> t > 0;
    }
    
    Predicate<Boolean> test1(){
	return (t) -> t;
    }
    
   <T> Predicate<T> test2(){
	return t -> t.equals(null) ;
    }
}
