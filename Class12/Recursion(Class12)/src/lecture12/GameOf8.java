package lecture12;

import java.util.Scanner;

/*Given non negative int n, compute recursively(no loops) the count of the occurrence of 8 as a digit,
 except that an 8 with another 8 immediately to its left counts double , so 8818 yields 4
 
 eg count8(818) -> 2
 eg count8(8818)-> 4
 */
public class GameOf8 {
	
	public static int count(int n){
		
		if(n==0)
			return 0;
		if(n==8)
			return 1;
		
		int k=0;
			
		 if(n%10==8)
		{
			if(n%100==88)
				k=2*count(n/10);
			else
				k=1+count(n/10);
		}
		else{
			return count(n/10);
		}
		return k;
	}
	
	public static int reverse(int n){
		int k=0;
		
		while(n>0)
		{
			k=10*k+n%10;
			n=n/10;
		}
		return k;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		n=reverse(n);
		System.out.println(count(n));
	
		sc.close();
	}

}
