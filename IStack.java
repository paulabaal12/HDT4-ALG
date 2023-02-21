
/**
 * @author Paula Barillas, Ana paula Navas, Nicolle Gordillo 
 *
 */
public interface IStack<T> {

	int count();
	
	boolean isEmpty();
	
	void push(T value);
	
	T pull();
	
	T peek();
}

