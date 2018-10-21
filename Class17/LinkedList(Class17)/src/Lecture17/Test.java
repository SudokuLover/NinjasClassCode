package Lecture17;
import java.util.ArrayList;
public class Test {

	public static void printAll(int[] arr, int k, int si, ArrayList<Integer> al){
		if(si == arr.length){
			if(k == 0){
				
				System.out.println(al);
			}
			return;
		}
		
		printAll(arr, k, si + 1, al);
		al.add(arr[si]);
		printAll(arr, k - arr[si], si + 1, al);
		
	}
	public static void printAll1(int[] arr, int k, int si, int[] al){
		if(si == arr.length){
			if(k == 0){
				for(int i=0;i<al.length;i++)
				{
					System.out.print(al[i]);
					
				}
				System.out.println();
				
			}
			return;
		}
		
		printAll1(arr, k, si + 1, al);
		int[] newOp = new int[al.length + 1 ];
		for(int i = 0; i < al.length; i++){
			newOp[i] = al[i];
		}
		newOp[newOp.length - 1] = arr[si];
		printAll1(arr, k - arr[si], si + 1, newOp);
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	ArrayList<Integer> al = new ArrayList<>();
		printAll1(new int[]{4,5,3,4}, 8, 0, new int[]{});
	}

}
