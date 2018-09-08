package lecture3;

public class Scope {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		int a=10;
		double a=100 ;
		
		//not allowed to redefine same variable

		
		/*if(a<=10)
		{
			int b=20;
		}
		else{
			int b=30;
		}
		
		System.out.println(b);
		
		//you will get an error as b is out of scope
		*/
		
		
		/*int i=1;
		while(i<=5)
		{
			int a=10;
			System.out.println(a);
			
			a=a+1;
			i=i+1;
		}
		*/
		
		for(int i=1;i<=5;i++)
		{
			System.out.println(i);
			int a=10;
		}
	}

}
