package debugging;

import java.util.Scanner;

public class Debugging1 {
	public static void main(String[] args) {
	
		Scanner sc=new Scanner(System.in);
		int marks=sc.nextInt();
		
		if(marks>90)
			System.out.println("A+");
		else if(marks<=90 && marks>80)
			System.out.println("A");
		else if(marks<=80 && marks>70)
			System.out.println("B+");
		else if(marks<=70 && marks>60)
			System.out.println("B");
		else//if(marks<=60 && marks>50)
			System.out.println("C");
		
		System.out.println("Bye");

	
	}
}
