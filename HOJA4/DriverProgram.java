import java.util.Scanner;

import structure5.SinglyLinkedList;

public class DriverProgram {
	
	public static void main(String[] args) {
		
	
	Scanner in = new Scanner (System.in); 
	String escrituranumeros = "";
	SinglyLinkedList<String> miLista = new SinglyLinkedList<String>();
	
	do {
		
		System.out.println("Ingrese los números que desea operar en sistema Postfix");
		escrituranumeros = in.nextLine();
		miLista.addLast(escrituranumeros);
	} while (!escrituranumeros.equalsIgnoreCase("Salir"));
	
	System.out.println(miLista.toString());
	
	}
}
