package lecture23;

import java.util.ArrayList;

public class MaxPriorityQueue {

private  ArrayList<Integer> heap;
	
	public MaxPriorityQueue(){
		heap= new ArrayList<>();
	}
	public boolean isEmpty()
	{
		return heap.size()==0;
	}
	public void insert(int data){
		heap.add(data);
		insertHeapify(heap.size()-1);
	}
	public int delete() throws PriorityQueueException {
		if(isEmpty())
		{
			throw new PriorityQueueException("no data");
		} 
		int data=heap.get(0);
		heap.set(0,heap.get(heap.size()-1));
		heap.remove(heap.size()-1);
		if(heap.size()>0)
			deleteHeapify(0);
		return data;
	}

	private void insertHeapify(int index){
		if(index==0)
			return ;
		
		int temp=(index-1)/2;
		
		if(heap.get(temp)<heap.get(index))
		{
			swap(temp,index);
			insertHeapify(temp);
		}
		return ;
	}
	public int getMin() throws PriorityQueueException{
		if(isEmpty())
		{
			throw new PriorityQueueException("no data");
		}
		
		return heap.get(0);
	}
	
	private void deleteHeapify(int index){
		
		int leftChildIndex=2*index+1;
		int rightChildIndex=2*index+2;
		

		if(leftChildIndex>=heap.size())
			return;
		
		int minIndex=index;
		if(heap.get(leftChildIndex)>heap.get(minIndex))
			minIndex=leftChildIndex;
		if((rightChildIndex<heap.size()-1) && heap.get(rightChildIndex)>heap.get(minIndex))
			minIndex=rightChildIndex;
		
		if(minIndex!=index)
		{
			swap(index,minIndex);
			
			deleteHeapify(minIndex);
		}
		return ;

		
	}
	private void swap(int i,int j){
		int data=heap.get(i);
		heap.set(i,heap.get(j));
		heap.set(j,data);		
	}
	public void print(){
		System.out.println();
		for(int var : heap)
			System.out.print(var+" ");
		System.out.println();
	}
}
