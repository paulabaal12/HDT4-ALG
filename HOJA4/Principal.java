import java.io.BufferedReader;
import java.io.FileReader;
/**
 * @author Paula Barillas USO DE HOJA DE TRABAJO 2
 *
 */
public class Principal {
    
    /** 
     * @param args
     * @throws Exception
     */
    public static void main(String[] args) throws Exception {
        BufferedReader reader;
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
