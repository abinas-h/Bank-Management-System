package bank.management.system;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Login extends JFrame implements ActionListener {

    JButton loginButton, signupButton, clearButton;

    JTextField cardTextField;
    JPasswordField pinTextField;

    Login(){
        setTitle("AUTOMATED TELLER MACHINE");
        setLayout(null);


        //PLACING ICON image
        ImageIcon loginIcon =  new ImageIcon(ClassLoader.getSystemResource("icons/logo.jpg"));
        Image loginIcon2 = loginIcon.getImage().getScaledInstance(100,100, Image.SCALE_DEFAULT);
        ImageIcon loginIcon3 = new ImageIcon(loginIcon2);
        JLabel label = new JLabel(loginIcon3);
        label.setBounds(70,10,100,100);
        add(label);
        getContentPane().setBackground(Color.WHITE);

//        Adding welcome text in login panel
        JLabel welcomeText = new JLabel("Welcome to the ATM");
        welcomeText.setFont(new Font("osward", Font.BOLD,38));
        welcomeText.setBounds(200,40,400,40);
        add(welcomeText);

//        Adding card No text in login panel
        JLabel cardNo = new JLabel("Card No:");
        cardNo.setFont(new Font("Railway", Font.BOLD,28));
        cardNo.setBounds(120,150,150,30);
        add(cardNo);

//        adding text field for card number
        cardTextField = new JTextField();
        cardTextField.setBounds(300,150,230,30);
        cardTextField.setFont(new Font("Arial",Font.BOLD, 14));
        add(cardTextField);



//        Adding pinNo text in login panel
        JLabel pinNo = new JLabel("Pin:");
        pinNo.setFont(new Font("Railway", Font.BOLD,28));
        pinNo.setBounds(120,220,250,30);
        add(pinNo);



//        adding pinNO textField in loginPanel
        pinTextField = new JPasswordField();
        pinTextField.setBounds(300,220,230,30);
        pinTextField.setFont(new Font("Arial",Font.BOLD, 14));
        add(pinTextField);

//        Login button
        loginButton = new JButton("SIGN IN");
        loginButton.setBounds(300,300,100,30);
        loginButton.setBackground(Color.BLACK);
        loginButton.setForeground(Color.WHITE);
        loginButton.addActionListener(this);
        add(loginButton);

//       Clear button
        clearButton = new JButton("CLEAR");
        clearButton.setBounds(430,300,100,30);
        clearButton.setBackground(Color.BLACK);
        clearButton.setForeground(Color.WHITE);
        clearButton.addActionListener(this);
        add(clearButton);

//       signup button
        signupButton = new JButton("SIGN UP ");
        signupButton.setBounds(300,350,230,30);
        signupButton.setBackground(Color.BLACK);
        signupButton.setForeground(Color.WHITE);
        signupButton.addActionListener(this);
        add(signupButton);



        setSize(800,480);
        setVisible(true);
        setLocation(350,200);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
    }

    public static void main(String[] args) {
        new Login();
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == clearButton){
            cardTextField.setText("");
            pinTextField.setText("");
            
        }else if (e.getSource() == signupButton){
            setVisible(false);
            new SignupOne().setVisible(true);
        } else if (e.getSource() == loginButton ) {
            
        }

    }


//    abha textfield ko bari haii
//24 min video https://youtu.be/vClv4Q2hSgo
}
