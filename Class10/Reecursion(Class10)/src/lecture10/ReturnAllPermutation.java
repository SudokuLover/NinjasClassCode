package lecture10;

import java.util.Scanner;

public class ReturnAllPermutation {

	public static String[] permutationOfString(String input){
		// Write your code here
		return permute(input,0,input.length()-1);
	}
	
  	public static String[] permute(String input,int l,int r1){
		// Write your code here
      	if(l==r1)
        {
          String s[]={input};
          return s;
        }
        String r[]={};
        for(int i=l;i<input.length();i++)
        {
          swap(input,l,i);
          String a[]=permute(input,l+1,i);
          String []t=new String[r.length+a.length];
         int k=0;
          for(int j=0;j<r.length;j++)
          {
            t[k++]=r[j];
          }
          for(int j=0;j<a.length;j++)
          {
            t[k++]=a[j];
          }
          r=t;
        }
      return r;
	}
	 public static String swap(String input,int l, int r){
    char ch=input.charAt(l);
    
    char []arr=input.toCharArray();
    
    arr[l]=input.charAt(r);
    arr[r]=ch;
    input=new String(arr);
    return input;
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
