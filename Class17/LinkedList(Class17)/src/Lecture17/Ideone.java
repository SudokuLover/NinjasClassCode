package Lecture17;


import java.util.*; 
import java.lang.*; 
import java.io.*; 
  
class Ideone 
{ 
    public static void main (String[] args) throws java.lang.Exception 
    { 
    	Scanner sc=new Scanner(System.in);
    	int n=sc.nextInt();
    	int m=sc.nextInt();
    	int a[]=new int[n];
    	int b[]=new int[m];
    	
    	for(int i=0;i<n;i++)
    	{
    		a[i]=sc.nextInt();
    	}
    	for(int i=0;i<m;i++)
    	{
    		b[i]=sc.nextInt();
    	}
    	int c[][]=new int[n][m];
    	for(int i=0;i<n;i++)
    	{
    		for(int j=0;j<m;j++)
        	{
        		c[i][j]=a[i]*b[j];
        	}
    	}
    	
        findMaxSubMatrix(c); 
    } 
      
    public static int[] kadane(int[] a) { 
        int[] result = new int[]{Integer.MIN_VALUE, 0, -1}; 
        int currentSum = 0; 
        int localStart = 0; 
      
        for (int i = 0; i < a.length; i++) { 
            currentSum += a[i]; 
            if (currentSum < 0) { 
                  currentSum = 0; 
                localStart = i + 1; 
              } else if (currentSum > result[0]) { 
                result[0] = currentSum; 
                result[1] = localStart; 
                result[2] = i; 
              } 
        } 
          
        if (result[2] == -1) { 
            result[0] = 0; 
            for (int i = 0; i < a.length; i++) { 
                if (a[i] > result[0]) { 
                    result[0] = a[i]; 
                    result[1] = i; 
                    result[2] = i; 
                } 
            } 
        } 
          
        return result; 
      } 
  
    public static void findMaxSubMatrix(int[][] a) { 
        int cols = a[0].length; 
        int rows = a.length; 
        int[] currentResult; 
        int maxSum = Integer.MIN_VALUE; 
        int left = 0; 
        int top = 0; 
        int right = 0; 
        int bottom = 0; 
          
        for (int leftCol = 0; leftCol < cols; leftCol++) { 
            int[] tmp = new int[rows]; 
      
              for (int rightCol = leftCol; rightCol < cols; rightCol++) { 
          
                for (int i = 0; i < rows; i++) { 
                      tmp[i] += a[i][rightCol]; 
                } 
                currentResult = kadane(tmp); 
                if (currentResult[0] > maxSum) { 
                    maxSum = currentResult[0]; 
                    left = leftCol; 
                    top = currentResult[1]; 
                    right = rightCol; 
                    bottom = currentResult[2]; 
                } 
            } 
        } 
              System.out.println(maxSum); 
    } 
} 