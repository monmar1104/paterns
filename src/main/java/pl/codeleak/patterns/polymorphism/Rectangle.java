package pl.codeleak.patterns.polymorphism;

class Rectangle implements Shape {

    @Override
    public void draw(Point location) {
        System.out.println("Rectangle.draw");
    }
}
