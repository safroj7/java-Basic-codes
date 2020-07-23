package basicJavaCoding;

public class ReplaceAllFunc {

	public static void main(String[] args) {
		
		String str=",[[]['.ml0001245000";
		
		System.out.println(str);
		
		String str2=str.replaceAll("[^0-9]", "");

		int a= Integer.parseInt(str2);
		
		System.out.println(a);
	}

}
