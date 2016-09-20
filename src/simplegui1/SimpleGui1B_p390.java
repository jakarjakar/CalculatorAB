import javax.swing.*;
import java.awt.event.*;

public class SimpleGui1B_p390 implements ActionListener  {
    JButton button = null;


    public static void main(String[] args) {
        SimpleGui1B_p390 gui = new SimpleGui1B_p390();
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

    @Override
    public void actionPerformed(ActionEvent e) {
        button.setLocation(100, 100);
        button.setText("Нажал и отпустил, спасибо.");

    }
}
