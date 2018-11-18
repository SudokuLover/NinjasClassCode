package lect24;

import java.util.HashMap;
import java.util.Scanner;
class KeyValue{
	int key;
	int value;
	public KeyValue(int k,int v){
		key=k;
		value=v;
	}
}
public class Hashing {
	
	public static KeyValue maxFrequency(int arr[]){
		
		HashMap<Integer,Integer> map = new 	HashMap<>();
		
		for(int key:arr)
		{
			if(map.containsKey(key))
				map.put(key, map.get(key)+1);
			else
				map.put(key, 1);		
		}
		int max=Integer.MIN_VALUE;
		int maxNumber=Integer.MIN_VALUE;
	
		for(int key:arr)
		{
				if(max< map.get(key)){
					max= map.get(key);
					maxNumber=key;
				}
		}
		
		return new KeyValue(maxNumber, max) ;
	}
	public static void main(String[] args) {
		
		/*
		 HashMap<Integer,Integer> map = new 	HashMap<>();
		map.put(1,2);
		System.out.println(map.containsKey(1));
		System.out.println(map.containsKey(2));
		System.out.println(map.get(1));*/
		
		Scanner sc = new Scanner(System.in);
	
		int n = sc.nextInt();
		int arr[]=new int[n];
		
		for(int i=0;i<n;i++)
		{
			arr[i]=sc.nextInt();
		}
		KeyValue p=maxFrequency(arr);
		System.out.println("Key : "+p.key+" has value : "+p.value);
	}
}
