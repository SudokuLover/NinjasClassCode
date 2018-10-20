package queue;

public class ClientQueue {

	public static void main(String args[])
	{
		Queue q=new Queue();
		q.enqueue(1);
		q.enqueue(2);
		q.enqueue(3);
		q.enqueue(4);
		q.enqueue(5);
		System.out.println(q.getSize());
		System.out.println(q.dequeue());
		System.out.println(q.dequeue());
		System.out.println(q.dequeue());
		System.out.println(q.dequeue());
		System.out.println(q.dequeue());
		q.enqueue(45);
		System.out.println(q.getSize());
		System.out.println(q.dequeue());

	}
}
