package bank.management.system;

import javax.swing.*;
import java.awt.*;

public class SignUp2 extends JFrame {
    SignUp2(){
        super("Sign-up");
        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icon\\bank.png"));
        Image i2 = i1.getImage().getScaledInstance(100,100,Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel image = new JLabel(i3);
        image.setBounds(250,10,100,100);
        add(image);

        ImageIcon iii1 = new ImageIcon(ClassLoader.getSystemResource("icon\\backbg.png"));
        Image iii2 = iii1.getImage().getScaledInstance(600,700,Image.SCALE_DEFAULT);
        ImageIcon iii3 = new ImageIcon(iii2);
        JLabel iiimage = new JLabel(iii3);
        iiimage.setBounds(0,0,600,700);
        add(iiimage);

        setLayout(null);
        setSize(600,700);
        setLocation(400,40);
        setVisible(true);
    }
}
