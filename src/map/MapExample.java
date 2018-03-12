package map;

import java.util.HashMap;
import java.util.Map;

public class MapExample {

	public static void main(String[] args) {
		//K, V
		Map<String, Double> menu = new HashMap<>();
		menu.put("Coffee", 2.99);
		menu.put("Capuchino", 3.99);
		menu.put("Hot Chocolate", 3.49);
		menu.put("Hot Chocolate", 3.55);
		
		//How to find out how many elements 
		System.out.println(menu.size());
		System.out.println(menu);
		
		//How much is coffee 
		System.out.println(menu.get("Coffee"));
		//get all keys
		System.out.println(menu.keySet());
		System.out.println(menu.values());
		//remove
		//menu.remove("Coffee");
		System.out.println(menu);
		
		menu.replace("Coffee", 2.99, 3.25);
		System.out.println(menu);
		
		menu.put("regular Coffee", menu.get("Coffee"));
		System.out.println(menu);
		
		
		
	}

}
