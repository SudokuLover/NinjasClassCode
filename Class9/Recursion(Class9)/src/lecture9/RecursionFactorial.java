package lecture9;

import java.util.Scanner;
//1
public class RecursionFactorial {

	public static int factorial(int n){
		
		if(n==0)
			return 1;
		
		int smallAns=factorial(n-1);
		int result=n*smallAns;
		return result;
		
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc= new Scanner(System.in);
		System.out.println(factorial(sc.nextInt()));
	}

}
