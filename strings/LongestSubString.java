package leetcodes.strings;

import java.util.HashSet;
import java.util.Set;

public class LongestSubString {

	public static void main(String[] args) {
		String str = "abbcde";
		System.out.println(getLongestSubStringLenght(str));
	}
	
	public static int getLongestSubStringLenght(String str) {
		int strLen = str.length();
		if(str == null || strLen == 0)
			return 0;
		int i=0,j=0;
		int len = 0;
		Set<Character> set = new HashSet<Character>();
		while(j < strLen) {
			if(set.add(str.charAt(j))) {
				j++;
				len = Math.max(len, set.size());
			} else {
				set.remove(str.charAt(i));
				i++;
			}
		}	
		return len;
	}
	
	private static int getLenght(String str) {
		int len = 0;
		Set<Character> s = new HashSet<Character>();
		char []cArr = str.toCharArray();
		if(str.trim().length() == 0 && cArr.length > 0) return 1;
		for( char c: cArr) {
			if(s.contains(c)) {
				len = Math.max(len, s.size());
				s.remove(c);
				s.add(c);
			} else {
				s.add(c);	
				len = Math.max(len, s.size());
			}
		}
		return len;
	}

}
