package main.java.februarie.feb27;

public class SameEnds
{

    public static void main(String[] args)
    {
        new SameEnds().sameEnds("aaaa");
    }


    public String getBeginingHalf(String string, int i)
    {
        final int halfWayThere = string.length() / 2;
        final String substring = string.substring(0, halfWayThere - i);
        return substring;
    }

    public String getEndingHalf(String string, int i)
    {
        final int halfWayThere = string.length() / 2 + string.length() % 2;
        final String substring = string.substring(halfWayThere + i);
        return substring;
    }


    public String sameEnds(String string)
    {
        final int halfWayThere = string.length() / 2;

        for (int i = 0; i < halfWayThere; i++) {
            final String beginingHalf = getBeginingHalf(string, i);
            final String endingHalf = getEndingHalf(string, i);
            if (beginingHalf.equals(endingHalf)) {
                return beginingHalf;
            }
        }


        return "";
    }

}
