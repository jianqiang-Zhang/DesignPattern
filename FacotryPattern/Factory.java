package FacotryPattern;

public interface Factory {
    Shape createGeometry();
}

class RectangleFactory implements Factory{
    @Override
    public Shape createGeometry() {
        return new Rectangle();
    }
}

class SquareFactory implements Factory{
    @Override
    public Shape createGeometry() {
        return new Square();
    }
}

class RoundFactory implements Factory{
    @Override
    public Shape createGeometry() {
        return new Round();
    }
}