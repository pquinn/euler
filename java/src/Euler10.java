import java.util.ArrayList;

/*
The sum of the primes below 10 is 2 + 3 + 5 + 7 = 17.

Find the sum of all the primes below two million.
 */
public class Euler10 {
	int sum;
	int listIterations = 0;
	
	public Euler10(){}
	
	public void run(){
		ArrayList<Integer> primes = sieve(2000000);
		this.sum = sumArrayList(trimList(primes));
	}
	
	public ArrayList<Integer> sieve(int n){
		ArrayList<Integer> numbers = new ArrayList<Integer>();
		int upperBoundSquareRoot = (int) Math.sqrt(n);
	      boolean[] isComposite = new boolean[n + 1];
	      for (int m = 2; m <= upperBoundSquareRoot; m++) {
	            if (!isComposite[m]) {
	                  numbers.add(m);
	                  for (int k = m * m; k <= n; k += m)
	                        isComposite[k] = true;
	            }
	      }
	      for (int m = upperBoundSquareRoot; m <= n; m++)
	            if (!isComposite[m])
	                  numbers.add(m);
		return numbers;
	}
	
	public static void main(String[] args){
		Euler10 e = new Euler10();
		//System.out.println(e.generateArrayList(120).toString());
		e.run();
		//System.out.println(e.trimList(e.sieve(120)).toString());
		//System.out.println(e.listIterations);
		System.out.println(e.sum);
	}
	
	public ArrayList<Integer> generateArrayList(int n){
		ArrayList<Integer> result = new ArrayList<Integer>();
		for (int i = 2; i < n; i++){
			result.add(i);
		}
		return result;
	}
	
	public int sumArrayList(ArrayList<Integer> in){
		int sum = 0;
		for(int i : in){
			sum += i;
		}
		return sum;
	}
	
	public ArrayList<Integer> trimList(ArrayList<Integer> in){
		ArrayList<Integer> result = new ArrayList<Integer>();
		for(int num : in){
			if (num != 0)
				result.add(num);
		}
		return result;
	}
}
