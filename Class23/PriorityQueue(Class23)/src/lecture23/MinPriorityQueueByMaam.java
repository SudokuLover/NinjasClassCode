package lecture23;
import java.util.ArrayList;

public class MinPriorityQueueByMaam {
private  ArrayList<Integer> heap;
	
	public MinPriorityQueueByMaam(){
		heap= new ArrayList<>();
	}
	public boolean isEmpty()
	{
		return heap.size()==0;
	}
	public void insert(int data){
		heap.add(data);
		int  childIndex=heap.size()-1;
		int parentIndex=(childIndex-1)/2;
		
		while(childIndex>0){
			if(heap.get(childIndex)<heap.get(parentIndex))
			{
				swap(childIndex,parentIndex);
				//int temp=heap.get(childIndex);
				//heap.set(childIndex,heap.get(parentIndex));
				//heap.set(parentIndex,temp);		
				childIndex=parentIndex;
				parentIndex=(childIndex-1)/2;
			}
			else{
				break;
			}
			
		}
	}
	public int getMin() throws PriorityQueueException{
		if(isEmpty())
		{
			throw new PriorityQueueException("no data");
		}
		return heap.get(0);
	}
	
	public int removeMin() throws PriorityQueueException{
		if(isEmpty())
		{
			throw new PriorityQueueException("no data");
		}
		int data=heap.get(0);
		heap.set(0, heap.get(heap.size()-1));
		heap.remove(heap.size()-1);
		
		if(heap.size()>1)
		{
			downHeapify(0);
		}
		
		return data;
	}
	private void downHeapify(int i){
		
		int leftChildIndex =2 * i +1;
		int rightChildIndex =2 * i +2;

		if(leftChildIndex>=heap.size())
			return;
		
		int minIndex=i;
		if(heap.get(leftChildIndex)<heap.get(minIndex))
			minIndex=leftChildIndex;
		if((rightChildIndex<heap.size()-1) && heap.get(rightChildIndex)<heap.get(minIndex))
			minIndex=rightChildIndex;
		
		if(minIndex!=i)
		{
			swap(i,minIndex);
			
			downHeapify(minIndex);
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
