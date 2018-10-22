package lecture16;

import java.util.Scanner;


class LinkedListNode<T> {
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

 class Runner {
	private static Scanner s = new Scanner(System.in);

	public static void main(String[] args) {
		print(LinkedList.removeDuplicates(input()));
	}

	public static void print(LinkedListNode<Integer> head) {
		LinkedListNode<Integer> temp = head;
		while (temp != null) {
			System.out.print(temp.getData() + " ");
			temp = temp.next;
		}
	}

	public static LinkedListNode<Integer> input() {
		int data = s.nextInt();

		LinkedListNode<Integer> head = null;
		LinkedListNode<Integer> tail = null;
		while (data != -1) {
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

public class LinkedList {
	
	public static LinkedListNode<Integer> removeDuplicates(LinkedListNode<Integer> head) {
      /*LinkedListNode<Integer> temp;
      LinkedListNode<Integer> node=new LinkedListNode<Integer>(head.data);
      //System.out.println(head.data);
      //System.out.println("hello world");
  	
      temp=node;
      head=head.next;
      while(head!=null)
      {
       if(node.data == head.data)
        {
          head=head.next;
        }
       else{
    		LinkedListNode<Integer> node1=new LinkedListNode<Integer>(head.data);
    	      node.next=node1;
    	        node=node1;   

    	        //System.out.println(head.data);
    	      head=head.next;
       }
        
      }
      return temp;
    */
		LinkedListNode<Integer> temp=head;
		while(temp!=null)
		{
			if(temp.data==temp.next.data)
				temp.next=temp.next.next;
			else{
				temp=temp.next;
			}
			
		}
		return head;
	}
		
}