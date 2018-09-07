package class2_Code;

import java.util.*;
import java.lang.*;
import java.io.*;

public class Practice {

	public static void main(String[] args) {
		  Scanner sc = new Scanner(System.in);
		    int t=sc.nextInt();
		    while(t>=0)
		    {
		        t--;
		        String n = sc.nextLine();
		        n=n.toLowerCase();

		        
		        char ch[]=n.toCharArray();
		        
		        int start=0 , end=n.length()-1;
		        char a,b;
		        int k=0;
		        while(start<=end)
		        {
		                a=ch[start];
		                b=ch[end];
		 
		            if( a>=97 && a<=122 )
		            {
		                
		            }
		            else{
		                start++;
		                continue;
		            }
		            
		            if( b>=97 && b<=122 )
		            {
		                
		            }
		            else{
		                end--;
		                continue;
		            }
		            
		            if(a==b)
		            {
		                continue;
		            }
		            else{
		                k=1;
		                break;
		            }
		            
		        
		            
		        }
		        
		        if(k==0)
		        {
		            System.out.println("YES");
		        }
		        else{
		            System.out.println("NO");
		        }
		        
		    }
	}

}
