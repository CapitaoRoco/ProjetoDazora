import java.util.*;
import Collatz
public class CollatzTestDrive {
	public static void main(String[] args){
		Scanner console = new Scanner(System.in);
		CollatzBoladaoPassos collatz = new CollatzBoladaoPassos();
		System.out.println("Conjectura de Collatz pra voces:");
		System.out.print("Coloque um numero: ");
		int num = console.nextInt();
		System.out.println("Vai levar " + collatz.resolva(num) + " passos"); 
	}
}