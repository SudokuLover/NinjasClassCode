package class2_Code;
import java.util.Scanner;

public class CheckingPrime {


		public static void main(String[] args) {
			Scanner sc = new Scanner(System.in);
			
			int n=sc.nextInt();
			
			int i=2;
			int k=0;
			
			while(i<n)
			{
			
				if(n%i==0)
				{
					System.out.println("Not A Prime");
					k=1;
					break;
				}
					i++;
			}
			
			if(k==0)
				System.out.println("Number is a Prime");

	}

}
