package stacks;

import java.util.Scanner;
import java.util.Stack;


public class ReverseStack {

/*	public static void reverseStack(Stack<Integer> s1, Stack<Integer> s2) {
		Stack<Integer> s3=new Stack<Integer>();
      	System.out.println(s1);
        while(true)
	      {
	        if(s1.isEmpty())
	          break;
	        else{
	        	int k=s1.pop();
	        	//System.out.println(k);
	         	s2.push(k);
	        }
	      }
        while(true)
	      {
	        if(s2.isEmpty())
	          break;
	        else{
	        	int k=s2.pop();
	        	//System.out.println(k);
	         	s3.push(k);
	        }
	      }
        while(true)
	      {
	        if(s3.isEmpty())
	          break;
	        else{
	        	int k=s3.pop();
	        	//System.out.println(k);
	         	s1.push(k);
	        }
	      }
	      
		}
	*/
	public static void reverseStack(Stack<Integer> s1, Stack<Integer> s2) {
		
		if(s1.isEmpty())
		{
			return ;
		}
		int val=s1.pop();
		reverseStack(s1,s2);
		while(!s1.isEmpty())
        {
          s2.push(s1.pop());
        }
		s1.push(val);
		while(!s2.isEmpty())
        {
          s1.push(s2.pop());
        }
	}
static Scanner s = new Scanner(System.in);
	
	public static void main(String[] args) {
		int size = s.nextInt();
		Stack<Integer> input = new Stack<Integer>();
		for(int i = 0; i < size; i++) {
			input.push(s.nextInt());
		}
		Stack<Integer> extra = new Stack<Integer>();
		reverseStack(input, extra);
		//System.out.println(input);
		while(!input.isEmpty()) {
			System.out.print(input.pop() + " ");
		}
	}

}
