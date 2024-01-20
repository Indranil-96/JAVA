package MulpableY;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class multiplicable_Year {
	
	static int num=0;
	static int opr=0;
	static int opr2=0;
	static int count=0;
	static int digit=0;
	
	public static int LastDigitY(int year) {
		int lastD=year%1000;
		return lastD;
	}
	
	public static void CheckResult(int opr, int opr2, int Ylast2 ) {
		System.out.println ("Result: DD x MM == YYYY");
		if(opr*opr2==Ylast2) {
			System.out.println("The year is MultiPlicable year");
		}else {
			System.out.println("The year is not a Multiplicable year");
		}
	}
	

	public static void checkY(String date) {

		char year[]= date.toCharArray();	
		
		for(char element:year) {
			num=element-'0';
			
			if(num>=0) {
				digit=digit*10+num;
			}
			else if(num<0) {
				count++;
				if(count==1) {
					opr=digit;
					digit=0;
				}
				else if(count==2) {
					opr2=digit;
					digit=0;
				}
			}
		}
		int Ylast2=LastDigitY(digit);
		CheckResult(opr,opr2,Ylast2);
	}

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		InputStreamReader io = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(io);

		System.out.println("Enter the date You want to check in DD.MM.YYYY format-");
		String date=br.readLine();
		checkY(date);

	}

}
