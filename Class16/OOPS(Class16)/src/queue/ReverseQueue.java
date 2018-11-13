package queue;
import java.util.Scanner;
public class ReverseQueue {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		
		int size = s.nextInt();
		Queue input = new Queue();
		for(int i = 0; i < size; i++) {
			input.enqueue(s.nextInt());
		}
		reverseQueue(input);
		while(!input.isEmpty()) {
			System.out.print(input.dequeue() + " ");
		}
	}
	public static void reverseQueue(Queue q) {
		// Write your code here

      	int k=q.dequeue();
      reverseQueue(q);
      q.enqueue(k);
	}
}
/*class Queue<T> {

	class Node<T> {
		T data;
		Node<T> next;
		Node(T data){
			this.data = data;
		}
	}

	private Node<T> head;
	private Node<T> tail;
	private int size = 0;

	public int size(){
		return size;
	}

	public boolean isEmpty(){
		if(size == 0){
			return true;
		}
		return false;
	}

	public T front() {
		if(size == 0){
			return null;
		}
		return head.data;
	}


	public void enqueue(T element){
		Node<T> newNode = new Node<T>(element);

		if(head == null){
			head = newNode;
			tail = newNode;
		}
		else{
			tail.next = newNode;
			tail = newNode;
		}

		size++;
	}

	public T dequeue(){
		if(head == null){
			return null;
		}
		if(head == tail){
			tail = null;
		}
		T temp = head.data;
		head = head.next;
		size--;
		return temp;
	}
}
*/