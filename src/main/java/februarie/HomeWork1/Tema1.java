
/**
 * Calculeaza suma primelor 100 de numere
 * mai mari decat 0 (zero).
 * @author "Yours trully"
 * @version 1.0
 */
public class Tema1
{
    // instance variables - replace the example below with your own
       

    /**
     * 
     * 
     */
    public static void main(String[] args)
    {
        int number = 100;
        int sum = calculSuma(number);
        System.out.println("Suma primelor " + number + " numere este:" + sum);
        
    }

    /**
     * Metoda de determinare a sumei primelor "n" numere.
     *
     * @param number  - numarul de termeni ai sumei.
     * @return result - suma 
     */
    static int calculSuma(int number)
    {
       int result = 0;
       
        for (int i = 1; i <= number; i++)
        {
           result += i;
        }
        
        return result;
    }
    
}
