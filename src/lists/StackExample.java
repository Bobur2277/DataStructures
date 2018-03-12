package lists;

import java.util.Stack;

public class StackExample {

	public static void main(String[] args) {
		// LAST IN, LAST OUT 
		Stack<String> stack=new Stack<>();
		stack.push("java");
		stack.push("OCA");
		stack.push("10x");
		stack.push("Selenium Cookbook");
		
		System.out.println(stack.peek());
		System.out.println(stack);
		
		System.out.println(stack.search("java"));
		

	}

}
