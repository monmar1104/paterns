package pl.codeleak.patterns.factory;

import java.util.List;
import java.util.Random;
import java.util.stream.Collectors;
import java.util.stream.Stream;

class ShapeFactoryApp {

    public static void main(String[] args) {
        // TODO Create specific shapes depending on the given shape types.
        // TODO Print each shape at random location.
        // TODO (Optional) Track count of instances created for each shape type
        String[] shapesTypes = new String[]{"circle", "triangle", "triangle", "rectangle", "rectangle", "rectangle"};

        List<Shape> shapes = createShapes(shapesTypes);

        shapes.forEach(ShapeFactoryApp::drawAtRandomLocation);
    }

    private static void drawAtRandomLocation(Shape shape) {
        Random random = new Random();
        shape.draw(new Point(random.nextInt(1920), random.nextInt(1080)));
    }

    private static List<Shape> createShapes(String[] shapesTypes) {
        return Stream.of(shapesTypes)
                .map(ShapeFactory::createShape)
                .collect(Collectors.toList());
    }
}
