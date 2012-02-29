/* 
A palindromic number reads the same both ways. The largest palindrome made from the product of two 2-digit numbers is 9009 = 91  99.

Find the largest palindrome made from the product of two 3-digit numbers.
*/

public class Euler4{
	int number1 = 999;
	int number2 = 999;
	int solution = 0;
	
	public Euler4(){}
	
	public void run(){
		for(int i = number1; i > 100; i--){
			for(int j = number2; j > 100; j--){
				if(isPalindrome(i*j)){
					System.out.println(i + " " + j);
					if(i*j > solution)
						solution = i*j;
				}
			}
		}
	}
	
	public static void main(String[] args){
		Euler4 e = new Euler4();
		e.run();
		System.out.println(e.solution);
	}
	
	public boolean isPalindrome(Integer n){
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
	
	public String reverse(String in){
		String out = "";
		int length = in.length() - 1;
		for(int i = length; i >= 0; i--){
			out += in.charAt(i);
		}
		return out;
	}
}