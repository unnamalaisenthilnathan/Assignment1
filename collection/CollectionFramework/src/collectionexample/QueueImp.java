package collectionexample;
import java.util.PriorityQueue;


public class QueueImp {
	public static void main(String[] args) {
		PriorityQueue<Integer> queue = new PriorityQueue<Integer> ();
		for(int i=10;i>0;i--)
		{
			queue.add(i);
		}
		//QUEUE:10(front),9,8,7,6,5,4,3,2,1(rear)
		//Priority Queue sorts the data for us
		//QUEUE:1(FRONT),2,3,4,5,6,7,,8,9,10(REAR)
		//Peeking ->obtaining head of queue
		//Polling ->remove the head of queue
		System.out.println("Queue Size is:"+queue.size());
		System.out.println(queue.peek());//head of queue 1
		queue.poll();//removing the head1
		System.out.println("Queue  Size after poll is "+queue.size());
		
		
		System.out.println(queue.peek());//new head of queue2
		
		}
}
