package main.java.februarie.feb27;

import java.util.Comparator;

public class PersonNameDescSorter implements Comparator<Person>
{

    @Override
    public int compare(Person o1, Person o2)
    {
        return o2.name.compareTo(o1.name);
    }
}
