package FacotryPattern;

import javax.swing.*;
import java.awt.*;

public class Square extends JFrame implements Shape {
    @Override
    public void draw() {
        this.pack();
        this.setTitle("Square");
        this.setSize(300,200);
        this.setResizable(false);
        this.setVisible(true);
        //this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    }

    @Override
    public void paint(Graphics g) {
        g.drawRect(150,100,50,50);
    }
}
