package lecture5;
//code 2
public class MultipleRefrencesInArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr1[]=new int [5];
		int arr2[]=arr1;
		
		arr1[0]=10;
		arr1[1]=15;
		arr1[2]=20;
		arr1[3]=30;
		arr1[4]=40;

		System.out.println(arr1+ " "+arr2);
		
		
		System.out.println(arr2[0]);
		System.out.println(arr2[1]);
		System.out.println(arr2[2]);
		System.out.println(arr2[3]);
		System.out.println(arr2[4]);
	}

}
