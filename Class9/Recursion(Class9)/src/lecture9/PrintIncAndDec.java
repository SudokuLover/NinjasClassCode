package lecture9;

import java.util.Scanner;

//4
public class PrintIncAndDec {
	public static void printIncrasingAndDecreasing(int n){
		
		if(n==0)
			return ;
		System.out.println(n);
		printIncrasingAndDecreasing(n-1);

		System.out.println(n);
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc= new Scanner(System.in);
		printIncrasingAndDecreasing(sc.nextInt());

	}

}
