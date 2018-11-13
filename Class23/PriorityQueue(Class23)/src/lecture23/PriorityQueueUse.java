package lecture23;

public class PriorityQueueUse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int []arr={8,10,9,6,4,1,98,100};
		//MinPriorityQueueByMaam pq=new MinPriorityQueueByMaam();
		//MinPriorityQueue pq=new MinPriorityQueue();
		MaxPriorityQueue pq=new MaxPriorityQueue();
		
		for(int val:arr)
		{
			pq.insert(val);
			
	//		pq.print();
		}
			
		try{
			while(!pq.isEmpty())
			{
				//System.out.println(pq.removeMin());
				System.out.println(pq.delete());

		//		pq.print();
			}
		}
		catch(PriorityQueueException e){
			e.printStackTrace();
		}
	}

}
