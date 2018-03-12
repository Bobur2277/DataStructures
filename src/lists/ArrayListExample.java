package lists;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArrayListExample {

	public static void main(String[] args) {
		List<String> l=new ArrayList<>();
		l.add("water");
		l.add("coffee");
		l.add("bottle");
		l.add("cup");
		
		System.out.println(l.indexOf("coffee"));

		String[] array=l.toArray(new String[4]);
		Arrays.sort(array);
		System.out.println(Arrays.binarySearch(array, "water"));
		//multidimential arraylist
		int [][] nums=new int[2][3];
		//nested arraylist
		List<List<Integer>> list = new ArrayList<>();
		
		System.out.println(l);
		l.clear();
		System.out.println(l);
		
		//Resize Array workaround:
		int[] numbers ={12,3,4,5};
		System.out.println(Arrays.toString(numbers));
		
		numbers = Arrays.copyOf(numbers,numbers.length+1);
		numbers[4]=33;
		
		System.out.println(Arrays.toString(numbers));
	}

}
