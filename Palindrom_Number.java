package $Basic_Of_Programming;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Palindrom_Number {

	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
		InputStreamReader IO= new InputStreamReader(System.in);
		BufferedReader br= new BufferedReader(IO);
		
		int num=Integer.parseInt(br.readLine());
		String nums=Integer.toString(num);
		int n=nums.length();
		
		for(int i=0;i<n/2;i++) {
			if(nums.charAt(i)==nums.charAt(n-i-1)) {
				System.out.println("It is a Palindrom Number");
			}
		}
	}

}
