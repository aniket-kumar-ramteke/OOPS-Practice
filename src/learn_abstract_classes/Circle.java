package learn_abstract_classes;

public final class Circle extends Shape {

    public Circle() {

    }

    @Override
    public void draw() {
        System.out.println("Drawing a circle using compass");

    }

    @Override
    public float getArea() {
        float radius = 4.5f;
        float area = (float)Math.PI * radius * radius;
        return area;
    }

}