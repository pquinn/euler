/*
2520 is the smallest number that can be divided by each of the numbers from 1 to 10 without any remainder.

What is the smallest positive number that is evenly divisible by all of the numbers from 1 to 20?
*/

public class Euler5{
	int answer;
	
	public Euler5(){}
	
	public void run(){
		int i = 20;
		boolean solved = false;
		while(!solved){
			if(i%19==0){
				if(i%18==0){
					if(i%17==0){
						if(i%16==0){
							if(i%15==0){
								if(i%14==0){
									if(i%13==0){
										if(i%12==0){
											if(i%11==0){
												answer = i;
												solved = true;
												break;
											} else {
												i+=20;
												continue;
											}
										} else {
											i+=20;
											continue;
										}
									} else {
										i+=20;
										continue;
									}
								} else {
									i+=20;
									continue;
								}
							} else {
								i+=20;
								continue;
							}
						} else {
							i+=20;
							continue;
						}
					} else {
						i += 20;
						continue;
					}
				} else {
					i+=20;
					continue;
				}
			} else {
				i+=20;
				continue;
			}
		}
			
	}
	
	public static void main(String[] args){
		Euler5 e = new Euler5();
		e.run();
		System.out.println(e.answer);
	}
}
