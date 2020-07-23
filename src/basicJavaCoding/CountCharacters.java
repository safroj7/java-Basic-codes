package basicJavaCoding;

import java.util.HashMap;
import java.util.Map;

public class CountCharacters {

	public static void main(String[] args) {
		
		String str="AfrojA";
		
		char[] chr=str.toCharArray();
		
		System.out.println(chr);
		Map<Character,Integer> mp=new HashMap<>();
		
		for(char st:chr){
			
			if(mp.get(st)==null){
				mp.put(st, 1);
			}else{
				mp.put(st, mp.get(st)+1);
			}
		}System.out.println(mp);
	}

}
