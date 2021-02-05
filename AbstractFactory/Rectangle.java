package AbstractFactory;

import javax.swing.*;
import java.awt.*;

abstract class Rectangle extends JFrame implements Shape{
}

class RedRectangle extends Rectangle{
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
        g.drawRect(120,60,100,30);
    }
}
class BlueRectangle extends Rectangle{
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
        g.drawRect(120,60,100,30);
    }
}
class GreenRectangle extends Rectangle{
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
        g.drawRect(120,60,100,30);

    }
}


