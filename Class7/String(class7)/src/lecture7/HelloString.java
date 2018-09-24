package lecture7;

import java.util.Scanner;

public class HelloString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*String str="Hello";
		String str1="Hello";
		String str2=new String("Hello");
		System.out.println(str1==str);
		System.out.println(str1==str2);
		*/
		
/*		String str1 ="Hello";
		String str2="Hello";
		System.out.println(str1==str2);
		str1="abc";
		System.out.println(str1==str2);
		
		char ch = str1.charAt(1);
		
		System.out.println(ch);
		
		int n=str2.length();
		System.out.println(n);
		
		str2="Hello World";
		
		System.out.println(str2.substring(2, 9));
		
		System.out.println(str2.substring(2));
		
*/		
		 
/*
		String s="abcd";
		String s1="ghi";
		String s3=s+s1;
		
		System.out.println(s3);
		
		s3=s.concat(s3);
		System.out.println(s3);
		
*/	
		
	/*	Scanner sc = new Scanner(System.in);
		//String str=sc.next();
		String str=sc.nextLine();
		System.out.println(str);
*/
		Scanner sc = new Scanner(System.in);
		String str=sc.next();
		int k=0;
		for(int i=0;i<str.length()/2;i++)
		{
			if(str.charAt(i)!=str.charAt(str.length()-i-1))
				k=1;
		}
		if(k==0)
			System.out.println("pallindrome");
		else
			System.out.println("not a pallindrome");
			
		
	}
	
		
}
