package lecture9;
//2
import java.util.Scanner;

public class PrintIncreasing {
	public static void printIncreasing(int n){
		
		if(n==0)
			return ;
		printIncreasing(n-1);
		System.out.println(n);
			
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc= new Scanner(System.in);
		printIncreasing(sc.nextInt());

	}


}
