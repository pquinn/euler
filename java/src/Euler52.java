import java.util.ArrayList;

/*
It can be seen that the number, 125874, and its double, 251748, contain exactly the same digits, but in a different order.

Find the smallest positive integer, x, such that 2x, 3x, 4x, 5x, and 6x, contain the same digits.
 */
public class Euler52 {
	int solution = 0;
	
	public Euler52(){}
	
	public void run(){
		int i = 1;
		while(solution == 0){
			//System.out.println(i);
			if(containsSameDigits(i, i*2)){
				if(containsSameDigits(i, i*3)){
					if(containsSameDigits(i, i*4)){
						if(containsSameDigits(i, i*5)){
							if(containsSameDigits(i, i*6)){
								solution = i;
							} else {
								System.out.println("SO FUCKIN' CLOSE, BUT IT'S NOT " + i);
								break;
							}
						} else {
							System.out.println("AUGH ALMOST WITH " + i);
						}
					}
				}
			}
			i++;
		}
		
	}
	
	public static void main(String[] args){
		Euler52 e = new Euler52();
		e.run();
		System.out.println(e.solution);
	}
	
	public boolean containsSameDigits(int base, int n){
		ArrayList<Character> baseChar = toArrayList(Integer.toString(base).toCharArray());
		ArrayList<Character> nChar = toArrayList(Integer.toString(n).toCharArray());
		for(Character c : baseChar){
			if(nChar.contains(c)){
				nChar.remove(c);
			}
		}
		return nChar.size() == 0;
	}
	
	public ArrayList<Character> toArrayList(char[] c){
		ArrayList<Character> result = new ArrayList<Character>();
		for(int i = 0; i < c.length; i++){
			result.add(c[i]);
		}
		return result;
	}
	
}
