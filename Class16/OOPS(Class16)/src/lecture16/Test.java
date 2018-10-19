package lecture16;

public class Test {
	
	public static PairGeneric<Integer> getMinMax(int arr[])
	{
		int min=Integer.MAX_VALUE;
		int max=Integer.MIN_VALUE;
		
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]>max)
				max=arr[i];
			if(arr[i]<min)
				min=arr[i];
		}
		
		//Pair p = new Pair(min,max);
		PairGeneric<Integer> p = new PairGeneric<Integer>(min,max);
		return p;
	}
	public static void main(String args[])
	{
		int arr[]={2,7,8,1,14};
		PairGeneric<Integer> p = getMinMax(arr);
		System.out.println(p.max);
		System.out.println(p.min);
	}
}
