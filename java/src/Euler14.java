/*
The following iterative sequence is defined for the set of positive doubleegers:

n  n/2 (n is even)
n  3n + 1 (n is odd)

Using the rule above and starting with 13, we generate the following sequence:

13  40  20  10  5  16  8  4  2  1
It can be seen that this sequence (starting at 13 and finishing at 1) contains 10 terms. Although it has not been proved yet (Collatz Problem), it is thought that all starting numbers finish at 1.

Which starting number, under one million, produces the longest chain?
 */
public class Euler14 {
	double solution = 0;
	double start;
	
	public Euler14(){}
	
	public void run(){
		double n, chain;
		for(double i = 1; i < 1000000; i++){
			n = i;
			chain = 0;
			while(true){
				if(n % 2 == 0){
					n = n / 2;
				} else if (n % 2 == 1 && n != 1){
					n = (3 * n) + 1;
				} else {
					break;
				}
				chain++;
			}
			if(chain >= solution && i > start){
				solution = chain;
				start = i;
				System.out.println("new high found: " + i + " with " + chain + " links.");
			}
			n = 0;
			chain = 0;
		}
	}
	
	public static void main(String[] args){
		Euler14 e = new Euler14();
		e.run();
		System.out.println(e.solution + " " + e.start);
		System.out.println(e.links(837799));
	}
	
	public double links(double n){
		double chain = 0;
		while(true){
			if(n % 2 == 0){
				System.out.println("n before: " + n);
				n = n / 2;
				System.out.println("n after: " + n);
				chain++;
			} else if (n % 2 == 1 && n != 1){
				System.out.println("n before: " + n);
				n = (3 * n) + 1;
				System.out.println("n after: " + n);
				chain++;
			} else {
				chain++;
				break;
			}
		}
		return chain;
	}

}
