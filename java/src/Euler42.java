import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

/*
The nth term of the sequence of triangle numbers is given by, tn = .5n(n+1); so the first ten triangle numbers are:

1, 3, 6, 10, 15, 21, 28, 36, 45, 55, ...

By converting each letter in a word to a number corresponding to its alphabetical position and adding these values we form a word value. For example, the word value for SKY is 19 + 11 + 25 = 55 = t10. If the word value is a triangle number then we shall call the word a triangle word.

Using words.txt (right click and 'Save Link/Target As...'), a 16K text file containing nearly two-thousand common English words, how many are triangle words?
 */
public class Euler42 {
	int solution = 0;
	ArrayList<Euler42Word> words = new ArrayList<Euler42Word>();
	ArrayList<Double> triangleNumbers = new ArrayList<Double>();
	
	public void run(){
		try {
			File f = new File("../../words.txt");
			Scanner scan = new Scanner(f).useDelimiter("\",\"");
			while(scan.hasNext()){
				words.add(new Euler42Word(scan.next(), 0));
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		calculateWordScores();
		populateTriangleNumbers(1000);
		triangleWords();
	}
	
	public static void main(String[] args){
		Euler42 e = new Euler42();
		System.out.println(System.getProperty("user.dir"));
		e.run();
		System.out.println(e.words.size());
		System.out.println(e.solution);
		e.debugWords(10);
		e.debugNumbers(10);
		System.out.println(e.isTriangleNumber(29));
		System.out.println(e.isTriangleNumber(55));
	}
	
	public void debugWords(int n){
		System.out.println("debugging the first " + n + " items of the list...");
		for(int i = 0; i < n; i++){
			System.out.println(i + ": " + words.get(i).getWord() + " / " + words.get(i).getScore());
		}
		System.out.println("debugging complete");
	}
	
	public void debugNumbers(int n){
		System.out.println("debugging the first " + n + " items of the list...");
		for(int i = 0; i < n; i++){
			System.out.println(i + ": " + triangleNumbers.get(i));
		}
		System.out.println("debugging complete");
	}
	
	public void triangleWords(){
		for(Euler42Word word : words){
			if(isTriangleNumber(word.getScore())){
				solution++;
			}
		}
	}
	
	public boolean isTriangleNumber(double n){
		return triangleNumbers.contains(n);
	}
	
	public void calculateWordScores(){
		System.out.println("calculating word scores");
		for (Euler42Word word: words){
			double score = 0;
			String str = word.getWord();
			char[] chars = str.toCharArray();
			for(int i = 0; i < chars.length; i++){
				score += getLetterScore(chars[i]);
			}
			word.setScore(score);
		}
	}
	
	public int getLetterScore(char letter){
		if(letter == ('A')){
			return 1;
		} else if(letter == ('B')){
			return 2;
		} else if(letter == ('C')){
			return 3;
		} else if(letter == ('D')){
			return 4;
		} else if(letter == ('E')){
			return 5;
		} else if(letter == ('F')){
			return 6;
		} else if(letter == ('G')){
			return 7;
		} else if(letter == ('H')){
			return 8;
		} else if(letter == ('I')){
			return 9;
		} else if(letter == ('J')){
			return 10;
		} else if(letter == ('K')){
			return 11;
		} else if(letter == ('L')){
			return 12;
		} else if(letter == ('M')){
			return 13;
		} else if(letter == ('N')){
			return 14;
		} else if(letter == ('O')){
			return 15;
		} else if(letter == ('P')){
			return 16;
		} else if(letter == ('Q')){
			return 17;
		} else if(letter == ('R')){
			return 18;
		} else if(letter == ('S')){
			return 19;
		} else if(letter == ('T')){
			return 20;
		} else if(letter == ('U')){
			return 21;
		} else if(letter == ('V')){
			return 22;
		} else if(letter == ('W')){
			return 23;
		} else if(letter == ('X')){
			return 24;
		} else if(letter == ('Y')){
			return 25;
		} else if(letter == ('Z')){
			return 26;
		} else {
			return 0;
		}
	}
	
	public void populateTriangleNumbers(int n){
		for(int i = 1; i <= n; i++){
			triangleNumbers.add(i * (i+1) * .5);
		}
	}
}
