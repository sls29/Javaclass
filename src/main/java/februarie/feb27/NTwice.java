package februarie.feb27;

public class NTwice
{

    //
    //
    //nTwice("Hello", 2) → "Helo"
    //nTwice("Chocolate", 3) → "Choate"
    //nTwice("Chocolate", 1) → "Ce"

    public static void main(String[] args)
    {
        new NTwice().nTwice2("abcde;fghijklmno;pqrstu;vwxyz", 5);
    }

    public String nTwice(String str, int n)
    {

        String beginningOfWord = str.substring(0, n);

        String endOfWord = str.substring(str.length() - n);

        return beginningOfWord + endOfWord;
    }

    public String nTwice2(String str, int n)
    {

        // extrage primele n litere din string

        //extrange ultimele n litere din string

        // aduna stringurile si returneaza



        String beginningOfWord = "";
        for (int i = 0; i < n; i++) {
            beginningOfWord += str.charAt(i);
        }

        String endOfWord = "";

        for (int j = str.length() - n; j < str.length(); j++) {
            endOfWord += str.charAt(j);
        }

        return beginningOfWord + endOfWord;
    }


    //    Given a string and an int n, return a string made of the first and last n chars from the string. The string
    //    length will be at least n.


}
