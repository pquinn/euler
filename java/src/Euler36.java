/*
The decimal number, 585 = 10010010012 (binary), is palindromic in both bases.

Find the sum of all numbers, less than one million, which are palindromic in base 10 and base 2.

(Please note that the palindromic number, in either base, may not include leading zeros.)
 */
public class Euler36 {
	int sum = 0;
	
	public Euler36(){}
	
	public void run(){
		//are the numbers 1-9 palindromes?
		for(int i = 1; i <= 1000000; i++){
			if(isPalindrome(i)){
				if(isBinaryPalindrome(Integer.toBinaryString(i))){
					sum += i;
				}
			}
		}
	}
	
	public static void main(String[] args){
		Euler36 e = new Euler36();
		e.run();
		System.out.println(e.sum);
	}
	
	public boolean isPalindrome(Integer n){
		if(n < 10){
			return true;
		} else {
			String numString = n.toString();
			String half1 = "", half2 = "";
			int length = numString.length();
			int halfLength = length / 2;
			if(length % 2 == 0){
				half1 = numString.substring(0, halfLength);
				half2 = reverse(numString.substring(halfLength, length));
			} else {
				half1 = numString.substring(0, halfLength);
				half2 = reverse(numString.substring(halfLength+1, length));
			}
			return Integer.parseInt(half1) == Integer.parseInt(half2);
		}
		
		
	}
	
	public boolean isBinaryPalindrome(String s){
		String half1 = "", half2 = "";
		int length = s.length();
		int halfLength = length / 2;
		if(length % 2 == 0){
			half1 = s.substring(0, halfLength);
			half2 = reverse(s.substring(halfLength, length));
		} else {
			half1 = s.substring(0, halfLength);
			half2 = reverse(s.substring(halfLength+1, length));
		}
		return half1.equals(half2);
	}
	
	public String reverse(String in){
		String out = "";
		int length = in.length() - 1;
		for(int i = length; i >= 0; i--){
			out += in.charAt(i);
		}
		return out;
	}
}
