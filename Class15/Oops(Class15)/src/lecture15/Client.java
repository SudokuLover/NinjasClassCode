package lecture15;

public class Client {
	
	public static void main(String agrs[])
	{
		Bed b=new Bed();

		b.heigth=2;
		b.breadth=2;
		//b.length=2;
		try {
			b.setLength(-9);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		b.price=20000;
		b.color="White";
		System.out.println(b);
		//System.out.println(b.length);
		System.out.println(b.getLength());
		
		Bed b1=new Bed();

		System.out.println(b1);
		//System.out.println(b1.length);
		
	}
}
