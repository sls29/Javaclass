
/**
 * Verifica daca un numar este palindrome
 *
 * @author "Yours trully"
 * @version 1.0
 */
public class Tema4
{
        /**
     * Constructor for objects of class Tema4
     */
    public static void main(String[] args)
    {
        int number = 123454321;
        int invers = findIfIsPalindrome(number);
        
        if(number == invers)
        {
            System.out.println("Numarul " + number + " este palindrome");
        } else {
            System.out.println("Numarul " + number + " nu este palindrome");
        }
        
    }

    /**
     * Metoda de verificare daca un numar este palindrome
     *
     * @param   number - numarul care se verifica
     * @return  sum - numarul inversat
     */
    static int findIfIsPalindrome(int number)
    {
        
        int reminder, sum = 0;
        
        while(number > 0)
        {
            reminder = number % 10;
            sum = (sum * 10) + reminder;
            number /= 10;
        }
    
        return sum;
    }
}
