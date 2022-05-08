package leetcodes.strings;

public class StringReverse {

	public static void main(String[] args) {
		System.out.println(reverse("test of string"));
	}
	
	private static String reverse(String s) {
		
		char []cArr = s.toCharArray();
		int left =0, right = s.length()-1;
		for ( left = 0; left < right; left++, right--) {
			char temp = cArr[left];
			cArr[left] = cArr[right];
			cArr[right] = temp;
		}
		
		return String.copyValueOf(cArr);
	}
	

}
