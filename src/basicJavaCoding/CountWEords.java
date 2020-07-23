package basicJavaCoding;

import java.util.HashMap;
import java.util.Map;

public class CountWEords {

	public static void main(String[] args) {
		
		String str="I Love india I";
		
		String[] strarray=str.split(" ");
		
		Map<String,Integer> mp=new HashMap<>();
		for(String st:strarray){
		System.out.println(st);
		
		if(mp.get(st)==null){
			mp.put(st, 1);
			
		}else{
			mp.put(st, mp.get(st)+1);
		}
		
		
		}
		System.out.println(mp);
	}
}
