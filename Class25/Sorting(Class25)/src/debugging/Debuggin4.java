package debugging;

public class Debuggin4 {
	public static void main(String[] args) {
		System.out.println("first line--main");
		fun();
		System.out.println("last line--main");

	}
	public static void fun() {
		int a1=10;
		System.out.println(11);
		System.out.println(21);
		fun2();
		System.out.println(31);
		System.out.println(41);
		
	}
	public static void fun2() {
		int a2=20;
		System.out.println(11);
		System.out.println(21);
		fun3();
		System.out.println(31);
		System.out.println(41);
		
	}
	public static void fun3() {
		int a3=30;
		System.out.println(11);
		System.out.println(21);
		System.out.println(31);
		System.out.println(41);
		
	}

}
