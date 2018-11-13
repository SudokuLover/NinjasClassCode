package lecture16;
import java.util.Scanner;


/*class LinkedListNode<T> {
	public T data;
	public LinkedListNode<T> next;

	public LinkedListNode(T data) {
		this.setData(data);
		this.next = null;
	}

	public T getData() {
		return data;
	}

	public void setData(T data) {
		this.data = data;
	}

}
*/


public class LinkeddListRecursion {
	public static LinkedListNode<Integer> reverse_R(LinkedListNode<Integer> head) {
		
	      if(head==null)
	        return head;
	      if(head.next==null)
	        return head;
	      LinkedListNode<Integer> temp=head;
	      LinkedListNode<Integer> fhead=reverse_R(head.next);
	      LinkedListNode<Integer> temp1=fhead;
	      temp.next=null;
	      
	      while(temp1.next!=null)
	      {
	         temp1=temp1.next;
	      }
	      temp1.next=temp;
	      return fhead;
	  }
	
	 static Scanner s= new Scanner(System.in);
	public static void main(String[] args) {
		print(reverse_R(input()));
	}
	public static void print(LinkedListNode<Integer> head) {
		while (head != null) {
			System.out.print(head.getData() + " ");
			head = head.next;
		}
	}
	public static LinkedListNode<Integer> input() {
		int data = s.nextInt();
		
		LinkedListNode<Integer> head = null;
		LinkedListNode<Integer> tail = null;
		while (data!=-1) {
			LinkedListNode<Integer> newNode = new LinkedListNode<Integer>(data);
			if (head == null) {
				head = newNode;
				tail = newNode;
			} else {
				tail.next = newNode;
				tail = newNode;
			}
			data = s.nextInt();
		}
		return head;
	}
	  
}
