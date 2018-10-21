package Lecture17;

import java.math.BigInteger;
import java.util.Scanner;

public class LinkedList {

	public static void print(Node<Integer> temp){
		Node head=temp;
		//System.out.println(head.data);
		//System.out.println(head.next.data);
		//System.out.println(head.next.next.data);
		
		while(head!=null){
			System.out.println(head.data);
			head=head.next;
		}
	}
	public static Node<Integer> takeInput(){
		Scanner s =new Scanner(System.in);
		Node head=null;
		int data=s.nextInt();
		Node temp=null;
		while(data!=-1)
		{
			Node<Integer> node = new Node<Integer>(data);
			if(head==null)
			{
				temp=head=node;
			}
			else{
				temp=head;
				while(temp.next!=null)
				{
					temp=temp.next;
				}
				temp.next=node;
				temp=temp.next;
			}
			data=s.nextInt();
		}
		return head;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BigInteger l=new BigInteger("239158029750150104");
		BigInteger h=new BigInteger("998244353");
        BigInteger j= l.remainder(h);
         System.out.println(j);
         
		Node<Integer> n1= new Node<Integer>(10);
		Node<Integer> n2= new Node<Integer>(20);
		n1.next=n2;
		Node<Integer> n3= new Node<Integer>(30);
		n2.next=n3;
		Node p1=takeInput();
		//print(n1);
		print(p1);

	}

}
