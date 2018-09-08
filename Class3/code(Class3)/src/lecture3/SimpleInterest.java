package lecture3;

import java.util.Scanner;

public class SimpleInterest {

	public static int isCalculation(int p, int r, int t)
	{

		int si=(p*r*t)/100;
		return si;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		int p = sc.nextInt();
		int r= sc.nextInt();
		int t= sc.nextInt();
		
		int si=isCalculation(p,r,t);
		
		System.out.println(si);
		

	}

}
