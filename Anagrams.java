package $Basic_Of_Programming;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.io.BufferedReader;
import java.io.IOException;
public class Anagrams {


	public static boolean isAnagrams(String a, String b) {

		a=a.toLowerCase();
		b=b.toLowerCase();

		char [] array1=a.toCharArray();

		char [] array2=b.toCharArray();

		Arrays.sort(array1);
		Arrays.sort(array2);


		if(array1.length != array2.length) {
			return false;
		}

		for(int i=0;i<array1.length;i++) {


			if(array1[i] != array2[i]) {
				return false;
			}
		}


		return true;
	}

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		InputStreamReader IO = new InputStreamReader(System.in);
		BufferedReader Br= new BufferedReader(IO);

		System.out.println("Enter the first String");
		String one=Br.readLine();
		System.out.println("Enter the second string");
		String two=Br.readLine();

		boolean result=isAnagrams(one,two);
		System.out.println(result);

	}

}
