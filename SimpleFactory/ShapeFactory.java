package SimpleFactory;

public class ShapeFactory {
    public Shape getShape(Type shapeType) {
        switch (shapeType) {
            case Round ->{
                return new Round();
            }
            case Rectangle ->{
                return new Rectangle();
            }
            case Square -> {
                return new Square();
            }
            default -> {
                return null;
            }

        }
    }
}
