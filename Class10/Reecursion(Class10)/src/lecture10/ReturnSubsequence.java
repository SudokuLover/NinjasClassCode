package lecture10;

import java.util.Scanner;

public class ReturnSubsequence {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		String input = s.nextLine();
		String output[] = subsequence(input);
		for(int i = 0; i < output.length; i++) {
			System.out.println(output[i]);
		}
	}
	// Return the subsequences saved in a string array
	public static String[] subsequence(String input){
		// Write your code here

      if(input.length()==0)
      {
        String str[]= {" "};
      	return str;
      }
      
      String []args=subsequence(input.substring(1));
      
      String []arr=new String[args.length*2];
      
      int i=0;
      for(;i<args.length;i++)
      {
        arr[i]=args[i];
      }
      
      int k=0;
      for(;i<arr.length;i++)
      {
        arr[i]=input.charAt(0)+args[k++];
      }
      
      return arr;
	}
}

