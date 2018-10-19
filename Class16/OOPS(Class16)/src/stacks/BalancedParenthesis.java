package stacks;

import java.util.Scanner;
import java.util.Stack;


public class BalancedParenthesis {
	static Scanner s = new Scanner(System.in);
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String input = s.nextLine();
		System.out.println(checkBalanced(input));
	}

	public static boolean checkBalanced(String exp) {
		// Write your code here
      Stack<Character> s = new Stack<Character>(); 
      //Stack s=new Stack();
      	for(int i=0;i<exp.length();i++)
        {
 
      		char c=exp.charAt(i);
          if(c=='{' || c=='[' || c=='(')
            s.push(c);

          if(c==')')
          {
        	if('('==s.peek() && !s.isEmpty())
        		s.pop();
        	else
        		return false;
          }
          if(c==']')
          {
        	if('['==s.peek() && !s.isEmpty())
        		s.pop();
        	else
        		return false;
          }
          if(c=='}')
          {
        	if('{'==s.peek() && !s.isEmpty())
        		s.pop();
        	else
        		return false;
          }
          	 
        }
      return s.isEmpty();
	}

}
