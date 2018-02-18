package pl.codeleak.patterns.polymorphism;

class Circle implements Shape {

    @Override
    public void draw(Point location) {
        System.out.println("Circle.draw");
    }
}
