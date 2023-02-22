//Uso de codigo de referencia https://www.geeksforgeeks.org/convert-infix-expression-to-postfix-expression/
//Referencia como prueba
import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Stack;

public class infixtopostfix {
	static int prueba(char c)
    {
        switch (c) {
        case '+':
        case '-':
            return 1;
 
        case '*':
        case '/':
            return 2;
 
        case '^':
            return 3;
        }
        return -1;
    }

static String infixToPostfix(String exp)
{
    
    String resultado = new String("");

   
    Deque<Character> stack
        = new ArrayDeque<Character>();

    for (int i = 0; i < exp.length(); ++i) {
        char c = exp.charAt(i);

        // If the scanned character is an
        // operand, add it to output.
        if (Character.isLetterOrDigit(c))
            resultado += c;

        // If the scanned character is an '(',
        // push it to the stack.
        else if (c == '(')
            stack.push(c);

      
        else if (c == ')') {
            while (!stack.isEmpty()
                   && stack.peek() != '(') {
                resultado += stack.peek();
                stack.pop();
            }

            stack.pop();
        }
        else 
        {
            while (!stack.isEmpty()
                   && prueba(c) <= prueba(stack.peek())) {

                resultado += stack.peek();
                stack.pop();
            }
            stack.push(c);
        }
    }


    while (!stack.isEmpty()) {
        if (stack.peek() == '(')
            return "Invalid Expression";
        resultado += stack.peek();
        stack.pop();
    }
   
    return resultado;
}

public static void main(String[] args)
{
    String exp = "a+b*(c^d-e)^(f+g*h)-i";
   

    System.out.println(infixToPostfix(exp));
}
}