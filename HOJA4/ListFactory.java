/**
 * @author Paula Barillas
 *
 */
import structure5.AbstractList;
import structure5.SinglyLinkedList;
import structure5.DoublyLinkedList;
//Creación del metodo instance 
public class ListFactory<T> {

	public AbstractList<T> getInstance(String type){
		AbstractList<T> listInstance;
		
		switch (type.toLowerCase()){
		case "single" :{
		}break ;
		case "double" :{
		}break ;
		
		default:{
			
		}break ;
		return listInstance;
		}}
		
		
	}
}
	