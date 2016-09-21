package simplegui2;

import javax.swing.*;
import java.awt.event.*;
//import simplegui1.simplegui2;

public class simplegui2 implements ActionListener  {
    JButton button = null;
    private int numClick = 0;


    public static void main(String[] args) {
        simplegui2 gui = new simplegui2();
        gui.go();

    }

    public void go() {
        JFrame frame = new JFrame();
        button = new JButton("Нажми меня.");
        
        button.addActionListener(this);
        
        frame.getContentPane().add(button);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(300, 300);
        frame.setVisible(true);
        
    }

//По нажатию на кнопку меняется текст и показывается количество "кликов".
    @Override
    public void actionPerformed(ActionEvent e) {
         numClick++;
         button.setText("Количество нажатий: " + numClick);
    }
}


