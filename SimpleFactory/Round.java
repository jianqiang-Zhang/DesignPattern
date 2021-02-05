package SimpleFactory;

import javax.swing.*;
import java.awt.*;

public class Round extends JFrame implements Shape {
    @Override
    public void draw() {
        this.pack();
        this.setTitle("Round");
        this.setSize(300,200);
        this.setResizable(false);
        this.setVisible(true);
        //this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    @Override
    public void paint(Graphics g) {
        g.drawOval(150,100,30,30);
    }
}
