package lecture16;

public class PairGeneric<T>{
	T min;
	T max;
	
	public PairGeneric(){
		
	}
	public PairGeneric(T min,T max){
		this.min=min;
		this.max=max;		
	}
}
