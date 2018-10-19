package stacks;

public class ClientStack {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Stack s=new Stack();
		s.push(10);
		s.push(20);
		s.push(30);
		s.push(40);
		s.push(50);
		//s.push(60);
		//never fill 60 as array has size 5 only
		System.out.println(s.getSize());
		System.out.println(s.pop());
		System.out.println(s.peek());
		System.out.println(s.getSize());
		System.out.println(s.peek());
		System.out.println(s.peek());
		System.out.println(s.pop());
		System.out.println(s.pop());
		System.out.println(s.pop());
		System.out.println(s.pop());
		System.out.println(s.pop());
		
		//System.out.println(s.data[0]);
		//not allowed
	}

}
