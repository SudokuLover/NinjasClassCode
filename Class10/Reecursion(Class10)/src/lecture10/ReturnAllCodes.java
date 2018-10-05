package lecture10;

import java.util.Scanner;

public class ReturnAllCodes {
	// Return a string array that contains all possible codes
	public static  String[] getCode(String input){
		// Write your code here
		String [] arr=print(input,"");
      return arr;
	}
   public static String[] print(String input, String output)
  {
    if(input.length()==0)
    {
      String []a={output};
      return a;
    }
    else{
      String[]a;
        String[]b=null;
      
      char ch=(char)((input.charAt(0)-'0')+96);
      a=print(input.substring(1),output+ch);
     	if(input.length()>=2)
        {
          int a1=input.charAt(0)-'0';
          int b1=input.charAt(1)-'0';
          int c1=10*a1+b1;
          ch=(char)(c1+96);
         if(c1<=26)
          {
      		b=print(input.substring(2),output+ch);
          }
        }
      
      int k=0;
    if(b!=null)
    {
    	String c[]=new String[a.length+b.length];
        for(int i=0;i<a.length;i++)
        {
          c[k++]=a[i];
        }
        for(int i=0;i<b.length;i++)
        {
          c[k++]=b[i];
        }
        return c;
     
    }
    else{
    	return a;
    }
    
    }
  }

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		String input = s.next();
		String output[] = getCode(input);
		for(int i = 0; i < output.length; i++) {
			System.out.println(output[i]);
		}
	}
}
