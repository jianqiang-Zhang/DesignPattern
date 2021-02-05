package FacotryPattern;

import javax.swing.*;
import java.awt.*;

public class Rectangle extends JFrame implements Shape{
    public void draw() {
        this.pack();
        this.setTitle("Rectangle");
        this.setSize(300,200);
        this.setResizable(false);
        this.setVisible(true);
//        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }


    public void paint(Graphics g){
        //this.setSize(300,200);
        g.drawRect(120,60,100,30);
    }

}
