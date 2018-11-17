package lecture23;
import java.util.*;
public class Solution {

	/*public static void runningMedian(int arr[]) {
		
    	
      PriorityQueue<Integer> pq=new PriorityQueue<>(); 
      for(int i=0;i<arr.length;i++)
      {

    	  for(int j=0;j<=i;j++)
          {
            pq.add(arr[j]);
          }
      	int k=i+1;
        if(k%2==0)
        {
          k/=2;
          k--;
         System.out.println(k);
          while(k>0)
          {
              System.out.println(pq.remove());
          
            k--;
          }
           int y1=pq.remove();
           int y2=pq.remove();
           System.out.println((y1+y2)/2);
           
          while(!pq.isEmpty())
          {
            pq.remove();
          }
        	
        }
        else{
          k/=2;
          int y=0;
          while(k>0)
          {
            pq.remove();
          	k--;
          }
           y=pq.remove();
   		 System.out.println(y);
   	    
         while(!pq.isEmpty())
          {
            pq.remove();
          }
	    }

      }
    
    }
*/
	/*public static void runningMedian(int arr[]) {
		
    	
	      PriorityQueue<Integer> pq=new PriorityQueue<>(); 
	      PriorityQueue<Integer> pq1=new PriorityQueue<>(); 
	      for(int i=0;i<arr.length;i++)
	      {

	    		  pq.add(arr[i]);
	          
	      	int k=i+1;
	        if(k%2==0)
	        {
	          k/=2;
	          k--;
	     //    System.out.println(k);
	          while(k>0)
	          {
	             pq1.add(pq.remove());
	          
	            k--;
	          }
	           int y1=pq.remove();
	           int y2=pq.remove();
	           System.out.println((y1+y2)/2);
	          pq1.add(y1);
	   		  pq1.add(y2);
	   		   
	          while(!pq1.isEmpty())
	          {
	            pq.add(pq1.remove());
	          }
	        	
	        }
	        else{
	          k/=2;
	          int y=0;
	          while(k>0)
	          {
	           pq1.add(pq.remove());
	          	k--;
	          }
	           y=pq.remove();
	          pq1.add(y);
	   		 System.out.println(y);
	   	    
	        while(!pq1.isEmpty())
	          {
	            pq.add(pq1.remove());
	          }
	        }

	      }
	    
	    }
*/	
	
	
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		int arr[] = new int[n];
		for(int i=0; i<n; i++){
			arr[i] = s.nextInt();
		}
	
		
	
		//runningMedian(arr);
	}
}
