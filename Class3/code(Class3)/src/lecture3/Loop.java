package lecture3;
import java.util.*;
public class Loop {
	
	public static void main(String args[])
	{
	
		Scanner sc = new Scanner(System.in);
	
		int n=sc.nextInt();
		/*	for(int i=1;i<n;i++)
			{
			System.out.println("hi");
			
				return ;
			}
			System.out.println("bye");
		*/
			

		/*System.out.println("hi");
		for(int i=1;i<n;i++)
		{	
			if(i==4)
				break;

			System.out.println(i);
		
		}
		System.out.println("bye");
		*/
	

		System.out.println("hi");
		for(int i=1;i<n;i++)
		{	
			if(i==4)
				continue;

			System.out.println(i);
		
		}
		System.out.println("bye");
		
	
		
	}

}
