package class2_Code;

import java.util.Scanner;

public class CalculateSimpleInterest {

	public static void main(String[] args) {
		
		//int principle=1000;
		
		int principle;
		principle=1000;
		int rate=20;
		int time=2;
		
		
		
		//calculating simple interest 
		
		int simpleInterest= (principle * rate * time)/100 ;
		System.out.println(simpleInterest);

	
		//int p;
		//giving error => initialize local variable before its use
		//System.out.println(p);
	
		
		
		
	   //Lets Read Value from console

		Scanner sc = new Scanner(System.in);
		
		//principle
		System.out.println("Enter Principle");
		int p = sc.nextInt();
		//rate
		System.out.println("Enter Rate");
		int r= sc.nextInt();
		//time
		System.out.println("Enter Time");
		int t= sc.nextInt();
		//Simple Interest
		int si=(p*r*t)/100;
		
		System.out.println(si);
		
	
	}

}
