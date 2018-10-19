package client;
import lecture15.Bed;
public class Client2 {
	public static void main(String args[]){
		//Bed b= new Bed();
		Bed b=new Bed(5,2,3,10000,"White");
		b.setLength(6);
		//b.breadth -> no available to get access properties as -> they are default i.e can't be accessed outside package 

		//System.out.println(Bed.NoOfBeds);
		System.out.println(Bed.getBeds());
	}
}
