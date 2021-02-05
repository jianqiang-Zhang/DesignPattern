package AbstractFactory;

public interface AbstractFactory {
    public Rectangle createRectangle();
    public Square createSquare();
    public Circle createCircle();
}

class RedFactory implements AbstractFactory{
    @Override
    public Circle createCircle() {
        return new RedCircle();
    }

    @Override
    public Rectangle createRectangle() {
        return new RedRectangle();
    }

    @Override
    public Square createSquare() {
        return new RedSquare();
    }
}

class BlueFactory implements AbstractFactory{
    @Override
    public Circle createCircle() {
        return new BlueCircle();
    }

    @Override
    public Rectangle createRectangle() {
        return new BlueRectangle();
    }

    @Override
    public Square createSquare() {
        return new BlueSquare();
    }
}

class GreenFactory implements AbstractFactory{
    @Override
    public Circle createCircle() {
        return new GreenCircle();
    }

    @Override
    public Rectangle createRectangle() {
        return new GreenRectangle();
    }

    @Override
    public Square createSquare() {
        return new GreenSquare();
    }
}

