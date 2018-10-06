package lecture12;

import java.util.Scanner;

public class LexicographicalOrder {

	public static void lexicographical(int k,int n){
		if(k>n)
			return ;
		for(int i=k;i<=k+9;i++)
		{
								if((i)%10==0 && i==(k+9))
									return ;
				if(i<=n)
				{
				System.out.println(i);
				lexicographical(i*10,n);
				}
		}
		return ;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		lexicographical(1,n);
	}

}
