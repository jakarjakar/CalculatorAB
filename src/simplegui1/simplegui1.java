import javax.swing.*;
import java.awt.event.*;

public class simplegui1 implements ActionListener  {
    JButton button = null;
    
    public static void main(String[] args) {
        simplegui1 gui = new simplegui1();
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

//По нажатию на кнопку меняется текст.
    @Override
    public void actionPerformed(ActionEvent e) {
        button.setText("Текст после нажатия.");
    }
}












