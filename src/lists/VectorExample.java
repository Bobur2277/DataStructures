package lists;

import java.util.Vector;

public class VectorExample {

	public static void main(String[] args) {
		// Vector is syncrinized
		Vector<String> vector = new Vector<>();
		vector.add("Apples");
		vector.add("Bananas");
		System.out.println(vector);

		vector.addElement("strawberry");
		System.out.println(vector);
	}

}
