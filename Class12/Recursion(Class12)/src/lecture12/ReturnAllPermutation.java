package lecture12;

import java.util.Scanner;

public class ReturnAllPermutation {
	public static String[] permutationOfString(String input){
		// Write your code here
      if(input.length()==0)
      {
        String[]k={""};
        return k;
      }
      String[]rosp=permutationOfString(input.substring(1));
      String []ts=new String[input.length()*rosp.length];
      int k=0;
      for(String str : rosp)
      {
        for(int i=0;i<=str.length();i++)
        {
          ts[k++]=str.substring(0,i)+input.charAt(0)+str.substring(i);
        }
      }
      return ts;
	}
	
	 public static void main(String[] args) {
			Scanner s = new Scanner(System.in);
			String input = s.nextLine();
			String output[] = permutationOfString(input);
			for(int i = 0; i < output.length; i++) {
				System.out.println(output[i]);
			}
		}
  	
}
