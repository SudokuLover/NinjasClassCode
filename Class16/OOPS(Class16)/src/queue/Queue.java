package queue;

public class Queue1 {
	private int data[];
	private int front;
	private int rear;
	private int size;
	
	public Queue(){
		data=new int[5];
		front=-1;
		rear=-1;
		size=0;
	}
	public Queue(int capacity){
		data=new int[capacity];
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
	
	public void enqueue(int element){
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
	public int dequeue(){
		if(isEmpty())
		{
			//Throw Error
			return -1000;
		}
		int val=data[front];
		
		front=(front+1)%data.length;
		size--;
		if(size==0)
		{
			front=-1;
			rear=-1;
		}
		return val;
	}
	public int front(){
		if(isEmpty())
			return -1000;
	
		int val=data[front];
		//front=(front+1)%data.length;
		return val;
	}
	
	
}
