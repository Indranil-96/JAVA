package $Basic_Of_Programming;
import java.util.Scanner;

import java.util.regex.*;


/*
 * Write a class called MyRegex which will contain a string pattern. You need to write a regular expression 
 * and assign it to the pattern such that it can be used to validate an IP address. Use the following definition 
 * of an IP address:
 */

public class MyRegex {
	
	 private String pattern;
	
	public MyRegex() {
        // Regular expression for validating an IP address
        pattern = "^((25[0-5]|2[0-4][0-9]|[01]?[0-9][0-9]?)\\.){3}(25[0-5]|2[0-4][0-9]|[01]?[0-9][0-9]?)$";
    }
	
	 public boolean validateIP(String ipAddress) {
	        // Compile the pattern
	        Pattern p = Pattern.compile(pattern);
	        // Match the pattern with the input IP address
	        Matcher m = p.matcher(ipAddress);
	        // Return true if the IP address matches the pattern, false otherwise
	        return m.matches();
	    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		MyRegex Regex= new MyRegex();
		while(sc.hasNext()) {
			String ip=sc.next();
			System.out.println(Regex.validateIP(ip));
		}
	}

}
