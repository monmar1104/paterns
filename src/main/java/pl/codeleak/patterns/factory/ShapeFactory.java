package pl.codeleak.patterns.factory;

class ShapeFactory {

    static Shape createShape(String shapeType) {
        switch (shapeType) {
            case "circle" :
                return new Circle();
            case "triangle" :
                return new Triangle();
            case "rectangle" :
                return new Rectangle();
            default :
                throw new IllegalArgumentException("unknown shape: " + shapeType);
        }
    }
}
