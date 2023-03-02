package februarie.feb27;

import java.util.Collections;
import java.util.List;

public class CollectionsExample
{

    public static void main(String[] args)
    {
        // Collections
        //• Collection vs collection
        //• operations on collections
        //• Interface and Class Hierarchy

        emptyListThrowsException();
    }

    private static void emptyListThrowsException()
    {
        final List<Object> objects = Collections.emptyList();

        // uncomment the following line if you like to live dangerously
//        objects.add(new Object());

        System.out.println(objects);
    }
}
