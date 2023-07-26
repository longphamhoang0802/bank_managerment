package bank.management.system;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.EventListener;

public class Login extends JFrame implements EventListener {
    JLabel label1, label2, label3;
    JTextField textField2,textField3;
    //JPasswordField passwordField3;
    JButton button1, button2;
    Login(){
        super("Bank Management System");

        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icon\\bank.png"));
        Image i2 = i1.getImage().getScaledInstance(100,100,Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel image = new JLabel(i3);
        image.setBounds(350,10,100,100);
        add(image);

        ImageIcon ii1 = new ImageIcon(ClassLoader.getSystemResource("icon\\card.png"));
        Image ii2 = ii1.getImage().getScaledInstance(100,100,Image.SCALE_DEFAULT);
        ImageIcon ii3 = new ImageIcon(ii2);
        JLabel iimage = new JLabel(ii3);
        iimage.setBounds(700,310,100,100);
        add(iimage);

        label1 = new JLabel("WELCOME");
        label1.setFont(new Font("AvantGarde", Font.BOLD, 30));
        label1.setForeground(Color.WHITE);
        label1.setBounds(325,130,450,40);
        add(label1);

        label2 = new JLabel("UserName");
        label2.setFont(new Font("AvantGarde", Font.BOLD, 20));
        label2.setForeground(Color.WHITE);
        label2.setBounds(100,200,150,30);
        add(label2);

        textField2 = new JTextField(15);
        textField2.setBounds(250,200,400,30);
        textField2.setFont(new Font("Arial", Font.BOLD,20));
        add(textField2);

        label3 = new JLabel("Password");
        label3.setFont(new Font("AvantGarde", Font.BOLD, 20));
        label3.setForeground(Color.WHITE);
        label3.setBounds(100,250,200,30);
        add(label3);

        textField3 = new JPasswordField(15);
        textField3.setFont(new Font("Arial", Font.BOLD,20));
        textField3.setBounds(250,250,400,30);
        add(textField3);

        button1 = new JButton("LOG IN");
        button1.setBounds(250,300,150,30);
        button1.addActionListener(this::Login);
        add(button1);

        button2 = new JButton("SIGN UP");
        button2.setBounds(500,300,150,30);
        button2.addActionListener(this::SignUp);
        add(button2);

        ImageIcon iii1 = new ImageIcon(ClassLoader.getSystemResource("icon\\backbg.png"));
        Image iii2 = iii1.getImage().getScaledInstance(850,480,Image.SCALE_DEFAULT);
        ImageIcon iii3 = new ImageIcon(iii2);
        JLabel iiimage = new JLabel(iii3);
        iiimage.setBounds(0,0,850,480);
        add(iiimage);

        setLayout(null);
        setSize(850,480);
        setLocation(280,100);
        setVisible(true);
    }
    public void Login(ActionEvent e) {
        try{
            String username = textField2.getText();
            String password = textField3.getText();
            Connect connect = new Connect();

            String q = "SELECT * FROM signup";
            PreparedStatement preparedStatement = connect.connection.prepareStatement(q);
            ResultSet resultSet = preparedStatement.executeQuery();

            System.out.println("username: " + username);
            System.out.println("password: " + password);
            if(resultSet.next()) {
                if (username.equals(resultSet.getString("username")) && password.equals(resultSet.getString("password"))) {
                    System.out.println("======> đã đăng nhập");
                } else {
                    System.out.println("======> không tô tại tài khoản này");
                }
            }else {
                System.out.println("======> chưa có tài khoản");
            }
        }catch (Exception E){
            E.printStackTrace();
        }
    }

    public void SignUp(ActionEvent e){
        new SignUp();
    }

    public static void main(String[] args) {
        new Login();
    }
}
