/*
If we list all the natural numbers below 10 that are multiples of 3 or 5, we get 3, 5, 6 and 9. The sum of these multiples is 23.

Find the sum of all the multiples of 3 or 5 below 1000.
*/
public class Euler1 {
	
	int sum;
	
	public Euler1(){}
	
	public void run(){
		for(int i = 0; i < 1000; i++){
			if(i % 3 == 0 || i % 5 == 0)
				sum += i;
		}
	}
	
	public static void main(String[] args){
		Euler1 e = new Euler1();
		e.run();
		System.out.println(e.sum);
	}	
}
