package lecture23;

public class HeapSort {
	public static void main(String args[])
	{
		int []arr={8,10,9,6,4,1,98,100};
		
		MaxPriorityQueue pq=new MaxPriorityQueue();
		for(int val:arr)
		{
			System.out.print(val+" " );	
		}
		System.out.println();
		for(int val:arr)
		{
			pq.insert(val);	
		}
		int i=0;
		try{
			while(!pq.isEmpty())
			{
				arr[i++]=pq.delete();
			}
		}
		catch(PriorityQueueException e){
			e.printStackTrace();
		}

		for(int val:arr)
		{
			System.out.print(val+" " );	
		}
	}
}
