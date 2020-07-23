package basicJavaCoding;

public class FindMaxInArray {

	public static void main(String[] args) {
		
		int[] aray = {10,20,58,47,698,5,42};
		
		int max=aray[0];
		
		for(int i=0;i<aray.length;i++){
			
			if(aray[i]>max){
				max=aray[i];
				
			}
			
		}
		System.out.println(max);
	}

}
