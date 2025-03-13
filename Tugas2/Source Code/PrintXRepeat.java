import java.util.Scanner;

/* contoh baca nilai x, */
/* Jumlahkan nilai yang dibaca dengan ITERATE */

public class PrintXRepeat {

	public static void main(String[] args) {

		int Sum;
		int x;
		Scanner masukan=new Scanner(System.in);

		System.out.print ("\nMasukkan nilai x (int), akhiri dg 999 : ");
		x = masukan.nextInt(); 

		if (x == 999){
			System.out.print("Kasus kosong \n");
		}else { 
			Sum = 0; 
			do{
				Sum = Sum + x; 
				System.out.print ("Masukkan nilai x (int), akhiri dg 999 : ");

				x = masukan.nextInt(); 
			} while (x != 999); 

			System.out.println ("\nHasil penjumlahan = "+Sum);
		}
	}
}