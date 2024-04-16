package String;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class First_Occurance {
	
	public static int Stringfy(String haystack, String needle) {
		
		int index=haystack.indexOf(needle);
		
		return index;
	}

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		InputStreamReader IO = new InputStreamReader(System.in);
		BufferedReader BR = new BufferedReader(IO);
		
		String str1=BR.readLine();
		String str2=BR.readLine();
		
		int result=Stringfy(str1,str2);
		
		if(result != -1) {
			System.out.println("First Occurence is -"+result);
		}else {
			System.out.println("Occurence is not present");
		}
		
	}

}
