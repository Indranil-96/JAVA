package $Basic_Of_Programming;

import java.util.Scanner;

public class Series1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        int n=sc.nextInt();
        int sum=0,s = 0;
        
        for(int i=0;i<n;i++){
        	sum+=a;
            for(int j=0;j<=i;j++){
                s=(int) (Math.pow(2,i)*b);
            }
            sum+=s;
            System.out.print(sum+" ");
        }
        System.out.println();
        sc.close();
	}

}
