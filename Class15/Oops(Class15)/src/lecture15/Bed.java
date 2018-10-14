package lecture15;

public class Bed extends Throwable{
	private int length;
	//int length;
	int breadth;
	int heigth;
	int price;
	String color;
	
	
	/*public String toString(){
		return ""+length+" "+breadth+" "+heigth+" "+price+" "+color;
	}
	*/
	public int getLength(){
		return length;
	}/*
	public void setLength(int len) throws Exception{
		length=len;
		if(len<0)
			throw new Exception("Less than 10");
			
	}*/
	public void setLength(int len){
		if(len>3 && len<7)
			length=len;
	}
}
