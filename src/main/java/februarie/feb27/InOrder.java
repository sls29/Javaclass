package main.java.februarie.feb27;

public class InOrder
{

    public static void main(String[] args)
    {
        new InOrder().inOrder(1, 2, 1, false);
        new InOrder().inOrder(1, 1, 2, true);

    }

    public boolean inOrder(int a, int b, int c, boolean bOk)
    {
//        return !bOk ?  b > a && c > b : c > b;
        if (!bOk) {
            return b > a && c > b;
        } else {
            return c > b;
        }
    }

    //
    //    Given three ints, a b c, return true if b is greater than a, and c is greater than b. However, with the
    //    exception that if "bOk" is true, b does not need to be greater than a.
    //
    //
    //                                                                                                                                                                                    inOrder(1, 2, 4, false) → true
    //    inOrder(1, 2, 1, false) → false
    //    inOrder(1, 1, 2, true) → true

}
