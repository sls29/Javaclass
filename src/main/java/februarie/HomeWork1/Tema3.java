
/**
 * Afiseaza cea mai mare cifra dintr-un numar natural.
 *
 * @author Yours trully
 * @version 1.0
 */
public class Tema3
{
        /**
     * Constructor for objects of class Tema3
     */
    public static void main(String[] args)
    {
        int number = 418347936;    
        int digit = maxDigitOfNumber(number);
        
        System.out.println(digit + " este cea mai mare cifra din numarul " + number);
        
    }

    /**
     * Metoda de identificare a cifrelor dintr-un numar
     * si compararea acestora pentru determinarea maximului.
     * 
     * @param  number - numarul verificat
     * @return result - cifra cu valoarea cea mai mare.
     */
    static int maxDigitOfNumber(int number)
    {
        int result = 0;
        
        while (number > 0)          //cat timp numarul este mai mare decat 0
        {
            int mod = number % 10;  //separa ultima cifra
            if(mod > result)
            {
                result = mod;       //daca cifra este mai mare se salveaza in result
            }
            number = number / 10;   //elimina ultima cifra din verificare
        }
        
        return result;
    }
}
