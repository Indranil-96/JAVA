package $Basic_Of_Programming;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

/*
 * Given a string, , matching the regular expression [A-Za-z !,?._'@]+, 
 * split the string into tokens. We define a token to be one or more consecutive English alphabetic letters.
 * Then, print the number of tokens, followed by each token on a new line.
 */

public class String_Token {

	public static void Stringtokenizer(String str) {
		String s = str;
        String[] tokens = s.split("[^A-Za-z]+");

        System.out.println(tokens.length);
        for (String token : tokens) {
         System.out.println(token);
        }
	}

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		InputStreamReader Io = new InputStreamReader(System.in);
		BufferedReader Br = new BufferedReader(Io);

		String str= Br.readLine();
		Stringtokenizer(str);

	}

}
