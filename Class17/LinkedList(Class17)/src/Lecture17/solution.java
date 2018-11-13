package Lecture17;

/*
class Node<T> {
	public T data;
	public Node<T> next;

	public Node(T data) {
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
public class solution {
	
	public static Node<Integer> reverse_R(Node<Integer> head) {
	Node<Integer>  temp=null;	
      temp=reverse(head,temp);
      return temp;
	}
  
	public static Node<Integer> reverse(Node<Integer> head,Node<Integer> temp) {
		
      if(head.next==null)
      {
        temp=new  Node<Integer>(head.data);
        return temp;
      }
      temp=reverse(head.next,temp);
      Node<Integer> node=new Node<Integer>(head.data)  ;
      Node<Integer> temp1=temp;
      while(temp1.next!=null)
      {
        temp1=temp1.next;
      }
      temp1.next=node;
      return temp;
	}
}
