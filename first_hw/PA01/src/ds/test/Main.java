package ds.test;

import java.util.Scanner;

import ds.queue.LinkedQueue;
import ds.queue.Queue;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		// Modify line below to initialize queue
		Queue<String> queue = new LinkedQueue<String>();
		while (sc.hasNext()) {
			String command = sc.next();

			if ("enqueue".equals(command)) {
				String item = sc.next();
				queue.enqueue(item);
				System.out.println("ENQUEUE: "+item);
				// Put your code to enqueue the item
			} else if ("dequeue".equals(command)) {
				if(queue.isEmpty()) System.out.println("DEQUEUE: the queue is empty!");
				else System.out.println("DEQUEUE: " + queue.dequeue());
			} else if ("length".equals(command)) {
				System.out.println("LENGTH: " +queue.length());
			} else if ("isEmpty".equals(command)) {
				System.out.println("ISEMPTY: "+ queue.isEmpty());
			} else if ("clear".equals(command)) {
				System.out.println("CLEAR: COMPLETE");
				queue.clear();
			} else if ("reverse".equals(command)) {
				queue.reverse();
				System.out.println("REVERSE: COMPLETE");
			}
		}

		sc.close();
	}
}
