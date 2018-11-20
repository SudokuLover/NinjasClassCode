package debugging;

public class Debugging5 {

	public static int factorial(int n)
	{
		if(n==0)
			return 1;
		
		int smallAns=factorial(n-1);
		int result=n*smallAns;
		return result;
	}
	public static void main(String[] args) {
		System.out.println("first line--main");
		System.out.println(factorial(4));
		System.out.println("last line--main");

	}
	
}
