package lecture20;

public class Queue<T> {
	private T data[];
	private int front;
	private int rear;
	private int size;
	
	public Queue(){
		data=(T[])new Object[1000];
		front=-1;
		rear=-1;
		size=0;
	}
	public Queue(int capacity){
		data=(T[])new Object[capacity];
		front=-1;
		rear=-1;
		size=0;
	}
	public boolean isFull(){
		return getSize()==data.length;
	}
	public int getSize(){
		return size;
	}
	public boolean isEmpty(){
		return getSize()==0;
	}
	
	public void enqueue(T element){
		if(isFull())
		{
			//Throw Error
			return ;
		}
		if(front==-1)
		{
			front=0;
		}
		rear=(rear+1)%data.length;
		data[rear]=element;
		size++;
	}
	public T dequeue(){
		if(isEmpty())
		{
			//Throw Error
			return null;
		}
		T val=data[front];
		
		front=(front+1)%data.length;
		size--;
		if(size==0)
		{
			front=-1;
			rear=-1;
		}
		return val;
	}
	public T front(){
		if(isEmpty())
			return null;
	
		T val=data[front];
		//front=(front+1)%data.length;
		return val;
	}
	
	
}
