package $Basic_Of_Programming;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
public class Lexicographical_Order {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		InputStreamReader IO = new InputStreamReader(System.in);
		BufferedReader br= new BufferedReader(IO);

		System.out.println("Please provide valid input");
		String s=br.readLine();
		int k=Integer.parseInt(br.readLine());


		String smallest=s.substring(0, k);
		String largest=s.substring(0, k);
		int start=0;
		
		while(k<s.length()+1) {
			String cons=s.substring(start,k);
			if(cons.compareTo(largest)>0) {
				largest=cons;
			}

			if(cons.compareTo(smallest)<0) {
				smallest=cons;
			}
			
			start++;
			k++;
		}
		
		System.out.println(smallest+" "+largest);

	}

}
