package lecture15;

public class ComplexNumbers {
	/******************
	 * Following is the main function we are using internally.
	 * Refer this for completing the ComplexNumbers class
	 * 
	 
	 public static void main(String[] args) {
			Scanner s = new Scanner(System.in);

			int real1 = s.nextInt();
			int imaginary1 = s.nextInt();

			int real2 = s.nextInt();
			int imaginary2 = s.nextInt();

			ComplexNumbers c1 = new ComplexNumbers(real1, imaginary1);
			ComplexNumbers c2 = new ComplexNumbers(real2, imaginary2);

			int choice = s.nextInt();
			 
			if(choice == 1) {
				// Add
				c1.plus(c2);
				c1.print();
			}
			else if(choice == 2) {
				// Multiply
				c1.multiply(c2);
				c1.print();
			}
			else {
				return;
			}
		}
	 ******************/

		// Complete this class
	  int r;
	  int i;
	  
	  public ComplexNumbers(int a,int b){
	    r=a;
	    i=b;
	  }
	  
	  public void plus(ComplexNumbers a){
	    this.r+=a.r;
	    this.i+=a.i;
	  }
	  public void multiply(ComplexNumbers a){
	    int a1=this.r*a.r;
	    int b=this.i*a.i;
	    int a2=this.i*a.r;
	     int b1=this.r*a.i;
	    this.r+=(a1-b);
	    
	    this.i+=(a2+b1);
	    
	  }
	  public void print(){
	    System.out.println(r+" + i"+i);
	  }
	  
		
	}

