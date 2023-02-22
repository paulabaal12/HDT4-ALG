/**
 * @author Paula Barillas
 *
 */

public class Singlenton {
	private static Singlenton instancia;
	
	private Singlenton() {
		
	}
	public static Singlenton getInstance() {
        if(instancia == null) {
        	instancia = new Singlenton();
        }
        return instancia;
    }
    
    public void clasesngleton() {
        // instancia de la calculadora 
    }
}
