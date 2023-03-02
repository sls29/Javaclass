package februarie.feb15;

public class Person {

    String name;
    int age;

    public Person(String name, int age) {
        if(age < 18){
            System.out.println("Value for age not allowed");
        }
        this.name = name;
        this.age = age;
    }
    public Person(String name) {
        this.name = name;
    }
    public Person () {

        this("no name");
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    //    public void setName(String name){
//        this.name = name;
//    }

    public String getName(){
        return this.name;
    }

}
