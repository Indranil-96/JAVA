package $Basic_Of_Programming;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class String1 {

	public static void checkLength(String a , String b){
        if(a.length()>b.length()){
            System.out.println("Yes");
        }
        else{
            System.out.println("No");
        }
    }

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		InputStreamReader io = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(io);
		
		System.out.println("Enter the first string");
		String a=br.readLine();
		System.out.println("Enter the second string");
		String b=br.readLine();
		
		
		int sum=a.length()+b.length();
		System.out.println("The sum of the length of two string is = "+sum);
		
		int i=0,j=0;
		while(i<a.length() && j<b.length()) {
			int val1=a.charAt(i);
			int val2=b.charAt(j);
			if(val1>val2) {
				System.out.println("Yes");
				break;
			}
			else if(val1==val2) {
				i++;
				j++;
				if(i==a.length() || j==b.length()){
                    checkLength(a,b);
                    break;
                }
			}
			else {
				System.out.println("No");
				break;
			}
		}
		String str1=a.substring(0,1).toUpperCase()+a.substring(1);
        String str2=b.substring(0,1).toUpperCase()+b.substring(1);
		
		System.out.println(str1+" "+str2);
	}

}
