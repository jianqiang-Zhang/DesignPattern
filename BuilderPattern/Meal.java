package BuilderPattern;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.List;

public class Meal extends JFrame {
    JFrame jFrame1;
    JLabel label1;
    JTextArea textArea;
    JButton button;
    GridBagLayout bagLayout;

    Meal(){
       jFrame1 = new JFrame();
    }

    private List<Items> items = new ArrayList<>();
    public void addItem(Items item){
        items.add(item);
    }
    public double getTotalPrice(){
        double totalPrice=0.0;
        for (Items item : items){
            totalPrice+=item.setPrice();
        }
        return totalPrice;
    }
    public void viewList(){
        bagLayout = new GridBagLayout();
        jFrame1.setLayout(bagLayout);
        String food = "";
        String drink = "";
        for (Items item : items) {
            if(item instanceof Burger){
                food = food+item.setName()+"  包装为:"+item.setPack().pack()+"  价格："+item.setPrice()+"\n";
            }
            else{
                drink = drink+item.setName()+"  包装为:"+item.setPack().pack()+"  价格："+item.setPrice()+"\n";
            }
        }
        textArea = new JTextArea("食物：\n"+food+"\n饮料：\n"+drink+"\n总价："+getTotalPrice());


        label1 = new JLabel("点餐确认\n",JLabel.CENTER);
        Font fnt = new Font("Serief",Font.ITALIC+Font.BOLD,30);
        label1.setFont(fnt);
        button = new JButton("确定");
        button.setSize(50,30);
        jFrame1.add(label1);
        jFrame1.add(textArea);
        jFrame1.add(button);
        //jFrame1.setLayout(new GridLayout(7,1).);
        jFrame1.setVisible(true);
        jFrame1.setSize(500,300);
        jFrame1.setLocation(100,100);

        GridBagConstraints gridBagConstraints = new GridBagConstraints();
        gridBagConstraints.fill = GridBagConstraints.BOTH;
        gridBagConstraints.gridwidth = 0;
        gridBagConstraints.gridy=2;
        gridBagConstraints.weightx = 1;
        gridBagConstraints.weighty = 0;
        bagLayout.setConstraints(label1,gridBagConstraints);
        gridBagConstraints.gridwidth = 0;
        gridBagConstraints.gridy=5;
        gridBagConstraints.weightx = 1;
        gridBagConstraints.weighty = 0;
        bagLayout.setConstraints(textArea,gridBagConstraints);
        gridBagConstraints.gridwidth = 0;
        gridBagConstraints.gridy=7;
        gridBagConstraints.weightx = 1;
        gridBagConstraints.weighty = 0;
        bagLayout.setConstraints(button,gridBagConstraints);

        button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                jFrame1.setVisible(false);
            }
        });


    }
}
