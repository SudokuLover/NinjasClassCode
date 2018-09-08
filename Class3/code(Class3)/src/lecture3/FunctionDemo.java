package lecture3;

public class FunctionDemo {

	public static void printPattern(int n)
	{
		for(int i=1;i<=n;i=i+1)
		{
			for(int j=1;j<=i;j=j+1)
			{
				System.out.print("* ");
			}

			System.out.println();
		}
	}

	
	public static void main(String args[])
	{
		int n=5;	
		printPattern(n);
		printPattern(n);
		printPattern(n);
		
	}
}
