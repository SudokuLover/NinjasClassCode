package lecture10;

import java.util.Scanner;

public class printPermutations {

	public static void permutations(String input){
		// Write your code here
		print(input,0,"",input.length());
      	return ;
	}
  
  	public static void print(String input,int index,String str,int k){
		// Write your code here
		if(index==input.length())
        {
          System.out.println(str);
        }
     else{
    	 int l=1;
        for(int i=(index)%input.length();i<input.length();i++)
        { l++;
        	if(l==k)
        		break;
          print(input,index+1,str+input.charAt(i),k--);
        }

        for(int i=0;i<index%input.length();i++)
        {
        	l++;
        	if(l==k)
    		break;
          
          print(input,index+1,str+input.charAt(i),k--);
        }
        
       return ;
      }
	}
	
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		String input = s.nextLine();
		permutations(input);
	}
}
