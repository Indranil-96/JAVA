package $Basic_Of_Programming;
import java.util.Scanner;

public class Palindrom_String2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
        String A=sc.next();
        sc.close();
        int length=A.length();
        for(int i=0;i<length/2;i++) {
            if(A.charAt(i)!=A.charAt(length-1-i)) {
                System.out.println("No");
                return;
            }
        }
        System.out.println("Yes");
	}
	
}
