package ru.stga.pft.sandbox;

public class MyFirstProgram {

    public static void main(String[] arg) {

        hello("user");
        hello("world");
        hello("Alex");

        Square s = new Square(5);

        System.out.println("Площадь квадрата со стороной " + s.l + " = " + s.area()) ;

        Rectangle r = new Rectangle(5, 6);

        System.out.println("Площадь прямоугольника со сторонами " + r.a +  " и " + r.b + " = " + r.area()) ;

    }

    public static void hello(String somebody) {

        System.out.println("Hello, " + somebody + "!");
    }

}