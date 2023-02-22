import java.io.BufferedReader;
import java.io.FileReader;
import java.util.Scanner;

import structure5.SinglyLinkedList;
/**
 * @author Paula Barillas
 *
 */
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
	
	  {BufferedReader reader;
      String line;
      int noOfLines=0;
		reader = new BufferedReader(new FileReader("datos.txt"));
      StackHandmade<Integer> calc = new StackHandmade<Integer>();
      PostfixCalculator postCalc= new PostfixCalculator();
      while (reader.readLine() != null) {
          noOfLines++;
      }
      reader = new BufferedReader(new FileReader("datos.txt"));
      for(int l=0; l<noOfLines;l++){
          line = reader.readLine();
          for(int i=0; i<line.length(); i++){
              char c = line.charAt(i);
              int a =0;
              int b=0;
              if(Character.isDigit(c)){
                  int t = Character.getNumericValue(c);
                      calc.push(t);
                  }
                  else if(c == '+'){
                      a = calc.pull();
                      b = calc.pull();
                      calc.push(postCalc.suma(a, b));
                  }
                  else if(c == '-'){
                  a = calc.pull();
                  b = calc.pull();
                  calc.push(postCalc.resta(a, b));
                  }
                  else if(c == '*'){
                  a = calc.pull();
                  b = calc.pull();
                  calc.push(postCalc.multiplicacion(a, b));
                  }
                  else if(c == '/'){
                  a = calc.pull();
                  b = calc.pull();
                  calc.push(postCalc.division(a, b));
                  }
          }
          System.out.print(line+" = "+calc.pull()+"\n");
      } 
      

  }
      
   
  
}

}
