package class2_Code;

import java.util.Scanner;

public class Package {

	public static void main(String[] args) {
		
	/*	Scanner sc = new Scanner(System.in);
		
		String str=sc.next();
		
		System.out.println(str);
*/
		
		//===========================================================
		
		
		
		
		/* int x = 5; 
	        if (x < 6)
	            System.out.print("Hello  ");
	        if(x == 5){
	            System.out.print("Hi  ");
	        }
	        else{ 
	            System.out.print("Hey ");
	        } */
	

		//===========================================================
		
		
		
		/*
		 int x = 15;
		    if(x <= 15){
		        System.out.print("Inside if  ");
		    }else if(x == 15){
		        System.out.print("Inside else if  ");
		    }
		    System.out.println(x);*/
	/*
		  int var1 = 5; 
	        int var2 = 6;
	        if ((var2 = 1) == var1)
	            System.out.print(var2);
	        else 
	            System.out.print(var2 + 1);*/
	

		//===========================================================
		
		
		
		
/*		int a = 10, b = 20, c = 100;

	    if(a <= b || c <= b) {
	        System.out.println("hello");
	    }
	    else if(a <= b || a <= c) {
	        System.out.println("hi");
	    }
	    else {
	        System.out.println("hey");
	    }*/
		
		

		//===========================================================
		
		
		
		
/*        int a = 10, b = 20, c = 100;

        if(a <= b && b != 20) {
            System.out.println("hello");
        }
        else if(c >= a && c >= b) {
            System.out.println("hi");
        }
        else {
            System.out.println("hey");
        }*/

		
		//===========================================================

		
		
/*		Scanner sc = new Scanner(System.in);
      	char ch = sc.next().charAt(0);

      	int sum=0;
		
      	for(int i=0;i<3;i++)
		{
			int k=sc.nextInt();
			sum+=k;
		}
      	sum/=3;
      	System.out.println(ch);
      	System.out.println(sum);
*/

		//===========================================================
		
		
		
		
		/*Scanner sc = new Scanner(System.in);
		 int n = sc.nextInt();
		 for(int i=1;i<=n;i++)
		 {
			 int k=i;
			 for(int j=1;j<=i;j++)
			 {
				 System.out.print(k);
				 k++;
			 }
			 System.out.println();
		 }
*/	

		//===========================================================
		
		
	
		/*Scanner sc = new Scanner(System.in);
		 int n = sc.nextInt();
		 for(int i=1;i<=n;i++)
		 {
			 for(int l=n;l>i;l--)
				 System.out.print(" ");
			 int k=i;
			 for(int j=1;j<=i;j++)
			 {
				 System.out.print(k);
				 k++;
			 }
			 System.out.println();
		 }*/
		

		//===========================================================
		
		
	/*	Scanner sc = new Scanner(System.in);
		 int n = sc.nextInt();
		 for(int i=1;i<=n;i++)
		 {
			 for(int j=n;j>i;j--)
				 System.out.print(" ");
			 int k=i;
			 for(int j=1;j<=i;j++)
			 {
				 System.out.print(k);
				 k++;
			 }
			 k=k-2;
			 for(int j=i;j>1;j--)
			 {
				 System.out.print(k);
				 k--;
			 }
			
			 System.out.println();
		 }*/
		

		//===========================================================
		
		
		
	/*	Scanner sc = new Scanner(System.in);
		 int n = sc.nextInt();
		 for(int i=1;i<=n;i++)
		 {
			 for(int j=n;j>i;j--)
				 System.out.print(" ");
			
			 for(int j=1;j<=i;j++)
			 {
				 System.out.print("*");
			 }
			 for(int j=i;j>1;j--)
			 {
				 System.out.print("*");
			 }
			 System.out.println();
		 }*/
		
		
		//===========================================================
		
		/*Scanner sc = new Scanner(System.in);
		 int start = sc.nextInt();
		 int end = sc.nextInt();
		 int gap = sc.nextInt();
			
		 for(int i=start;i<=end;i+=gap)
		 {
			 int k=5*(i-32)/9;
			 System.out.println(i+"\t"+k);
		 }*/
		
		
		//===========================================================
	
		
		/*
		Scanner sc = new Scanner(System.in);
		 int n = sc.nextInt();
		int sum=0;
		 for(int i=2;i<=n;i+=2)
		 {
			 sum+=i;
		 }
		 System.out.println(sum);
*/
		
		
		//===========================================================
		
/*		Scanner sc = new Scanner(System.in);
		char ch = sc.next().charAt(0);

		if(ch>=65 && ch<=90)
			System.out.println("1");
		else if(ch>=97 && ch<=122)
			System.out.println("0");
		else
			System.out.println("-1");
		
	*/
		
		
		
		
		/*
		 * 
		 * Scanner sc = new Scanner(System.in);
		int n= sc.nextInt();
		int i=1;
		if(n>=1)
		{
			System.out.println("1");
		}
		if(n>=2)
		{
			System.out.println("11");
		}
		
		for( i=3;i<=n;i++)
		{
			System.out.print("1");
			for(int j=i-2;j<=i;i++)
			{
				System.out.print("2");
			}
			System.out.print("1");
			System.out.println();
		}
		
		*/
		/*
		Scanner sc = new Scanner(System.in);
		int n= sc.nextInt();
		int i=1;
		if(n>=1)
		{
			System.out.println("1");
		}
		if(n>=2)
		{
			System.out.println("11");
		}
		
		for( i=3;i<=n;i++)
		{
			System.out.print(i-1);
			for(int j=i-2;j<=i;i++)
			{
				System.out.print("0");
			}
			System.out.print(i-1);
			System.out.println();
		}*/
	
	
/*	     Scanner sc = new Scanner(System.in);
	      int basic = sc.nextInt();
	      char ch= sc.next().charAt(0);
	      
	      int allow=0;
	      if(ch=='A')
	        allow=1700;
	      else if(ch=='B')
	        allow=1500;
	      else 
	        allow=1300;
	      
	      int total=(159*basic/100)+allow;
	      System.out.println(Math.round(total));
*/

		
/*
		Scanner sc = new Scanner(System.in);
      	int a=sc.nextInt();
        int b=sc.nextInt();
        int c=sc.nextInt();
      int d=b*b-4*a*c;
      if(d==0)
      {
        System.out.println("0");
        System.out.println( -b/(2*a)+" "+ -b/(2*a)); 
      } 
      if(d>=0)
      {
        System.out.println("1");
        System.out.println( Math.round((-b+Math.sqrt(d))/(2*a))+" "+ Math.round((-b-Math.sqrt(d))/(2*a)));
      }if(d<=0)
      {
        System.out.println("-1");
      }
	    */  
	
		
		Scanner sc = new Scanner(System.in);
      	double a=sc.nextInt();
      	double b=sc.nextInt();
      	double c=sc.nextInt();
      	double d=(b*b)-(4*a*c);
      	double p = Math.sqrt(d);
      	double r1= (-b + p)/(2*a);
      	double r2= (-b - p)/(2*a);
      if(d==0)
      {
    	  
        System.out.println("0");
        System.out.println( -b/(2*a)+" "+ -b/(2*a)); 
      } 
     else if(d>0)
      {
        System.out.println("1");
        System.out.println( Math.round((-b+Math.sqrt(d))/(2*a))+" "+ Math.round((-b-Math.sqrt(d))/(2*a)));
          
      }
      else
      {
        System.out.println("-1");
      }
	      
	
	      
	
	}

	
	
}
