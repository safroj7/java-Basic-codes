package basicJavaCoding;

public class PalindromNum {

	public static void main(String[] args) {
	
	
		int n=121;
		int revernum=0;
		int temp=n;
		int remider=0;
		
		while(n>0){
			remider=n%10;
			revernum=revernum*10+remider;
			n=n/10;
			
			
		}
		
		if(temp==revernum){
			System.out.println("Number is palindrom");
		}else{
			System.out.println("Number is not palindrome");
		}
	}
}
