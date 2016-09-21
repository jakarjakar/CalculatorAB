import javax.swing.*;
import java.awt.event.*;

public class simplegui3 implements ActionListener  {
    JButton button = null;
    private int numClick = 0;
    
    public static void main(String[] args) {
        simplegui3 gui = new simplegui3();
        gui.go();

    }

    public void go() {
        JFrame frame = new JFrame();
        button = new JButton("Click me.");
        
        button.addActionListener(this);
        
        frame.getContentPane().add(button);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(300, 300);
        frame.setVisible(true);
        
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        button.setLocation(100, 100); //This code do not change the button location if numClick++ (next row) used. 
                                      //If comment numClick++ the button changes location on click. Why?
        numClick++;
        button.setText("Has been clicked " + numClick + " times.");
        
    }
}