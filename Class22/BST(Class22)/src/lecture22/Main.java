package lecture22;

import java.util.*;

public class Main {

	
	public static void main(String[] args) {
		
      Scanner sc = new Scanner(System.in);
      
      int n=sc.nextInt();
      int k=sc.nextInt();     
      int p=sc.nextInt();

      int a[][]=new int[n][n];
      
      for(int i=0;i<k;i++)
      {
          int r=sc.nextInt();
	      int c=sc.nextInt();     
    	  int p1=sc.nextInt();

        a[r-1][c-1]=p1;
      }
     
      for(int i=0;i<p;i++)
      {
          int r1=sc.nextInt();
	      int c1=sc.nextInt();     
    	  int r2=sc.nextInt();
	      int c2=sc.nextInt();       
         a[r2-1][c2-1]= a[r1-1][c1-1];
      		 a[r1-1][c1-1]=0;
        int sum=0;
        
        for(int i1=0;i1<n;i1++)
        {
          for(int j=0;j<n;j++)
          {
			int l=calculate(i1,j,a);	
            if(l>0)
              sum++;
          }
        }
        System.out.println(sum);
      }
      
     /* for(int i=0;i<n;i++)
      {
        for(int j=0;j<n;j++)
        {
          
          System.out.print(a[i][j]);
        }  
      }
      */
	}
  
  public static int calculate(int a1,int b, int [][]a){
    int sum=0;
	//System.out.println("for index"+a1+" "+b);
	    
    for(int i=0;i<a.length;i++)
    {
      if(a[a1][i]!=0 && i!=b)
      {
   // 	 System.out.println("row : "+a1+" "+i+" "+a[a1][i]+" "+sum);
    	    
        sum^=a[a1][i];
      }
    }
    for(int i=0;i<a.length;i++)
    {
      	//System.out.println(b+" "+i);
     	 
      if(a[i][b]!=0 && i!=a1)
      {
     //      System.out.println("column: "+i+" "+b+" "+a[i][b]+" "+sum);
    
        sum^=a[i][b];
      }
    }
   // System.out.println("sum "+sum);
    return sum;
  }
}