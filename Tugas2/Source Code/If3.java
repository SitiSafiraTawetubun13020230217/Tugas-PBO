import java.util.Scanner;

/* contoh pemakaian IF tiga kasus */ /* Membaca sebuah nilai, */
/* menuliskan 'Nilai a positif , nilai a', jika a >0 */kala
/* 'Nilai Nol , nilai a', jika a = 0 */
/* 'Nilai a negatif , nilai a', jika a <0 */

public class If3 {

	public static void main(String[] args) {

		int a;
		Scanner masukan=new Scanner(System.in);

		System.out.print ("\nContoh IF tiga kasus \n");
		System.out.print ("Ketikkan suatu nilai integer :");
		a=masukan.nextInt();
		if (a > 0){
			System.out.println ("Nilai a positif "+ a);
		}else if (a == 0){
			System.out.println ("Nilai Nol "+ a);
		}else {
			System.out.println ("Nilai a negatif "+ a);
		}
	}
}