package AbstractFactory;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class User extends JFrame {
    JComboBox comboBox;
    JComboBox comboBox1;
    JButton button;
    JPanel panel;
    JLabel label;
    AbstractFactory abFactory;
    public void init(){

        label = new JLabel("画图形");
        label.setLocation(200,200);
        panel = new JPanel();
        comboBox = new JComboBox();
        comboBox1 = new JComboBox();
        button = new JButton("确定");
        comboBox.addItem("长方形");
        comboBox.addItem("正方形");
        comboBox.addItem("圆形");
        comboBox1.addItem("红色");
        comboBox1.addItem("蓝色");
        comboBox1.addItem("绿色");

        panel.add(comboBox);
        panel.add(comboBox1);
        panel.add(button);
        this.add(label);
        this.add(panel);
        this.setLayout(new GridLayout(2,1));
        this.setTitle("画简单图形");
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
                    int index1 = comboBox1.getSelectedIndex();
                    switch (index1) {
                        case 0: {
                            abFactory = new RedFactory();
                            if(index == 0) {
                                abFactory.createRectangle().draw();
                            }else if (index == 1){
                                abFactory.createSquare().draw();
                            }else if(index ==2){
                                abFactory.createCircle().draw();
                            }else{
                                JOptionPane.showConfirmDialog(null, "请选择相应图形", "错误", JOptionPane.ERROR_MESSAGE);
                            }
                            break;
                        }
                        case 1: {
                            abFactory = new BlueFactory();
                            if(index == 0) {
                                abFactory.createRectangle().draw();
                            }else if (index == 1){
                                abFactory.createSquare().draw();
                            }else if(index ==2){
                                abFactory.createCircle().draw();
                            }else{
                                JOptionPane.showConfirmDialog(null, "请选择相应图形", "错误", JOptionPane.ERROR_MESSAGE);
                            }
                            break;
                        }
                        case 2: {
                            abFactory = new GreenFactory();
                            if(index == 0) {
                                abFactory.createRectangle().draw();
                            }else if (index == 1){
                                abFactory.createSquare().draw();
                            }else if(index ==2){
                                abFactory.createCircle().draw();
                            }else{
                                JOptionPane.showConfirmDialog(null, "请选择相应图形", "错误", JOptionPane.ERROR_MESSAGE);
                            }
                            break;
                        }
                        default: {
                            JOptionPane.showConfirmDialog(null, "请选择相应颜色", "错误", JOptionPane.ERROR_MESSAGE);
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
