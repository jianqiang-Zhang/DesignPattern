package BuilderPattern;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class User extends JFrame {
    MealBuilder mealBuilder = new MealBuilder();
    JLabel label = new JLabel("点餐咯",JLabel.CENTER);
    JComboBox comboBox;
    JButton button;
    JPanel panel;
    Meal meal;
    public void init(){
        comboBox = new JComboBox();
        panel = new JPanel();

        comboBox.addItem("套餐1");
        comboBox.addItem("套餐2");
        comboBox.addItem("套餐3");
        comboBox.addItem("套餐4");

        button = new JButton("确定");

        panel.add(comboBox);
        panel.add(button);
        this.add(label);
        this.add(panel);
        this.setLayout(new GridLayout(2,1));
        this.setVisible(true);
        this.setSize(500,300);
        this.setLocation(100,100);
        this.repaint();
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        try{
            button.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    int index = comboBox.getSelectedIndex();
                    switch (index){
                        case 0:{
                            meal = mealBuilder.combo1();
                            meal.viewList();
                            break;
                        }
                        case 1:{
                            meal = mealBuilder.combo2();
                            meal.viewList();
                            break;
                        }
                        case 2:{
                            meal = mealBuilder.combo3();
                            meal.viewList();
                            break;
                        }
                        case 3:{
                            meal = mealBuilder.combo4();
                            meal.viewList();
                            break;
                        }
                        default:{
                            JOptionPane.showConfirmDialog(null,"请选择套餐","warning",JOptionPane.ERROR_MESSAGE);
                            break;
                        }
                    }
                }
            });
        }catch (Exception e){
            e.getMessage();
        }
    }

    public static void main(String[] args) {
        User user1 = new User();
        user1.init();
    }

}
