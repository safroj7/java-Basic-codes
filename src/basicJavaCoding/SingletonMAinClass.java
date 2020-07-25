package basicJavaCoding;

class Mysingletone{
	
	private static Mysingletone ms;// here object create once 
	
	static String st;
	
	private Mysingletone(){
		
		if(ms==null)
		ms=new Mysingletone();
	}
	
	public static Mysingletone getinstance(){
		
		st="Hi...";
		System.out.println(st);
		return ms;
		
		
	}
	
}



public class SingletonMAinClass {

	public static void main(String[] args) {
		
		Mysingletone st1 =Mysingletone.getinstance();// Here object use multiple times
		Mysingletone st2 = Mysingletone.getinstance();
		

	}

}
