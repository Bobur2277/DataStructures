package set;

import java.util.Set;
import java.util.SortedSet;
import java.util.TreeSet;

public class TreeSetExample {

	public static void main(String[] args) {
		Set<String> set = new TreeSet<>();
		SortedSet<String> sortedSet = new TreeSet<>();

		set.add("honda");
		set.add("mazda");
		set.add("bmw");
		
		sortedSet.add("honda");
		sortedSet.add("honda");
		sortedSet.add("mazda");
		sortedSet.add("bmw");
		sortedSet.add("bmw");
		
		System.out.println(set);
		System.out.println(sortedSet);
	}

}
