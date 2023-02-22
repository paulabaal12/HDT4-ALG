/**
 * @author Paula Barillas USO DE HOJA DE TRABAJO 2
 *
 */
public interface IStack<T> {

	int count();
	
	boolean isEmpty();
	
	void push(T value);
	
	T pull();
	
	T peek();
}

