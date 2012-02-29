/*
n! means n  (n  1)  ...  3  2  1

Find the sum of the digits in the number 100!
*/

public class Euler20{
	int finalFactorial = 1;
	int sum;
	
	public Euler20(){};

	public void calcFactorial(){
		for(int i = 1; i < 100; i++){
			if(i % 10 == 0)
				continue;
			finalFactorial = finalFactorial * i;
		}
		System.out.println("final factorial calculated (" + finalFactorial + ")");
	}
	
	public void sumDigits(){
		int tmp;
		while(finalFactorial > 10){
			tmp = finalFactorial % 10;
			System.out.println("tmp: " + tmp);
			sum += tmp;
			System.out.println("sum: " + sum);
			finalFactorial = finalFactorial - tmp;
			System.out.println("finalFactorial - tmp: " + finalFactorial);
			finalFactorial = finalFactorial / 10;
			System.out.println("finalFactorial / 10: " + finalFactorial);
		}
		sum += finalFactorial;
	}
	
	public void run(){
		calcFactorial();
		sumDigits();
	}
	
	public static void main(String[] args){
		Euler20 e = new Euler20();
		e.run();
		System.out.println("Sum: " + e.sum);
	}
}
