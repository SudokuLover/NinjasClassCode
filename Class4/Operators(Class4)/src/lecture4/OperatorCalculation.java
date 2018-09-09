package lecture4;

import java.util.Scanner;

public class OperatorCalculation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		/*//here we have priority so can solve simply
		int a = 6 + 2 * 3;
		System.out.println(a);
		
		//here priority is same , so we will go with associativity
		//so we will solve left to right
		int b = 6 / 2 * 3;
		System.out.println(b);
		
		//we have assignment operator whose associativity is right to left
		
		*/
		
		
		/*int a=2;
		int b=3;
		
		boolean k = a + 3 > b + 1;
		System.out.println(k);
		*/
		
/*		
		//Increment Operators
		int a=10;;
		
		int b = ++a;//first increment then assign value
		int c = a++; // first assign then increment 

		System.out.println(" a : " + a);
		System.out.println(" b : " + b);
		System.out.println(" c : " + c);
*/		

/*
 * 
		//===============================================================================================================
 //this is a very good example as ++b == 20 this is dead code , will not run as first condition is true
  		int a=10;
		int b=20;
		if( ++a == 10 || ++b == 20)
		{
			System.out.println("Inside If");
		}
		else
		{
			System.out.println("Inside Else");
		}
		System.out.println(" a : " + a);
		System.out.println(" b : " + b);
*/		
/*		int a=10;
		int b=20;
		if( a++ == 10 && b++ == 20)
		{
			System.out.println("Inside If");
		}
		else
		{
			System.out.println("Inside Else");
		}
		System.out.println(" a : " + a);
		System.out.println(" b : " + b);
*/

		//===============================================================================================================
		//this is a very good example as ++b == 20 this is dead code , will not run as first condition is false
		 
		int a=10;
		int b=20;
		if( ++a == 10 && b++ == 20)
		{
			System.out.println("Inside If");
		}
		else
		{
			System.out.println("Inside Else");
		}
		System.out.println(" a : " + a);
		System.out.println(" b : " + b);

		Scanner sc = new Scanner(System.in);
		sc.reset();
	
	}

}
