package main.java.februarie.feb27;

public class Double23
{

    public static void main(String[] args)
    {
        new Double23().double23(new int[3]);

        testBoolean(true);
    }

    private static boolean testBoolean(boolean condition)
    {
        if (condition){
            return true;
        } else {
            return false;
        }
    }

    public boolean double23(int[] nums)
    {
        if (nums.length < 2) {
            return false;
        }
        // here we are guaranteed to have 2 elements in the array

        if ((nums[0] == 2 && nums[1] == 2)) {
            return true;
        }
        if ((nums[0] == 3 && nums[1] == 3)) {
            return true;
        }
        return false;
    }

    //    Given an int array, return true if the array contains 2 twice, or 3 twice. The array will be length 0, 1,
    //    or 2.
    //
    //
    //    double23([2, 2]) → true
    //    double23([3, 3]) → true
    //    double23([2, 3]) → false

}
