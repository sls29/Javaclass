
/**
 * Determinarea numerelor prime mai mici decat un numar dat.
 *
 * @author Yours trully
 * @version 1.0
 */
public class Tema5
{
    /**
     * Constructor for objects of class Tema5
     */


    public static void main(String[] args) {
        int number = 100;

        for (int j = 2; j < number; j++) {
            if (isPrime(j)) {
                System.out.println(" Numarul " + j + " este prim");
            }
        }
    }
    /**
     * Metoda de determinare a unui numar prim
     *
     * @param       n - un  numar natural
     * @return      boolean - true or false
     */
    
    static boolean isPrime(int n)
    {
        if (n <= 1)
            return false;

        for(int i = 2; i < n; i++)
        {    
            if (n % i == 0)
            {
            return false;
            }
        }
        return true;
    }
}