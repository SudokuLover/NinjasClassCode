package lecture12;

import java.util.Scanner;

/*we have rabbits standing in a line numbered 1,2,.. .. the odd  bunnies (1,3,5..) have normal 2 ears. the even bunnies  (2,4,6..)
have 3 ears . Recursively return the number of ears in the bunny line 1,2,...,n (no loops,no multiplication)*/
public class ReturnBunnyEar {

	public static int count(int n){
		
		if(n==0)
			return 0;
		int y=0;
		if(n%2==0)
		{
			y=3;
		}
		else{
			y=2;
		}
		int k=y+count(n-1);
		return k;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		System.out.println(count(n));
	
		sc.close();
	}

}
