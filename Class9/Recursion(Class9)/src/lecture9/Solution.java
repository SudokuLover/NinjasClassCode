package lecture9;

import java.util.Scanner;

public class Solution {

	public static String removeConsecutiveDuplicates(String input) {
		// Write your code here
		  String s="";
	      if(input.length()==1 || input.length()==0)
	          return input;
	      
	      if(input.charAt(0)==input.charAt(1))
	      {
	        int k=1;
	        while(input.charAt(0)==input.charAt(k))
	        {
	         // System.out.println(input.charAt(k));
	     		     k++;  
	          if(k==(input.length()-1))
	          {
	           //k++;
	           
	           if(input.charAt(0)==input.charAt(k))
	        	   k++;
	           
	      		      	break;      
	          }
	          
	        }
	       
	          //System.out.println(input.charAt(k));
	        s=input.charAt(0)+removeConsecutiveDuplicates(input.substring(k));
	      }
	      else{
	        s=input.charAt(0)+removeConsecutiveDuplicates(input.substring(1));   
	      }
	      return s;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		String s=sc.next();
		String s1=removeConsecutiveDuplicates(s);
		System.out.println(s1);
	}

}
/*package lecture9;

import java.util.Scanner;

public class Solution {
	public static String removeX(String input){
		// Write your code here
      String s="";
      if(input.length()==0)
        return "";

     // System.out.println(input.charAt(0));
      if(input.charAt(0)=='x'){
        //s=removeX(s.substring(1,input.length()));
       s=removeX(s.substring(1));
      }
      else{
        s= input.charAt(0)+removeX(s.substring(0));
      }		
      return s;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		String s=sc.next();
		String s1=removeX(s);
		System.out.println(s1);
	}

}
*/