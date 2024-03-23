package $Basic_Of_Programming;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;


/*
 * The following program will find out the day name for the date input
 * such as 
 * Input-- 12.05.2020
 * output-- Saturday
 */


public class Date_Time {


	public static int checkLeapYR(int starty, int endy) { // for counting LeapYears.

		int countLY=0;

		for(int i=starty;i<endy;i++) { 
			countLY++;
			
			if(i%4==0 || i%400==400) {
				countLY++;
			}
		}
		
//		System.out.println(countLY);


		return countLY;

	}
	
	
	public static void printDay(int day) {
		switch(day) {
		case 0: 
			System.out.println("Thursday");
			break;
		case 1:
			System.out.println("Friday");
			break;
		case 2:
			System.out.println("Saturday");
			break;
		case 3:
			System.out.println("Sunday");
			break;
		case 4:
			System.out.println("Monday");
			break;
		case 5:
			System.out.println("Tuesday");
			break;
			
		case 6:
			System.out.println("Wednesday");
			break;
		default:
			System.out.println("Something went wrong");
		}
	}


	public static int findDay(int month,int day, int year) {
		/*
		 * Let us take that 1st January 2015 was Thursday
		 * based on that we will do the rest calculation.
		 * 
		 */

		int cday=1;
		int cmonth=1;
		int cyear=2015;
		
		/*
		 * Here c indicate that it is taken for calculation.
		 * and d indicate difference between two dates.
		 */

		int dmonth,dDay,dyear,totaldays;

		if(year>cyear) {
			dyear=year-cyear;
			dDay=day-cday;
			dmonth=month-cmonth;
			
			int leapDay=checkLeapYR(cyear,year);
			totaldays=(dyear*365)+(dmonth*30)+dDay+leapDay;
		}

		else {
			dyear=cyear-year;
			dDay=day-cday;
			dmonth=month-cmonth;
			
			int leapday=checkLeapYR(year,cyear);
			totaldays=(dyear*365)+(dmonth*30)+dDay+leapday;
		}
		return totaldays;
	}

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		InputStreamReader IO= new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(IO);

		System.out.println("Enter the day month and Year");

		int day=Integer.parseInt(br.readLine());
		int month=Integer.parseInt(br.readLine());
		int year=Integer.parseInt(br.readLine());

		int result=findDay(month,day,year);
		
		int NameDay=result%7;
		printDay(NameDay);
		
		
//		System.out.println(result);
		
	}

}
