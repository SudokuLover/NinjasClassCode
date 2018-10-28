package lecture20;

import java.util.Scanner;

import lec19.TreeNode;

public class BinaryTreeUse {
	
	
	public static BinaryTreeNode<Integer> takeInput(){
		Scanner sc=new Scanner(System.in);
		Queue<BinaryTreeNode<Integer>> pendingNodes=new Queue<>();
		System.out.println("Enter root data:");
		int rootData=sc.nextInt();
		BinaryTreeNode<Integer> root=new BinaryTreeNode<>(rootData);
		pendingNodes.enqueue(root);	
		while(!pendingNodes.isEmpty())
		{
			BinaryTreeNode<Integer> node=	pendingNodes.dequeue();	
			System.out.println("Enter left children of :" + node.data);
			
			int leftChildData=sc.nextInt();
			if(leftChildData!=-1)
			{
				BinaryTreeNode<Integer> leftChild=new BinaryTreeNode<>(leftChildData);
				node.left=leftChild;
				pendingNodes.enqueue(leftChild);
			}
			System.out.println("Enter right children of :" + node.data);
			
			int rightChildData=sc.nextInt();
			if(rightChildData!=-1)
			{
				BinaryTreeNode<Integer> rightChild=new BinaryTreeNode<>(leftChildData);
				node.left=rightChild;
				pendingNodes.enqueue(rightChild);
			}
		}
		return root;

	}
	public static void main(String args[]){

		BinaryTreeNode<Integer> n1=takeInput();
		/*BinaryTreeNode<Integer> n1= new BinaryTreeNode<Integer>(10);
		BinaryTreeNode<Integer> n2= new BinaryTreeNode<Integer>(20);
		BinaryTreeNode<Integer> n3= new BinaryTreeNode<Integer>(30);
	
		n1.left=n2;
		n1.right=n3;
		
		System.out.println(n1.left.data);
*/	}
}
