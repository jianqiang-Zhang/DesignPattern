package FacotryPattern;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class User extends JFrame {
    JComboBox comboBox;
    JButton button;
    Factory factory;
    JPanel panel;
    JLabel label;
    Shape shape;
    public void init(){

        label = new JLabel("��ͼ��");
        label.setLocation(200,200);
        panel = new JPanel();
        comboBox = new JComboBox();
        button = new JButton("ȷ��");
        comboBox.addItem("������");
        comboBox.addItem("������");
        comboBox.addItem("Բ��");

        panel.add(comboBox);
        panel.add(button);
        this.add(label);
        this.add(panel);
        this.setLayout(new GridLayout(2,1));
        this.setTitle("����ͼ��");
        this.setSize(500,300);
        this.setLocation(100,100);
        this.setResizable(false);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setVisible(true);
        this.repaint();

        try {
            button.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    int index = comboBox.getSelectedIndex();
                    switch (index) {
                        case 0: {
                            factory = new RectangleFactory();
                            shape = factory.createGeometry();
                            shape.draw();
                            break;
                        }
                        case 1: {
                            factory = new SquareFactory();
                            shape = factory.createGeometry();
                            shape.draw();
                            break;
                        }
                        case 2: {
                            factory = new RoundFactory();
                            shape = factory.createGeometry();
                            shape.draw();
                            break;
                        }
                        default: {
                            JOptionPane.showConfirmDialog(null, "��ѡ����Ӧͼ��", "����", JOptionPane.ERROR_MESSAGE);
                            break;
                        }

                    }

                }
            });
        }catch (NullPointerException e){
            e.getMessage();
        }
    }

    public static void main(String[] args) {
        User user1 = new User();
        user1.init();
    }
}
