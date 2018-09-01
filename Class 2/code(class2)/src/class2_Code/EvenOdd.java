package class2_Code;

import java.util.Scanner;

public class EvenOdd {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in); 
		int num = sc.nextInt();
		
		if( num % 2 == 0)
			System.out.println("Given Number is even");
		else
			System.out.println("Given Number is odd");
		
		/*//optimizing code using bit operator
		if( ( num & 1 ) == 0)
			System.out.println("Given Number is even");
		else
			System.out.println("Given Number is odd");
	
		*/
		
		System.out.println("Get Lost");
		
		sc.close();
	}

}
