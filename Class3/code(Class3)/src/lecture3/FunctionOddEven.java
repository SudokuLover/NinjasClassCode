package lecture3;

import java.util.*;
public class FunctionOddEven {

	public static boolean checkEvenOdd(int n){
		boolean isEven=false;
		if(n%2==0)
			isEven=true;
		return isEven;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		int n=sc.nextInt();
		System.out.println(checkEvenOdd(n));
	}

}
