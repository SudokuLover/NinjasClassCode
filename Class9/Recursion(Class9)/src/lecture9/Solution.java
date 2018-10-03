package lecture9;

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
