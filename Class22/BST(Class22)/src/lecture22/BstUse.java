package lecture22;

public class BstUse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BinarySearchTree bt=new BinarySearchTree();
		bt.insert(100);
		bt.insert(80);
		bt.insert(90);
		bt.insert(70);
		bt.insert(150);
		bt.insert(140);
		bt.insert(160);

		System.out.println(bt.search(90));
		System.out.println(bt.search(190));
	
		bt.delete(190);
		bt.print();
	}

}
