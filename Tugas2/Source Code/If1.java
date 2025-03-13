/* contoh pemakaian IF satu kasus */
/* membaca nilai integer, menuliskan nilainya jika positif */

import java.util.Scanner;

public class If1 {

	public static void main(String[] args) {

		Scanner masukan=new Scanner(System.in);
		int a;

		System.out.print ("\nContoh IF satu kasus \n");
		System.out.print ("Ketikkan suatu nilai integer : ");
		
		a = masukan.nextInt();
		
		if (a >= 0)
		System.out.print ("Nilai a positif "+ a + "\n");
	}
}