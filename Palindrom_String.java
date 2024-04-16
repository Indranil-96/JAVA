package $Basic_Of_Programming;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Palindrom_String {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		InputStreamReader IO = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(IO);

		String str = br.readLine();
		int length=str.length();
		for(int i=0;i<length/2;i++) {
			if(str.charAt(i)==str.charAt(length-1-i)) {
				System.out.println(" The string is palindrom");
			}
		}
		System.out.println(" The string is not palindrom");
	}
}
