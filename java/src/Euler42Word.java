/*
 * helper class for Euler42
 */
public class Euler42Word {
	double score;
	String word;
	
	public Euler42Word(String word, double score){
		this.word = word;
		this.score = score;
	}

	public double getScore() {
		return score;
	}

	public void setScore(double score) {
		this.score = score;
	}

	public String getWord() {
		return word;
	}

	public void setWord(String word) {
		this.word = word;
	}
}
