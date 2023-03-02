
/**
 * Afiseaza cel mai mic numar dintr-un sir de numere.
 *
 * @author "Yours trully"
 * @version 1.0
 */
public class Tema2
{
    // instance variables - replace the example below with your own

    
    /**
     * Constructor for objects of class
     */
    public static void main(String[] args)
    {
        int[] arrayOfIntegers = { 32 , 44 , 7 , 96 , 74 , 12 , 20 , 33 , 51 , 99 };
        
        int small = sortareElementeSir(arrayOfIntegers);
        System.out.println("Cel mai mic numar al sirului este: " + small);
    }

    /**
     * Metoda de sortare a elementelor unui sir de numere naturale.
     *
     * @param  arrayOfIntegers - un sir de numere naturale.
     * @return result - cel mai mic element al sirului.
     */
    static int sortareElementeSir(int [] arrayOfIntegers)
    {
        int result = arrayOfIntegers[0];
        
        for (int i = 0;i < arrayOfIntegers.length; i++) //parcurge elementele din sir
        {
            if (arrayOfIntegers[i] < result) // compara elementul sirului cu result

            {
                result = arrayOfIntegers[i];// if true, atribuie valoarea lui result
            }
        }
    
        return result;
    }
}