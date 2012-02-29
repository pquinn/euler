/*
You are given the following information, but you may prefer to do some research for yourself.

1 Jan 1900 was a Monday.
Thirty days has September,
April, June and November.
All the rest have thirty-one,
Saving February alone,
Which has twenty-eight, rain or shine.
And on leap years, twenty-nine.
A leap year occurs on any year evenly divisible by 4, but not on a century unless it is divisible by 400.
How many Sundays fell on the first of the month during the twentieth century (1 Jan 1901 to 31 Dec 2000)?

Phil Note = January 1st, 1901 was a TUESDAY
 */
public class Euler19 {
	int year = 1;
	int day = 1;
	int totalDays = 0;
	int month = 1;
	int solution = 0;
	
	public Euler19(){}
	
	public void run(){
		boolean yearUp = true;
		while(year <= 100){
			if(year % 4 == 0){
				System.out.println((year + 1900) + " is a leap year.");
			} else {
				System.out.println((year + 1900) + " is not a leap year.");
			}
			while(month < 12){
				while(yearUp){
					totalDays++;
					month += advanceMonth(day, year%4==0);
					if(whatDay(totalDays+2).equals("sunday") && advanceMonth(day, year%4 == 0) == 1){
						solution++;
						System.out.println(whichMonth(month) + " of " + (year + 1900) + " starts on a sunday.");
					}
					day++;
					yearUp = year % 4 == 0 ? day <= 366 : day <= 365;
				}
				System.out.println("there were " + day + " days in this year");
				System.out.println("so far there have been " + totalDays + " days");
				day = 1;
				year++;
				yearUp = true;
			}
			month = 1;
		}
		System.out.println("there were " + totalDays + " total days in this century");
	}
	
	public static void main(String[] args){
		Euler19 e = new Euler19();
		e.run();
		System.out.println(e.solution);
	}
	
	public String whatDay(int n){
		int nMod = n % 7;
		switch(nMod){
			case 1:
				return "tuesday";
			case 2:
				return "wednesday";
			case 3:
				return "thursday";
			case 4:
				return "friday";
			case 5:
				return "saturday";
			case 6:
				return "sunday";
			case 0:
				return "monday";
			default:
				return "error";
		}
	}
	
	public int advanceMonth(int days, boolean leap){
		if(!leap){
			switch(days){
				case 31: //jan = 31
					return 1;
				case 59: //jan + feb = 31 + 28 = 59
					return 1;
				case 90: //jan + feb + mar = 31 + 28 + 31 = 90
					return 1;
				case 120: //jan + feb + mar + apr = 31 + 28 + 31 + 30 = 120
					return 1;
				case 151: //jan + feb + mar + apr + may = 31 + 28 + 31 + 30 + 31 = 151
					return 1;
				case 181: //jan + feb + mar + apr + may + jun = 31 + 28 + 31 + 30 + 31 + 30 = 181;
					return 1;
				case 212:
					return 1;
				case 243:
					return 1;
				case 273: 
					return 1;
				case 304:
					return 1;
				case 334:
					return 1;
				case 365:
					return 1;
				default:
					return 0;
				
			}
		} else {
			switch(days){
				case 31:
					return 1;
				case 60:
					return 1;
				case 91:
					return 1;
				case 121:
					return 1;
				case 152:
					return 1;
				case 182:
					return 1;
				case 213:
					return 1;
				case 244:
					return 1;
				case 274: 
					return 1;
				case 305:
					return 1;
				case 335:
					return 1;
				case 366:
					return 1;
				default:
					return 0;
				
			}
		}
	}
	
	public String whichMonth(int n){
		switch (n){
			case 1:
				return "january";
			case 2:
				return "february";
			case 3:
				return "march";
			case 4:
				return "april";
			case 5:
				return "may";
			case 6:
				return "june";
			case 7:
				return "july";
			case 8:
				return "august";
			case 9:
				return "september";
			case 10:
				return "october";
			case 11:
				return "november";
			case 12:
				return "december";
			default:
				return "what the shit";
				
				
		}
	}
	
	
}
