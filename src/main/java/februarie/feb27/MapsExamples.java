package main.java.februarie.feb27;

import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class MapsExamples
{
    public static void main(String[] args)
    {
        Map<String, Person> map = new HashMap<>();

        Person catalin = new Person("Catalin Stan", "Student", "1930120");
        Person gabriel = new Person("Catalin Stan", "Student", "1930120");
        Person giulia = new Person("Giulia Stan", "Student", "2970505");

        map.put(catalin.cnp, catalin);
        map.put(giulia.cnp, giulia);


        System.out.println(map);

        final Person person1 = map.put(gabriel.cnp, gabriel);

        System.out.println(person1 == catalin);
        System.out.println(person1 == gabriel);


        System.out.println(map);

        final Person person = map.get("1930120");

        System.out.println(person.equals(catalin));
        System.out.println(person == catalin);
        System.out.println(person.equals(gabriel));
        System.out.println(person == gabriel);

    }
}
