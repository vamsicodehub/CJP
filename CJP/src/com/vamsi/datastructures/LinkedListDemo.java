package com.vamsi.datastructures;

public class LinkedListDemo {

    public static void main(String[] args) {
	LinkedList<Integer> linkedList = new LinkedList<>();
	linkedList.add(10);
	linkedList.add(20);
	linkedList.add(30);
	linkedList.add(40);

	LinkedList<String> linkedList1 = new LinkedList<>();
	linkedList1.add("Vamsi");
	linkedList1.add("Sahana");
	linkedList1.add("Suppu");
	linkedList1.add("Deepika");
	linkedList1.add("Sireesha");
	linkedList1.add("Rasika");
	linkedList1.add("Manjusha");
	linkedList1.add("3sha");

	linkedList.printData();
	System.out.println();
	System.out.println(linkedList.size());
	linkedList1.printData();
	System.out.println();
	System.out.println(linkedList1.size());

	linkedList.printData(linkedList.reverse(linkedList));
	
	linkedList1.printData(linkedList1.reverseFromMiddle(linkedList1));
    }

}

class LinkedList<T> {
    Node<T> head;

    public LinkedList() {
	// TODO Auto-generated constructor stub
    }

    class Node<T> {
	T data;
	Node<T> next;

	public Node(T dta) {
	    this.data = dta;
	}
    }

    LinkedList<T> add(T data) {
	Node<T> newNode = new Node<>(data);
	if (this.head == null) {
	    this.head = newNode;
	}
	else {
	    Node<T> last = this.head;
	    while (last.next != null) {
		last = last.next;
	    }
	    last.next = newNode;
	}
	return this;
    }

    void printData() {
	System.out.println("");
	System.out.print("[");
	if (head != null) {
	    System.out.print(head.data + ", ");
	    Node<T> current = head.next;
	    while (current != null) {
		System.out.print(current.data);
		current = current.next;
		if (current != null) {
		    System.out.print(", ");
		}
	    }
	}
	System.out.print("]");
    }

    void printData(LinkedList<T> linkedList) {
	System.out.println("");
	System.out.print("[");
	if (linkedList.head != null) {
	    System.out.print(linkedList.head.data + ", ");
	    Node<T> current = linkedList.head.next;
	    while (current != null) {
		System.out.print(current.data);
		current = current.next;
		if (current != null) {
		    System.out.print(", ");
		}
	    }
	}
	System.out.print("]");
    }

    LinkedList<T> reverse(LinkedList<T> list) {
	LinkedList<T> revereList = new LinkedList<>();
	Node<T> head = list.head;
	if (head != null) {
	    Node<T> previous = null;
	    Node<T> current = head;
	    Node<T> next = null;
	    // Node<T> temp = head.next;
	    while (current != null) {
		next = current.next;
		current.next = previous;
		previous = current;
		current = next;
	    }
	    revereList.head = previous;
	}
	return revereList;

    }

    LinkedList<T> reverseFromMiddle(LinkedList<T> list) {
	LinkedList<T> revereList = new LinkedList<>();
	int size = list.size();
	if(size == 0 || size == 1 || size == 2)
	    return list;
	
	int middleSize = size % 2 != 0 ? (size + 1)/2 : size / 2;
	int counter = 1;
	Node<T> head = list.head;
	if (head != null) {
	    Node<T> previous = null;
	    Node<T> current = head;
	    Node<T> next = null;
	    revereList.head = head;
	    Node<T> last = head;
//	    last.next.next = null;
	    int temp  = 1;
	    while (current != null) {
		next = current.next;
		if (counter >= middleSize) {
		    current.next = previous;
		    previous = current;
		}else {
		    while(last.next != null && temp <= counter){
			last = last.next;
			temp++;
		    }
		    last.next = next;
		}
		current = next;
		counter++;
	    }
	    last.next = previous;

	    revereList.head.next = last;
	}
	return revereList;

    }

    private LinkedList<T> subList(LinkedList<T> list, LinkedList<T> revereList) {
	// TODO Auto-generated method stub
	return null;
    }

    int size() {
	int size = 0;
	Node<T> head = this.head;
	if (head != null) {
	    size++;
	    while (head.next != null) {
		head = head.next;
		size++;
	    }
	}
	return size;
    }
}

/*
 * class Node<T> { T data; Node<T> next;
 * 
 * public Node(T dta) { this.data = dta; } }
 */
