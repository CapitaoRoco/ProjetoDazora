import java.util.*;
class CollatzBoladaoPassos{
	public static void main(int num) {
		System.out.println("Conjectura de Collatz pra vocês:");
		System.out.print("Coloque um número: ");
		System.out.println("Vai levar " + resolva(num) + " passos"); 
		
	}
	
	// collatz algorithm 
	// pre-condition: n > 1
	public static int resolva(int n) {
		if (n == 1) {
			System.out.println(n);
			return 0;
		} else if (n % 2 == 0) {
			System.out.println(n);
			return 1 + resolva(n / 2);
		} else {
			System.out.println(n);
			return 1 + resolva(n * 3 + 1);
		}	 	
	}

}