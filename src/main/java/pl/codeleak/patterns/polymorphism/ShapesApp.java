package pl.codeleak.patterns.polymorphism;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

class ShapesApp {

    public static void main(String[] args) {

        Shape s1 = new Rectangle();
        Shape s2 = new Triangle();
        Shape s3 = new Circle();

        List<Shape> shapes = Stream.of(s1, s2, s3)
                                   .collect(Collectors.toList());

        shapes.forEach(s -> s.draw(new Point(10, 10)));
    }

}
