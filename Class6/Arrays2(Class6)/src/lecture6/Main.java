package lecture6;
import java.util.Scanner;

public class Main {

	
	public static void main(String[] args) {
		// Write your code here
      Scanner sc = new Scanner(System.in);
      int n=sc.nextInt();
      
      int []arr=new int[n];
      
      for(int i=0;i<n;i++)
      {
        arr[i]=sc.nextInt();
      }

      int sum=0;
      int j=0;
      for(int i=0;i<n;i++)
      {
        if(arr[i]>0)
        {
          j=i;
          break;
        }
      }
      int k=arr[j];
      sum=arr[j];
      for(int i=j+1;i<n;i++)
      {
        if(k<arr[i])
        {
          k=arr[i];
          sum+=arr[i];
        }
      }
      System.out.println(sum);
	}

}