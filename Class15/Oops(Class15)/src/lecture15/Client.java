package lecture15;

public class Client {
	
	public static void main(String agrs[])
	{
		Bed b=new Bed(5,2,3,10000,"White");

		b.heigth=2;
		b.breadth=2;
		
		// used in case of if (len>3 && len <7)
		
		//b.setLength(-9);
		b.setLength(5);
		
		
		//when it is used in case of exception
		//b.length=2;
		
		/*try {
			b.setLength(-9);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}*/
		
		b.price=20000;
		b.color="White";
		System.out.println(b);
		//System.out.println(b.length);
		System.out.println(b.getLength());
		
		Bed b1=new Bed();
		

		System.out.println(b1);
		//System.out.println(b1.length);
		System.out.println(Bed.getBeds());
		
		//System.out.println(b1.NoOfBeds); // static things belongs to a class therefore never use with object rather use it with class 
		
		
	}
}
