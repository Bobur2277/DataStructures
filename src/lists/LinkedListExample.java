package lists;

import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class LinkedListExample {

	public static void main(String[] args) {
		List<String> linkedL = new LinkedList<>();
		linkedL.add("John");
		linkedL.add("Vijay");
		linkedL.add("Bob");
		linkedL.add("Mark");

		System.out.println(linkedL.size() + ":" + linkedL);

		System.out.println(linkedL.indexOf("Bob"));

		LinkedList<String> linkedL2 = (LinkedList) linkedL;
		linkedL2.addFirst("Epsob");
		System.out.println(linkedL2);

		linkedL2.addLast("Aiperi");
		System.out.println(linkedL2);
		
		linkedL2.add(1, "Apple");
		System.out.println(linkedL2);
		
		linkedL2.removeFirst();//if list is empty, it will throw exeption 
		System.out.println(linkedL2);
		
		linkedL2.poll();//will not throw exeption
		System.out.println(linkedL2);

		System.out.println(linkedL2.peekFirst());
		System.out.println(linkedL2.peekLast());
		System.out.println(linkedL2);
		
		System.out.println(linkedL2.pollFirst());
		System.out.println(linkedL2);
		
		System.out.println(linkedL2.get(2));
		System.out.println(linkedL2);
		
	
		
	}

}
