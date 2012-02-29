/*
If the numbers 1 to 5 are written out in words: one, two, three, four, five, then there are 3 + 3 + 5 + 4 + 4 = 19 letters used in total.

If all the numbers from 1 to 1000 (one thousand) inclusive were written out in words, how many letters would be used?


NOTE: Do not count spaces or hyphens. For example, 342 (three hundred and forty-two) contains 23 letters and 115 (one hundred and fifteen) contains 20 letters. The use of "and" when writing out numbers is in compliance with British usage.
 */
public class Euler17 {
	public double letterCount;
	
	public Euler17(){}
	
	public void run(){
		for(int i = 1; i < 1000; i++){
			char[] c = Integer.toString(i).toCharArray();
			letterCount += determineNumLetters(c, i);
			//test if we should be adding "and"
			if(i % 100 != 0 && i >= 100){
				System.out.println(i + " has an 'and'! +3");
				letterCount += 3;
			}
		}
		letterCount += 11; //one thousand
	}
	
	public static void main(String[] args){
		Euler17 e = new Euler17();
		e.run();
		System.out.println(e.letterCount);
	}
	
	public double determineNumLetters(char[] c, int i){
		double result = 0;
		if (c.length == 1) {
			result += lettersInOnesDigit(Character.digit(c[0], 10));
		} else if (c.length == 2) {
			if(c[0] != '1') {
				result += lettersInTensDigit(Character.digit(c[0], 10));
				result += lettersInOnesDigit(Character.digit(c[1], 10));
			} else { 
				result += specialCases(Character.digit(c[1], 10));
			}
		} else if (c.length == 3) {
			result += lettersInHundredsDigit(Character.digit(c[0], 10));
			if(c[1] != '1') {
				result += lettersInTensDigit(Character.digit(c[1], 10));
				result += lettersInOnesDigit(Character.digit(c[2], 10));
			} else { 
				result += specialCases(Character.digit(c[2], 10));
			}
		}
		System.out.println(result + " returned for " + i);
		return result;
		
	}
	
	public double lettersInOnesDigit(int n){
		switch(n){
			case 1:
				return 3; //one
			case 2:
				return 3; //two
			case 3:
				return 5; //three
			case 4:
				return 4; //four
			case 5:
				return 4; //five
			case 6:
				return 3; //six
			case 7:
				return 5; //seven
			case 8:
				return 5; //eight
			case 9:
				return 4; //nine
			default:
				return 0; //zero
			
		}
	}
	
	public double lettersInTensDigit(int n){
		switch(n){
			case 2:
				return 6; //twenty
			case 3:
				return 6; //thirty
			case 4:
				return 5; //forty
			case 5:
				return 5; //fifty
			case 6:
				return 5; //sixty
			case 7:
				return 7; //seventy
			case 8:
				return 6; //eighty
			case 9:
				return 6; //ninety
			default:
				return 0; //0
				
		}
	}
	
	public double lettersInHundredsDigit(int n){
		switch(n){
			case 1:
				return 10; //one hundred
			case 2:
				return 10; //two hundred
			case 3:
				return 12; //three hundred
			case 4:
				return 11; //four hundred
			case 5:
				return 11; //five hundred
			case 6:
				return 10; //six hundred
			case 7:
				return 12; //seven hundred
			case 8:
				return 12; //eight hundred
			case 9:
				return 11; //nine hundred
			default:
				return 0;
		}
	}
	
	public double specialCases(int n){
		switch(n){
			case 0:
				return 3; //ten
			case 1:
				return 6; //eleven
			case 2:
				return 6; //twelve
			case 3:
				return 8; //thirteen
			case 4:
				return 8; //fourteen
			case 5:
				return 7; //fifteen
			case 6:
				return 7; //sixteen
			case 7:
				return 9; //seventeen
			case 8:
				return 8; //eighteen
			case 9:
				return 8; //nineteen
			default:
				return 0; //zero
				
		}
	}
	
}
