import java.util.Scanner;

/* Contoh membaca integer menggunakan Class Scanner */
public class BacaData {
	/**
	* @param args
	*/
	public static void main(String[] args) {
        	// TODO Auto-generated method stub
		/* Kamus */
		int a;
        	Scanner masukan;

		/* Program */
        	System.out.print("Contoh membaca dan menulis, ketik nilai integer: ");
       		masukan = new Scanner(System.in);
       	 	a = masukan.nextInt(); 	/* coba ketik : masukan.nextInt(); ; Apa akibatnya ?*/
  
        	System.out.println("Nilai yang dibaca: " + a);
        
        	//masukan.close();
    	}
}
