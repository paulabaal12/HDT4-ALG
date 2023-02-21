import java.io.File;
import java.util.ArrayList;
import java.util.Scanner;
/**
 * @author Paula Barillas, Ana paula Navas, Nicolle Gordillo 
 *
 */
public class PostfixCalculator implements IPostfixCalculator  {
    ArrayList<String> stack = new ArrayList<>();
    /**
     *
     */
    @Override
    public boolean isOneItem(IStack operandos) {
        boolean item= false;
        if(stack.size()==1){
            item=true;
        }
        else{
            item=false;
        }
        return item;
    }

   
   
    @Override
    public int suma(int a, int b) {
        int resultado =a+b;
        return resultado;
    }

    @Override
    public int resta(int a, int b) {
        int resultado =a-b;
        return resultado;
    }

    @Override
    public int multiplicacion(int a, int b) {
        int resultado =a*b;
        return resultado;
    }
  
    @Override
    public int division(int a, int b) {
        int resultado =a/b;
        return resultado;
    }

 
    @Override
    public boolean isOperator(String item) {
        boolean op= false;
        for(int i=0;i<stack.size();i++){
            if(stack.get(i)=="+" || stack.get(i)=="-" || stack.get(i)=="*" || stack.get(i)=="/" ){
                op=true;
            }
            else{
                op=false;
            }
        }
        return op;
    }

    /**
     *@return stack
     */
    @Override
    public ArrayList<String> getItems(String _expresion) {
        stack.add( _expresion);
        return stack;
    }
    
}
