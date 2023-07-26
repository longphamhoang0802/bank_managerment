package bank.management.system;

import com.toedter.calendar.JDateChooser;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.sql.PreparedStatement;
import java.util.EventListener;

public class SignUp extends JFrame implements EventListener {
    JRadioButton r1,r2,m1,m2,m3;
    JButton next;

    JTextField textName ,textFname, textEmail,textUsername,textPassword,textPhoneNumber;
    JDateChooser dateChooser;
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

        dateChooser = new JDateChooser();
        dateChooser.setForeground(new Color(105,105,105));
        dateChooser.setBounds(200,260,350,25);
        add(dateChooser);

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

        JLabel labelAdd = new JLabel("UserName :");
        labelAdd.setFont(new Font("Raleway", Font.BOLD, 16));
        labelAdd.setBounds(30,420,200,30);
        add(labelAdd);

        textUsername = new JTextField();
        textUsername.setFont(new Font("Raleway",Font.BOLD, 14));
        textUsername.setBounds(200,420,350,25);
        add(textUsername);

        JLabel labelCity = new JLabel("Password :");
        labelCity.setFont(new Font("Raleway", Font.BOLD, 16));
        labelCity.setBounds(30,460,200,30);
        add(labelCity);

        textPassword = new JTextField();
        textPassword.setFont(new Font("Raleway",Font.BOLD, 14));
        textPassword.setBounds(200,460,350,25);
        add(textPassword);

        JLabel labelphonenumber = new JLabel("Phone Number :");
        labelphonenumber.setFont(new Font("Raleway", Font.BOLD, 16));
        labelphonenumber.setBounds(30,500,200,30);
        add( labelphonenumber);

        textPhoneNumber = new JTextField();
        textPhoneNumber.setFont(new Font("Raleway",Font.BOLD, 14));
        textPhoneNumber.setBounds(200,500,350,25);
        add(textPhoneNumber);

        next = new JButton("Create");
        next.setFont(new Font("Raleway",Font.BOLD, 14));
        next.setBackground(Color.BLACK);
        next.setForeground(Color.WHITE);
        next.setBounds(400,600,150,30);
        next.addActionListener(this::createUser);
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
    public  void createUser(ActionEvent e){
        String username = textUsername.getText();
        String password = textPassword.getText();
        String name = textName.getText();
        String fname = textFname.getText();
        String dob = ((JTextField) dateChooser.getDateEditor().getUiComponent()).getText();
        String gener = null;
        if(r1.isSelected()){
            gener = "male";
        } else if (r2.isSelected()) {
            gener = "female";
        }
        String email = textEmail.getText();
        String married_stt = null;
        if(m1.isSelected()){
            married_stt = "married";
        } else if (m2.isSelected()) {
            married_stt = "unmarried";
        } else if (m3.isSelected()) {
            married_stt = "other";
        }
        String phone = textPhoneNumber.getText();

        try {
            Connect connect1 = new Connect();
            String q = "INSERT INTO signup (username, password, name, fname, dob, gener, email, married_stt, phone) VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?)";
            PreparedStatement preparedStatement = connect1.connection.prepareStatement(q);

            preparedStatement.setString(1, username);
            preparedStatement.setString(2, password);
            preparedStatement.setString(3, name);
            preparedStatement.setString(4, fname);
            preparedStatement.setString(5, dob);
            preparedStatement.setString(6, gener);
            preparedStatement.setString(7, email);
            preparedStatement.setString(8, married_stt);
            preparedStatement.setString(9, phone);

            int rowsInserted = preparedStatement.executeUpdate();
            if (rowsInserted > 0) {
                System.out.println("Thêm dữ liệu thành công.");
            }
            preparedStatement.close();
            connect1.connection.close();
            new SignUp2();
        }catch (Exception E){
            E.printStackTrace();
        }
    }
}
