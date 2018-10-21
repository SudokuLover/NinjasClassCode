package Lecture17;
// Don't place your source in a package
import java.util.*;
import java.lang.*;
import java.io.*;

// Please name your class Main
class Main {
	public static void main (String[] args) throws java.lang.Exception {
	    Scanner in = new Scanner(System.in);
		int a = in.nextInt();
	    
	    for(int i=0;i<a;i++)
	    {
	            int n = in.nextInt();
	        	int l = in.nextInt();
	        if(l==0)
	        {
	            System.out.println("!OK");
	            continue;
	        }
	        int s[]  = new int[l];
	        for(int j=0;j<l;j++)
	        {
	            s[j]=in.nextInt();
	        }
	        ArrayList<Integer> al=new ArrayList<Integer>();
	        print(s,0,0,n,al);
	    }
	}
	public static void print(int s[],int i,int sum,int n,ArrayList<Integer> a)
	{
	    /*if(i>=s.length)
	        return ;*/
	    if(sum==n)
	    {
	            for(int j=0;j<a.size();j++)
	        {
	            System.out.print(a.get(j)+" ");
	       }
	            System.out.println();
	            return ;
	       
	    }
	    if(sum!=n && i==s.length)
	    {
	                  System.out.println("!OK");
	                  return ;
	    }
	    
	    print(s,i+1,sum,n,a);
	    a.add(s[i]);
	    print(s,i+1,sum+s[i],n,a);
	}
}