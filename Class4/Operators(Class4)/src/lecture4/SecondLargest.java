import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {
		// Write your code here
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int a=0;
		int b=Integer.MIN_VALUE;
		int t=0;
		if(n>=1)
		{
			a=sc.nextInt() ;
			b=Integer.MIN_VALUE;
			
			for(int i=0;i<n-1;i++)
			{
				int k=sc.nextInt();
              
              if(b==Integer.MIN_VALUE)
              {
                if(a>k)
                  b=k;
              }
				if(a<k)
				{
					b=a;
					a=k;
				}
			}
				
		}
		else{
			t=1;
			System.out.println(b);
		}
		
		if(t==0)
		{
			System.out.println(b);	
		}

	}
}