package queue;

import java.util.PriorityQueue;
import java.util.Queue;

public class QueueExample {

	public static void main(String[] args) {
		//FIRST IN, FIRST OUT
		Queue<String> queue=new PriorityQueue<>();
		queue.add("Delta");
		queue.add("American");
		queue.add("Qatar");
		queue.add("UzAirways");
		
		System.out.println(queue);
		
		
		System.out.println(queue.peek());

	}

}
