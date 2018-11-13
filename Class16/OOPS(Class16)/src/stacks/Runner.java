package stacks;

import java.util.Scanner;
//import java.util.EmptyStackException;

class Node<T> {
	T data;
	Node next;

	public Node(T data) {
		this.data = data;
	}
}

public class Runner {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);

		//Stack<Integer> st = new Stack<Integer>();
		Stack st = new Stack();

		int choice = s.nextInt();
		int input;

		while (choice !=-1) {
			if(choice == 1) {
				input = s.nextInt();
				st.push(input);
			}
			else if(choice == 2) {
				System.out.println(st.pop());
			}
			else if(choice == 3) {
				try {
					System.out.println(st.top());
				} catch (StackEmptyException e) {
					System.out.println(-1);
				}
			}
			else if(choice == 4) {
				System.out.println(st.getSize());
			}
			else if(choice == 5) {
				System.out.println(st.isEmpty());
			}
			choice = s.nextInt();
		}
	}
}
/* class Stack<T> {
	private T data[];
  	private int top;
	public Stack() {
		data=(T[])new Object[100];
      	top=-1;
	}
	
	public int size() {
		return top+1;
	}
  
  	private boolean isFull(){
      return size()==data.length;
    }
	
	public void push(T data1) {
		if(isFull())
          return ;
      data[++top]=data1;
	}
	
	public boolean isEmpty() {
		return size()==0;
	}
	
	public T pop() throws StackEmptyException {
		if(isEmpty())
          throw new StackEmptyException("stack is empty");
      return data[top--];
	}
	
	public T top() throws StackEmptyException {
		if(isEmpty())
              throw new StackEmptyException("stack is empty");
      return data[++top];
	}
}
*/class StackEmptyException extends Exception {
	  String s;

	  public StackEmptyException(String s){
	    this.s = s;
	  }
	 public String toString(){
		 return s;
	 }
}