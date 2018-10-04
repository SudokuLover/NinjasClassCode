package lecture10;

import java.util.Scanner;

public class PrintKeyPad {

	public static void printKeypad(int input){
		// Write your code here
		
      print(input, "");
      return ;
	}
  public static void print(int input, String str){
    
    if(input==0)
    {
      System.out.println(str);
      return ;
    }
    char p[]=find(input%10);
    for(int i=0;i<p.length;i++)
    {
      print(input/10,str+p[i]);
    }
    return ;
  }
   public static char[] find(int k)
  {
    if(k==2)
    {
      return new char[]{'a','b','c'};
    }
    else if(k==3)
    {
      return new char[]{'d','e','f'};
    }
    else if(k==4)
    {
      return new char[]{'g','h','i'};
    }
    else if(k==5)
    {
      return new char[]{'j','k','l'};
    }
   else if(k==6)
    {
      return new char[]{'m','n','o'};
    }
    else if(k==7)
    {
      return new char[]{'p','q','r','s'};
    }
    else if(k==8)
    {
      return new char[]{'t','u','v'};
    }
    else 
    {
      return new char[]{'w','x','y','z'};
    }
    
    
  }
   public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int input = s.nextInt();
		printKeypad(input);
	}

}

