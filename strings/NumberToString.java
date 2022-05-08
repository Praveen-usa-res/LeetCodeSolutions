package leetcodes.strings;

public class NumberToString {

	static String []belowTen = {"Zero","One", "Two", "Three", "Four", "Five", "Six", "Seven", "Eight", "Nine"};
	static String []belowTwenty = {"Ten","Eleven", "Twelve", "Thirteen", "Fourteen", "Fifteen", "Sixteen", "Seventeen", "Eighteen", "Nineteen"}; 
	static String []tenMultiples = {"","Ten", "Twenty", "Thirty", "Fourty", "Fifty", "Sixty", "Seventy", "Eighty", "Ninety"};
	
	public static void main(String[] args) {
		System.out.println(numberToWord(1234567));
	}
	
	private static String numberToWord(int num) {
		if (num == 0 ) return belowTen[1];
		return convert(num);
	}
	private static String convert(int num) {
		String result = "";
		if(num < 10) result = belowTen[num];
		else if (num < 20) result = belowTwenty[num-10];
		else if (num < 100) result = tenMultiples[num/10]+" "+convert(num%10);
		else if (num < 1000) result = convert(num/100)+" Hundred "+ convert(num%100);
		else if (num < 1000000) result = convert(num/1000)+ " Thousand "+ convert(num%1000);
		else if (num < 1000000000) result = convert(num/1000000) + " Million "+ convert(num % 100000);
		else result = convert(num/1000000000) + " Billion "+convert(num % 1000000000);
		return result;
	}

}
