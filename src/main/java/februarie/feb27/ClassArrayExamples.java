package februarie.feb27;

public class ClassArrayExamples
{

    public static void main(String[] args)
    {
        simpleExample();
        moreComplicatedExample();


    }

    private static void moreComplicatedExample()
    {
        System.out.println("moreComplicatedExample");
        Animal[] myAnimals = new Animal[6];

        for (int x = 0; x < myAnimals.length; x++) {
            if (x % 2 == 0) {
                myAnimals[x] = new Dog();
            } else {
                myAnimals[x] = new Cat();
            }
        }

        printAnimalsArray(myAnimals);

        for (int i = 0; i < myAnimals.length; i++) {
            if (i % 2 == 1) {
                myAnimals[i].name += " impar";
            }
        }

        printAnimalsArray(myAnimals);
    }

    private static void simpleExample()
    {
        System.out.println("simpleExample");

        Animal[] animals = new Animal[3];
        animals[0] = new Cat();
        animals[1] = new Dog();
        animals[2] = new Animal();

        printAnimalsArray(animals);
    }

    private static void printAnimalsArray(Animal[] animals)
    {
        for (Animal animal : animals) {
            System.out.println(animal.name);
        }
    }
}

class Animal
{
    public String name = "Animal";
}

class Cat extends Animal
{
    public Cat()
    {
        name = "Cat";
    }
}

class Dog extends Animal
{
    public Dog()
    {
        name = "Dog";
    }
}