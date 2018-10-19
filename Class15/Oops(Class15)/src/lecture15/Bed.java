package lecture15;

public class Bed extends Throwable{
	private int length;
	//int length;
	int breadth;
	int heigth;
	int price;
	String color;
	private static int NoOfBeds;
	
	public Bed(){
		System.out.println("Mujhe Bhi Koi Phuchlo Bhaiyo");
		NoOfBeds++;
	}
		
	public Bed(int length,int breadth,int heigth){
		/*length=l;
		breadth=b;
		heigth=h;*/
		this();
		this.length=length;
		this.breadth=breadth;
		this.heigth=heigth;
		System.out.println("Constructor with 3 argument");
	}
	
	public Bed(int l,int b,int h,int p,String c){
		/*length=l;
		breadth=b;
		heigth=h;
		*/
		//here code is redundant
		this(l,b,h);
		price=p;
		color=c;
		System.out.println("Constructor with 5 argument");
	}
	

	public String toString(){
		return ""+length+" "+breadth+" "+heigth+" "+price+" "+color;
	}
	
	public int getLength(){
		return length;
	}
	
	/*
	public void setLength(int len) throws Exception{
		length=len;
		if(len<0)
			throw new Exception("Less than 10");
			
	}*/
	public void setLength(int len){
		if(len>3 && len<7)
			length=len;
	}
	
	//no need to provide setter as no of beds is increased by 1 (by default)
	public static int getBeds(){
		return NoOfBeds;
	}
}
