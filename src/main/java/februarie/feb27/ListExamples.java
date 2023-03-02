package main.java.februarie.feb27;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class ListExamples
{

    public static void main(String[] args)
    {
        List<Person> people = new ArrayList<>();

        Person catalin = new Person("Catalin", "Somer");

        catalin.getNameAndType();

        catalin.name = "Catalin Stan";
        Person silvia = new Person("Silvia", "Mother");

        silvia.getNameAndType();

        people.add(catalin);
        people.add(silvia);


        printNameOfPeople3(people);

        Collections.sort(people, new PersonNameDescSorter());

        printNameOfPeople3(people);

    }

    public static void printNameOfPeople1(List<Person> people)
    {
        System.out.println("printNameOfPeople1");
        for (int index = 0; index < people.size() - 1; index++) {
            System.out.print(people.get(index).name);
            if (index != people.size() - 1) {
                System.out.print(", ");
            }
        }
        System.out.println();

    }

    public static void printNameOfPeople2(List<Person> people)
    {
        System.out.println("printNameOfPeople2");

        System.out.println(people);

    }

    public static void printNameOfPeople3(Collection<Person> people)
    {
        System.out.println("printNameOfPeople3");

        Iterator<Person> peopleIterator = people.iterator();

        //        peopleIterator.hasNext();

        //        peopleIterator.next();

        while (peopleIterator.hasNext()) {
            final Person nextPerson = peopleIterator.next();
            System.out.print("Person:{ n: ");
            System.out.print(nextPerson.name);
            System.out.print("; t: ");
            System.out.print(nextPerson.type);
            System.out.print("}");
            System.out.println();
        }

    }
}

