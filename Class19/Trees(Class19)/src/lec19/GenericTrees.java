package lec19;

import java.util.Scanner;

public class GenericTrees {

	public static TreeNode<Integer> takeInput(){
		Scanner s=new Scanner(System.in);
		System.out.println("Enter root data:");
		int rootData=s.nextInt();
		TreeNode<Integer> root=new TreeNode<>(rootData);
		System.out.println("Enter number of children of :" + rootData);
		int numOfChildren=s.nextInt();
		
		for(int i=0;i<numOfChildren;i++)
		{
			root.children.add(takeInput());
		}
		return root;
	}
	public static TreeNode<Integer> takeInputLevelWise(){
		Scanner s=new Scanner(System.in);
		GenericQueue<TreeNode<Integer>> pendingNodes=new GenericQueue<>();
		System.out.println("Enter root data:");
		int rootData=s.nextInt();
		TreeNode<Integer> root=new TreeNode<>(rootData);
		pendingNodes.enqueue(root);	
		while(!pendingNodes.isEmpty())
		{
			TreeNode<Integer> node=	pendingNodes.dequeue();	
			System.out.println("Enter number of children of :" + node.data);
			
			int numOfChildren=s.nextInt();
			for(int i=0;i<numOfChildren;i++)
			{
				int childData=s.nextInt();
				TreeNode<Integer> child=new TreeNode<>(childData);
				pendingNodes.enqueue(child);
				node.children.add(child);
			}
		}
		return root;
	}	
	
	public static void print(TreeNode<Integer> root){
		System.out.print(root.data+" : ");
		for (TreeNode<Integer> child : root.children)
		{
			System.out.print(child.data);
			
		}
		System.out.println();
		
		for (TreeNode<Integer> node : root.children)
		{
			print(node);
		}
	}
	public static void printLevelWise(TreeNode<Integer> root){
		GenericQueue<TreeNode<Integer>> pendingNodes=new GenericQueue<>();
		pendingNodes.enqueue(root);	
		while(!pendingNodes.isEmpty())
		{
			TreeNode<Integer> node=	pendingNodes.dequeue();	
			
			for(int i=0;i<node.children.size();i++)
			{
				pendingNodes.enqueue(node.children.get(i));
			}
		}
	
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		TreeNode<Integer> node1=takeInputLevelWise();
		
		print(node1);
		
		/* TreeNode<Integer> node1=new TreeNode<>(10);

		TreeNode<Integer> node2=new TreeNode<>(20);
		TreeNode<Integer> node3=new TreeNode<>(30);
		TreeNode<Integer> node4=new TreeNode<>(40);
		node1.children.add(node2);
		node1.children.add(node3);
		node1.children.add(node4);
	*/	
		//System.out.println(node1.data);
	//	System.out.println(node1.children.size());
		
		/*for(int i=0;i<node1.children.size();i++)
		{
			System.out.println(node1.children.get(i).data);
		}
		
		for (TreeNode<Integer> node : node1.children)
		{
			System.out.println(node.data);	
		}*/
	}

}
