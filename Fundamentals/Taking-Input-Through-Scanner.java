package fundamental;
import java.util.Scanner;

// Taking input through Scanner Class.
public class TakingInput {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		int a,b;
		a = s.nextInt();
		b = s.nextInt();
		int sum=a+b;
		System.out.println(sum);
		s.close();
	}

}
