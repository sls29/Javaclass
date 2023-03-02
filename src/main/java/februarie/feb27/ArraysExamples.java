package februarie.feb27;

public class ArraysExamples
{

    public static void main(String[] args)
    {
        //        intArraysExamples();
        //        stringsExamples();
        customBidirectionalArray();
        //        isStringSubstringOfAnotherString();
    }

    public static void isStringSubstringOfAnotherString()
    {
        System.out.println("isStringSubstringOfAnotherString");

        String fullName = "Catalin Stan";
        String nickname = "lin";

        final int indexOfNicknameInOriginalName = fullName.indexOf(nickname);

        final String substring = fullName.substring(indexOfNicknameInOriginalName);

        System.out.println("substring = " + substring);


    }

    public static void intArraysExamples()
    {
        System.out.println("intArraysExamples");
        // example of array usage in java
        int[] array = new int[5];

        array[0] = 1;
        array[1] = 2;
        array[2] = 3;
        array[3] = 4;
        array[4] = 5;

        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }

        int[][] matrix = new int[3][3];

        matrix[0][0] = 1;
        matrix[0][1] = 2;
        matrix[0][2] = 3;

        matrix[1][0] = 4;
        matrix[1][1] = 5;
        matrix[1][2] = 6;

        matrix[2][0] = 7;
        matrix[2][1] = 8;
        matrix[2][2] = 9;

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static void stringsExamples()
    {
        System.out.println("stringsExamples");

        char[] customString = new char[]{
            's',
            't',
            'r',
            'i',
            'n',
            'g',
            's',
            ' ',
            'E',
            'x',
            'a',
            'm',
            'p',
            'l',
            'e',
            's'
        };

        System.out.println(new String(customString));

        // example of array usage of Strings in java
        String[] strings = new String[5];

        strings[0] = "1";
        strings[1] = "2";
        strings[2] = "3";
        strings[3] = "4";
        strings[4] = "5";

        for (int i = 0; i < strings.length; i++) {
            System.out.println(strings[i]);
        }
    }

    public static void customBidirectionalArray()
    {
        System.out.println("customBidirectionalArray");

        int[][][] scores = {{{5, 2, 4, 7}, {9, 2}, {3, 4}}};


        // todo : write the code to initialize this array element by element

        printMatrix(scores);
    }

    public static void printMatrix(int[][][] matrix)
    {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print(printArray(matrix[i][j]) + " ");

            }
            System.out.println();
        }
    }

    public static String printArray(int[] arrayToPrint)
    {
        String toString = "";
        for (int i = 0; i < arrayToPrint.length; i++) {
            toString += arrayToPrint[i] + " ";
        }
        return toString;
    }


}
