package pl.codeleak.patterns.polymorphism;

class Triangle implements Shape {

    @Override
    public void draw(Point location) {
        System.out.println("Triangle.draw");
    }
}
