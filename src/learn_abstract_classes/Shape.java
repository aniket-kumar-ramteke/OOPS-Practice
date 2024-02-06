package learn_abstract_classes;

public abstract class Shape {
    public abstract void draw();
    public abstract float getArea();

    // Abstract classes may have concrete (Non-abstract, Implemented) methods
    //The erase() method is 'final' and hence cannot be overridden
    public final void erase() {//This is a Concrete (Non-abstract) method
        System.out.println("Erasing the shape...");
    }
    public Shape() {

    }
}
