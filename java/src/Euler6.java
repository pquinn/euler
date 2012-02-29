/*
The sum of the squares of the first ten natural numbers is,

12 + 22 + ... + 102 = 385
The square of the sum of the first ten natural numbers is,

(1 + 2 + ... + 10)2 = 552 = 3025
Hence the difference between the sum of the squares of the first ten natural numbers and the square of the sum is 3025  385 = 2640.

Find the difference between the sum of the squares of the first one hundred natural numbers and the square of the sum.
*/

public class Euler6{
	int sumSquares, squareSum, sum, diff;

	public Euler6(){};

	public void run(){
		int tempSq;
		for(int i = 1; i <= 100; i++){
			sum += i;
			tempSq = i * i;
			sumSquares += tempSq;
		}
		squareSum = sum * sum;
		diff = squareSum - sumSquares;
	}
	
	public static void main(String[] args){
		Euler6 e = new Euler6();
		e.run();
		System.out.println(e.diff);
	}
}
