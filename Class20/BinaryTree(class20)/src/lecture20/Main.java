package lecture20;
import java.util.Scanner;
import java.lang.*;

public class Main {
    
    public static void main(String[] args) {
        /* Your class should be named Main.
         * Read input as specified in the question.
         * Print output as specified in the question.
         */
        
        // Write your code here
      Scanner sc = new Scanner(System.in);
      	int n=sc.nextInt();
      int a[]=new int[n];
      	for(int i=0;i<n;i++)
        {
          a[i]=sc.nextInt();
        }
        long p= (long)Math.pow(2,n);
      
      int A=0;
      int B=0;
      p=p-2;
      while(p>0)
      {
       	long k=p;
       	int i=n-1;
        while(k>0)
        {
          if((k&1)==0)
          {
        	  System.out.println(i+" "+k);
            A+=a[i];
          }
          else{
        	  B+=a[i];
          }
          k=k>>1;
          i--;
        }
        if((Math.abs(A-B))%3==0)
        {
        	System.out.println(A+" A:B "+B);
        	System.out.println("Aahad");
        	return ;
        }
        A=0;
        B=0;
        p--;
      }
      	System.out.println("Harshit");
    
    }
    
}
