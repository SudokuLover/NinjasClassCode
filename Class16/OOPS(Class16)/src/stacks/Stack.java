package stacks;

public class Stack {
	private int []data;
	private int top;
	
	public Stack(){
		data=new int[5];
		top=-1;
	}
	public Stack(int capacity)
	{
		data=new int[capacity];
		top=-1;
	}
	public int getSize(){
		return top+1;
	}
	public boolean isFull(){
	/*	if(data.length==getSize())
			return true;
		else
			return false;
	*/
		return getSize()==data.length; 
	}
	
	public int peek(){
		if(isEmpty())
			return -1000;
		return data[top];
	}
	
	public boolean isEmpty(){
		return getSize() == 0;
	}
	
	public void push(int element){
		if(isFull()){
			//throw some error 
			return ;
		}
		data[++top]=element;
	}
	public int pop(){
		if(isEmpty()){
			//throw some error 
			return -1000;
		}
		int element=data[top--];
		return element;
	}
	
}
