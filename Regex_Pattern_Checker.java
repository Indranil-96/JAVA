package $Basic_Of_Programming;
import java.util.regex.Pattern;
import java.util.regex.PatternSyntaxException;

import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Regex_Pattern_Checker {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		InputStreamReader IO = new InputStreamReader(System.in);
		BufferedReader BR = new BufferedReader(IO);
		
		String pattern=BR.readLine();
		
		try {
			Pattern.compile(pattern);
			System.out.println("Valid");
		}
		catch(PatternSyntaxException exception){
			System.out.println("Invalid");
		}
	}

}
