package AbstractFactory;

import javax.swing.*;
import java.awt.*;

abstract class Square extends JFrame implements Shape{
}

class RedSquare extends Square{
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
        g.drawRect(120,60,50,50);
    }
}
class BlueSquare extends Square{
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
        g.drawRect(120,60,50,50);
    }
}
class GreenSquare extends Square{
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
        g.drawRect(120,60,50,50);

    }
}