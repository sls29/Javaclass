package februarie.feb15;

import java.util.Scanner;

public class PolymophismExample {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Shape shape;
        while (true) {
            System.out.println("Enter a shape (c for circle, t for triangle, x to exit):");
            String input = scanner.nextLine();
            switch (input) {
                case "c" -> shape = new Circle();
                case "t" -> shape = new Triangle();
                case "x" -> {
                    System.out.println("Exiting program");
                    return;
                }
                default -> {
                    System.out.println("Unknown shape");
                    continue;
                }
            }
            shape.draw();
        }
    }
}

class Shape {
    public String color;
    public void draw() {
        System.out.println("Drawing a shape");
    }
}

class Circle extends Shape {
    @Override
    public void draw() {
        System.out.println("Drawing a circle");
    }

    @Override
    public String toString(){
        return "We have a circle with color" + this.color;
    }
}

class Triangle extends Shape {
    @Override
    public void draw() {
        System.out.println("Drawing a triangle");
    }
}
