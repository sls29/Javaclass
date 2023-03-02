package main.java.februarie.feb27;

import java.util.Objects;

public class Person
{

    public String cnp;
    public String name;
    public String type;


    public Person(String name, String type)
    {
        this(name, type, "missing_cnp");
    }

    public Person(String name2, String type2, String cnp)
    {
        this.name = name2;
        this.type = type2;
        this.cnp = cnp;
    }

    public String getNameAndType()
    {
        return this.name + this.type;
    }

    @Override
    public String toString()
    {
        return "Person{" +
               "cnp='" + cnp + '\'' +
               ", name='" + name + '\'' +
               ", type='" + type + '\'' +
               '}';
    }

    @Override
    public boolean equals(Object o)
    {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }

        final Person person = (Person) o;

        if (!Objects.equals(name, person.name)) {
            return false;
        }
        return Objects.equals(type, person.type);
    }

    @Override
    public int hashCode()
    {
        int result = name != null ? name.hashCode() : 0;
        result = 31 * result + (type != null ? type.hashCode() : 0);
        return result;
    }
}