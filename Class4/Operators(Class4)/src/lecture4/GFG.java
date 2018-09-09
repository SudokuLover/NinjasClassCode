package lecture4;

import java.util.*;
import java.lang.*;
import java.io.*;
class GFG
 {
	public static void main (String[] args)
	 {
	 
	    Scanner sc = new Scanner(System.in);
	    int t=sc.nextInt();
	    while(t>0)
	    {
	        int n = sc.nextInt();
	         int x = sc.nextInt();
	        int y = sc.nextInt();
	        int x1=0;
	        int y1=0;
	        int tip=0;
	        int a[]= new int[n];
	        int b[]= new int[n];
	        
	        for(int i=0;i<n;i++)
	        {
                a[i]=sc.nextInt();	            
	        }
	        for(int i=0;i<n;i++)
	        {
                b[i]=sc.nextInt();	            
	        }
	        for(int i=0;i<n;i++)
	        {
                if(a[i]>b[i])
                {
                    tip+=a[i];

                   // System.out.println(tip+" "+a[i]);
                    b[i]=0;
                    a[i]=0;

                    //System.out.println(tip+" "+a[i]);
                    x1++;
                }
                if(x1==x)
                {
                    break;
                }
	        }
	        if(x1<x)
	        {
	             for(int i=0;i<n;i++)
	        {
                if(a[i]==b[i] && a[i]!=0  )
                {
                    tip+=a[i];

                   // System.out.println(tip+" "+a[i]);
                    a[i]=0;
                    b[i]=0;
                   // System.out.println(tip+" "+a[i]);
                    
                    x1++;
                }
                if(x1==x)
                {
                    break;
                }
	        }
	            
	        }
	        for(int i=0;i<n;i++)
	        {
                if(b[i]>a[i])
                {
                    tip+=b[i];

                    //System.out.println(tip+" "+b[i]);
                    a[i]=0;
                    b[i]=0;
                  //  System.out.println(tip+" "+b[i]);
                    
                    y1++;
                }
                if(y1==y)
                {
                    break;
                }
	        }
	        
	        if(y1<y)
	        {
	             for(int i=0;i<n;i++)
	            {
                    if(a[i]==b[i] && a[i]!=0)
                    {
                        tip+=b[i];

               //         System.out.println(tip+" "+b[i]);
                        a[i]=0;
                        b[i]=0;
                 //       System.out.println(tip +" "+b[i]);
                        
                        y1++;
                    }
                 if(y1==y)
                    {
                        break;
                    }
    	      }
	        }  
	        

	        if(x1<x)
	        {
	        	Arrays.sort(a);

	        	 for(int i=n-1;i>=0;i--)
		            {
	                    
	        	        System.out.println(a[i]);
	              }
		        
	        	 
	        	 for(int i=n-1;i>=0;i--)
		            {
	                    
	        		 tip+=a[i];
	                    x1++;
	                    System.out.println(a[i]);
	                 if(x1==x)
	                    {
	                        break;
	                    }
	    	      }
		        	
	        	
	        }
	        if(y1<y)
	        {
	        	Arrays.sort(b);
	        	 for(int i=n-1;i>=0;i--)
		            {
		        		 tip+=b[i];
		        		 
		                    y1++;
		                 
	        		 if(y1==y)
	                    {
	                        break;
	                    }
	    	      }
		        	
	        	
	        }
	        
	        System.out.println(tip);
	        //System.out.println(x1 + " "+ y1);
            
	        t--;
	    }
	 }
}