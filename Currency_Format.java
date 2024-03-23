package $Basic_Of_Programming;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.text.NumberFormat;
import java.util.Currency;
import java.util.Locale;

class Currency_Format {
	
	/*
	 * Given a double-precision number,
	 *  , denoting an amount of money, use the NumberFormat class' getCurrencyInstance method to convert  
	 *  into the US, Indian, Chinese, and French currency formats. Then print the formatted values as follows:

		US: formattedPayment
		India: formattedPayment
		China: formattedPayment
		France: formattedPayment
	 */

	public static void main(String[] args)throws IOException {
		// TODO Auto-generated method stub
		InputStreamReader Io = new InputStreamReader(System.in);
		BufferedReader BR = new BufferedReader(Io);
		
		System.out.println("Enter the Payment Value");
		Double Payment=Double.parseDouble(BR.readLine());
		
		NumberFormat nf= NumberFormat.getCurrencyInstance(Locale.US);
		NumberFormat nf1= NumberFormat.getCurrencyInstance(Locale.CHINA);
		NumberFormat nf2= NumberFormat.getCurrencyInstance(Locale.FRANCE);
		NumberFormat nf3= NumberFormat.getCurrencyInstance(new Locale("en" , "IN"));
		
		
		String us=nf.format(Payment);
		String Chin=nf1.format(Payment);
		String France=nf2.format(Payment);
		String India=nf3.format(Payment);
		
		System.out.println(us);
		System.out.println(Chin);
		System.out.println(France);
		System.out.println(India);
	}

}
