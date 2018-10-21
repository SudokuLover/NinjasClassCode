package Lecture17;

/*
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
* */
public class Solution {
	
	public static LinkedListNode<Integer> reverse_R(LinkedListNode<Integer> head) {
	LinkedListNode<Integer>  temp=null;	
      temp=reverse(head,temp);
      return temp;
	}
  
	public static LinkedListNode<Integer> reverse(LinkedListNode<Integer> head,LinkedListNode<Integer> temp) {
		
      if(head.next==null)
      {
        temp=new  LinkedListNode<Integer>(head.data);
        return temp;
      }
      temp=reverse(head.next,temp);
      LinkedListNode<Integer> node=new LinkedListNode<Integer>(head.data)  ;
      LinkedListNode<Integer> temp1=temp;
      while(temp1.next!=null)
      {
        temp1=temp1.next;
      }
      temp1.next=node;x`
      return temp;
	}
}
