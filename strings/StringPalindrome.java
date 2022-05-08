package leetcodes.strings;

public class StringPalindrome {

	public static void main(String[] args) {
		
//		System.out.println(isPalindrome("teset"));
		stringComp();

	}
	
	private static boolean isPalindrome(String str) {
		char []cArr = str.toCharArray();
		int i = 0, j = cArr.length -1;
		while(i < j) {
			if(cArr[i] != cArr[j])
				return false;
			i++;
			j--;
		}
		return true;
	}
	
	private static void stringComp() {
		String s1 = "abc";
		String s2 = "abc";
		String s3 = new String("abc");
		if(s1 == s2) {
			System.out.println("s1==s2 is equal");
		} else 
			System.out.println("s1==s2 is NOT equal");
		if(s1 == s3) {
			System.out.println("s1==s3 is equal");
		} else
			System.out.println("s1==s3 is NOT equal");
		
		if(s1.equals(s2)) {
			System.out.println("s1.equals(s2) is equal");
		} else 
			System.out.println("s1.equals(s2) is NOT equal");
		if(s1.equals(s3)) {
			System.out.println("s1.equals(s3) is equal");
		} else
			System.out.println("s1.equals(s3) is NOT equal");
		
		System.out.println(s1.hashCode() +"::"+s2.hashCode()+"::"+s3.hashCode());
		
		
	}

}
