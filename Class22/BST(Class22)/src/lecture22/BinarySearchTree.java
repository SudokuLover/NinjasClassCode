package lecture22;

public class BinarySearchTree{
	private BinaryTreeNode<Integer> root;
	
	public BinarySearchTree(){
		root=null;
	}
	public boolean search(int data)
	{
		return search(root,data);
	}
	private boolean search(BinaryTreeNode<Integer> root,int data)
	{
		if(root==null)
			return false;
		if(root.data==data)
		{
			return true;
		}
		else if(data<root.data)
		{
			return search(root.left,data);
		}
		else if(data>root.data)
		{
			return search(root.right,data);
		}
		else
			return false;
	}
	public void insert(int data)
	{
		this.root=insert(root,data);
	}
	private BinaryTreeNode<Integer> insert(BinaryTreeNode<Integer> root,int data)
	{
		if(root==null)
		{
			return new BinaryTreeNode<Integer>(data);
		}
		else if(data<root.data)
		{
			root.left=insert(root.left,data);
		}
		else 
		{
			root.right=insert(root.right,data);
		}
		return root;
	}

	public void delete(int data){
		this.root=delete(root,data);
	}
	private BinaryTreeNode<Integer> delete(BinaryTreeNode<Integer> root,int data){
		if(root==null)
		{
			return null;
		}
		if(data<root.data)
		{
			root.left=delete(root.left,data);
		}
		else if(data>root.data)
		{
			root.right=delete(root.right,data);
		}
		else{
			if(root.left!=null && root.right==null)
			{
				return root.left;
			}
			else if(root.left==null)
			{
				return root.right;
			}
			else{
				int data1 = findSuccessor(root.right);
				root.data=data1;
				delete(root.right,data1);
			}
		}
		return root;
	}
	private int findSuccessor(BinaryTreeNode<Integer> root){
		BinaryTreeNode<Integer> temp=root;
		while(temp.left!=null)
		{
			temp=temp.left;
		}
		return temp.data;
	}

	public void print(){
		print(root);
	}
	public void print(BinaryTreeNode<Integer> root){
		if(root==null)
			return ;
		print(root.left);
		System.out.print(root.data+" ");
		print(root.right);
		return ;
	}
}
