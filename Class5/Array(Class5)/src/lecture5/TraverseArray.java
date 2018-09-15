package lecture5;
//code 3
import java.util.Scanner;

public class TraverseArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		
		int arr[]=new int[5];
		/*arr[0]=sc.nextInt();
		arr[1]=sc.nextInt();
		arr[2]=sc.nextInt();
		arr[3]=sc.nextInt();
		arr[4]=sc.nextInt();
		*/
		//what if there are 1000 variable
	
	
		for(int i=0;i<5;i++)
		{
			arr[i]=sc.nextInt();
		}
		for(int i=0;i<5;i++)
		{
			System.out.print(arr[i]+" ");
		}
	}

}
