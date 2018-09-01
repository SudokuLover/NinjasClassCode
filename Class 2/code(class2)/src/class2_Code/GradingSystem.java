package class2_Code;

import java.util.Scanner;

public class GradingSystem {

	public static void main(String[] args) {
		
		Scanner sc= new Scanner(System.in);
		
		int marks = sc.nextInt();
		
		if(marks>90)
			System.out.println("A+");
		/*if(marks>80 && marks<=90)
			System.out.println("A");
		*/
		else if(marks>60)
			System.out.println("B+");
		else if(marks>33)
			System.out.println("Just Passed");
		else
			System.out.println("Failed");
		
		
		System.out.println("Bhag Jap ab");

	}

}
