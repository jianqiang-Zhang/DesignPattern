package AbstractFactory;

import javax.swing.*;
import java.awt.*;

abstract class Circle extends JFrame implements Shape{
}

class RedCircle extends Circle{
    @Override
    public void draw() {
        this.pack();
        this.setTitle("AbstractFactory.Rectangle");
        this.setSize(300,200);
        this.setResizable(false);
        this.setVisible(true);

    }
    public void paint(Graphics g){
        g.setColor(Color.red);
        g.drawOval(120,60,50,50);
    }
}
class BlueCircle extends Circle{
    @Override
    public void draw() {
        this.pack();
        this.setTitle("AbstractFactory.Rectangle");
        this.setSize(300,200);
        this.setResizable(false);
        this.setVisible(true);

    }
    public void paint(Graphics g){
        g.setColor(Color.blue);
        g.drawOval(120,60,50,50);
    }
}
class GreenCircle extends Circle{
    @Override
    public void draw() {
        this.pack();
        this.setTitle("AbstractFactory.Rectangle");
        this.setSize(300,200);
        this.setResizable(false);
        this.setVisible(true);
    }
    public void paint(Graphics g){
        g.setColor(Color.green);
        g.drawOval(120,60,50,50);

    }
}