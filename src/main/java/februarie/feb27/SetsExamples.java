package main.java.februarie.feb27;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

public class SetsExamples
{
    public static void main(String[] args)
    {

        Collection<Person> setPeople = new HashSet<>();

        Person catalin = new Person("Catalin Stan", "Student");
        Person gabriel = new Person("Catalin Stan", "Student");
        Person giulia = new Person("Giulia Stan", "Student");

        setPeople.add(catalin);
        setPeople.add(gabriel);
        setPeople.add(giulia);

        System.out.println("is catalin and giulia the same? " + catalin.equals(giulia));
        System.out.println("is catalin and catalin the same? " + catalin.equals(gabriel));
        System.out.println("is catalin and catalin the same? " + catalin.hashCode());

        ListExamples.printNameOfPeople3(setPeople);



    }


}
