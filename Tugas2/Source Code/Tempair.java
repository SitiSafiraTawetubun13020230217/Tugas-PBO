import java.util.Scanner;

/* contoh pemakaian IF tiga kasus : wujud air */

public class Tempair {

	public static void main(String[] args) {

		int T;
		Scanner masukan=new Scanner(System.in);

		System.out.print ("\nContoh IF tiga kasus \n");
		System.out.print ("Temperatur (der. C) = ");
		
		T=masukan.nextInt();
		
		if (T < 0) {
			System.out.print ("\nWujud air beku : " + T + " der.C\n" );
		}else if ((0 <= T) && (T <= 100)){
			System.out.print ("\nWujud air cair : "+ T + " der.C\n");
		}else if (T > 100){
			System.out.print ("\nWujud air uap/gas : "+ T + " der.C\n");
		};
	}
}