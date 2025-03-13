import java.util.Scanner;

/* Baca N, Print i = 1 s/d N dengan WHILE */

public class PrintWhile {

	public static void main(String[] args) {

		int N;
		int i;
		Scanner masukan=new Scanner(System.in);


		System.out.print ("\nNilai N > 0 = "); 
		N = masukan.nextInt();
		i = 1; 

		System.out.print ("Print i dengan WHILE: \n");
		while (i <= N) { 
			System.out.println (i); 
			i++;	

		}; 	
	}
}