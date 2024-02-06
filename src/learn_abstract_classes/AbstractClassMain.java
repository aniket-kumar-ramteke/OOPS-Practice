package learn_abstract_classes;
/*
* Abstract Classes:
* In Java sometimes a class may have a method without definition. Any method which
* is not defined but declared is referred as Abstract method.
*
* If a class contains any one method abstract, it must be declared abstract however
* it is possible declare a class as abstract without any single method abstract.
*
* The modifier 'abstract' cannot be applied for:
*       1. Constructors
*       2. Static Methods
*       3. Variables
*
*       Once a class is declared 'abstract' it cannot be instantiated.
*       It is further used by creating its subclass.
*
*       Any subclass of an abstract class must implement all the abstract methods of
*       that class otherwise must be declared 'abstract'.
* */
public class AbstractClassMain {

    public static void main(String[] args) {

        //Even though an abstract class cannot be instantiated, it is possible to declare
        //a reference of that type.
        Shape shape;
        shape = new Rectangle();
        shape.draw();
        System.out.println("Area of rectangle : " + shape.getArea());
        shape.erase();

        shape = new Circle();
        shape.draw();
        System.out.println("Area of circle: " + shape.getArea());
        shape.erase();

    }

}