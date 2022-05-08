package leetcodes.strings;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class StringCompression {

	public static void main(String[] args) {
		// aaabbccdee --> a3b2c2de2
//		System.out.println(compression1("aaabbccdee"));
		System.out.println(compression2("aaabbccdee"));

	}
	
	private static String compression1(String str) {
		
		int len = str.length()-1;
		StringBuffer result = new StringBuffer();
		for( int i = 0; i <= len ; i++) {
			int count = 1;
			while (i < len && str.charAt(i) == str.charAt(i+1)) {
				i++;
				count++;
			}
			result.append(str.charAt(i));
			if(count != 1) result.append(count);
		}
		return result.toString();
	}
	private static String compression2(String str) {
		Map<Character, Integer> map = new HashMap<Character, Integer>();
		String result = "";
		char []cArr = str.toCharArray();
		for(char c: cArr) {
			if(map.containsKey(c)) {
				map.put(c, map.get(c)+1);
			} else map.put(c, 1);
		}
		Iterator<Character> it = map.keySet().iterator();
		while(it.hasNext()){
			Character c = it.next();
			result = result + c + map.get(c);
		}
		return result;
		
	}

}
