package learn_abstract_classes;

//'final': A keyword in Java that is used to declare variables immutable.
//The class is 'final' and hence cannot be subclassed.
public final class Rectangle extends Shape {

    public Rectangle() {

    }
    @Override
    public void draw() {
        System.out.println("Drawing a rectangle using Ruler");
    }
    @Override
    public float getArea() {
        float length = 5.6f;
        float breadth = 2.3f;
        return length * breadth;
    }

}
