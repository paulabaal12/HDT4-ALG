
/**
 * @author Paula Barillas, Ana paula Navas, Nicolle Gordillo 
 *
 */
public interface IPostfixCalculator {
	
	boolean isOneItem(IStack operandos);
	
	/**
	 * @param a
	 * @param b
	 * @return
	 */
	int suma(int a, int b);
	
	/**
	 * @param a
	 * @param b
	 * @return
	 */
	int resta(int a, int b);
	
	/**
	 * @param a
	 * @param b
	 * @return
	 */
	int multiplicacion(int a, int b);
	
	/**
	 * @param a
	 * @param b
	 * @return
	 */
	int division(int a, int b);
	
	boolean isOperator(String item);
	
	java.util.ArrayList<String> getItems(String _expresion);
}