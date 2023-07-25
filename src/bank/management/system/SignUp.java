package bank.management.system;

//import com.toedter.calendar.JDateChooser;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.util.EventListener;

public class SignUp extends JFrame implements EventListener {
    JRadioButton r1,r2,m1,m2,m3;
    JButton next;

    JTextField textName ,textFname, textEmail,textAdd,textcity,textPhoneNumber;
    //JDateChooser dateChooser;
    SignUp(){
        super("Sign-up");

        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icon\\bank.png"));
        Image i2 = i1.getImage().getScaledInstance(100,100,Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel image = new JLabel(i3);
        image.setBounds(250,10,100,100);
        add(image);

        JLabel label3 = new JLabel("Personal Details");
        label3.setFont(new Font("Raleway", Font.BOLD,22));
        label3.setBounds(220,120,600,30);
        add(label3);

        JLabel labelName = new JLabel("Name :");
        labelName.setFont(new Font("Raleway", Font.BOLD, 16));
        labelName.setBounds(30,180,100,20);
        add(labelName);

        textName = new JTextField();
        textName.setFont(new Font("Raleway",Font.BOLD, 14));
        textName.setBounds(200,180,350,25);
        add(textName);

        JLabel labelfName = new JLabel("Father's Name :");
        labelfName.setFont(new Font("Raleway", Font.BOLD, 16));
        labelfName.setBounds(30,220,200,30);
        add(labelfName);

        textFname = new JTextField();
        textFname.setFont(new Font("Raleway",Font.BOLD, 14));
        textFname.setBounds(200,220,350,25);
        add(textFname);

        JLabel DOB = new JLabel("Date of Birth");
        DOB.setFont(new Font("Raleway", Font.BOLD, 16));
        DOB.setBounds(30,260,200,30);
        add(DOB);

//        dateChooser = new JDateChooser();
//        dateChooser.setForeground(new Color(105,105,105));
//        dateChooser.setBounds(300,340,400,30);
//        add(dateChooser);

        JLabel labelG = new JLabel("Gender");
        labelG.setFont(new Font("Raleway", Font.BOLD, 16));
        labelG.setBounds(30,300,200,30);
        add(labelG);

        r1 = new JRadioButton("Male");
        r1.setFont(new Font("Raleway", Font.BOLD,14));
        r1.setBackground(new Color(225,200,22));
        r1.setBounds(210,300,100,30);
        add(r1);

        r2 = new JRadioButton("Female");
        r2.setBackground(new Color(225,200,22));
        r2.setFont(new Font("Raleway", Font.BOLD,14));
        r2.setBounds(400,300,100,30);
        add(r2);

        ButtonGroup buttonGroup = new ButtonGroup();
        buttonGroup.add(r1);
        buttonGroup.add(r2);

        JLabel labelEmail = new JLabel("Email address :");
        labelEmail.setFont(new Font("Raleway", Font.BOLD, 16));
        labelEmail.setBounds(30,340,200,30);
        add(labelEmail);

        textEmail = new JTextField();
        textEmail.setFont(new Font("Raleway",Font.BOLD, 14));
        textEmail.setBounds(200,340,350,25);
        add(textEmail);


        JLabel labelMs = new JLabel("Marital Status :");
        labelMs.setFont(new Font("Raleway", Font.BOLD, 16));
        labelMs.setBounds(30,380,200,30);
        add(labelMs);

        m1 = new JRadioButton("Married");
        m1.setBounds(210,380,100,30);
        m1.setBackground(new Color(225,200,22));
        m1.setFont(new Font("Raleway", Font.BOLD,14));
        add(m1);

        m2 = new JRadioButton("Unmarried");
        m2.setBackground(new Color(225,200,22));
        m2.setBounds(330,380,100,30);
        m2.setFont(new Font("Raleway", Font.BOLD,14));
        add(m2);

        m3 = new JRadioButton("Other");
        m3.setBackground(new Color(225,200,22));
        m3.setBounds(450,380,100,30);
        m3.setFont(new Font("Raleway", Font.BOLD,14));
        add(m3);

        ButtonGroup buttonGroup1 = new ButtonGroup();
        buttonGroup1.add(m1);
        buttonGroup1.add(m2);
        buttonGroup1.add(m3);

        JLabel labelAdd = new JLabel("Address :");
        labelAdd.setFont(new Font("Raleway", Font.BOLD, 16));
        labelAdd.setBounds(30,420,200,30);
        add(labelAdd);

        textAdd = new JTextField();
        textAdd.setFont(new Font("Raleway",Font.BOLD, 14));
        textAdd.setBounds(200,420,350,25);
        add(textAdd);

        JLabel labelCity = new JLabel("City :");
        labelCity.setFont(new Font("Raleway", Font.BOLD, 16));
        labelCity.setBounds(30,460,200,30);
        add(labelCity);

        textcity = new JTextField();
        textcity.setFont(new Font("Raleway",Font.BOLD, 14));
        textcity.setBounds(200,460,350,25);
        add(textcity);

        JLabel labelphonenumber = new JLabel("Phone Number :");
        labelphonenumber.setFont(new Font("Raleway", Font.BOLD, 16));
        labelphonenumber.setBounds(30,500,200,30);
        add( labelphonenumber);

        textPhoneNumber = new JTextField();
        textPhoneNumber.setFont(new Font("Raleway",Font.BOLD, 14));
        textPhoneNumber.setBounds(200,500,350,25);
        add(textPhoneNumber);

        next = new JButton("Next");
        next.setFont(new Font("Raleway",Font.BOLD, 14));
        next.setBackground(Color.BLACK);
        next.setForeground(Color.WHITE);
        next.setBounds(450,600,80,30);
        next.addActionListener(this::setNext);
        add(next);

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
    public  void setNext(ActionEvent e){
        String name = textName.getText();
        String fname = textFname.getText();
        String email = textEmail.getText();
        String address = textAdd.getText();
        String phone = textPhoneNumber.getText();
        String city = textcity.getText();
        new SignUp2();
    }
}
