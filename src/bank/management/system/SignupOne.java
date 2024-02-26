package bank.management.system;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.*;
import com.toedter.calendar.JDateChooser;

public class SignupOne extends JFrame implements ActionListener {

    long random;
    JTextField nameTextField, fnameTextField,
            emailTextField, addressTextField,
            cityTextField, stateTextField,
            pinCodeTextField;

    JButton next;

    JRadioButton male, female, other, unmarried, married;

    JDateChooser jDateChooser;



    public SignupOne(){

        setLayout(null);

        Random ran = new Random();

         random = Math.abs(ran.nextLong()%9000L)+1000L;

        getContentPane().setBackground(Color.WHITE);

        JLabel formNumber = new JLabel("APPLICATION FORM NO. "+ random);
        formNumber.setFont(new Font("Raleway",Font.BOLD,38));
        formNumber.setBounds(140,20,600,40);
        add(formNumber);



        JLabel personalNumber = new JLabel("Page 1: Personal Details");
        personalNumber.setFont(new Font("Raleway",Font.BOLD,22));
        personalNumber.setBounds(290,80,400,30);
        add(personalNumber);


        JLabel name = new JLabel("Name:");
        name.setFont(new Font("Raleway",Font.BOLD,20));
        name.setBounds(100,140,100,30);
        add(name);

        nameTextField = new JTextField();
        nameTextField.setFont(new Font("Raleway",Font.BOLD,14));
        nameTextField.setBounds(300,140,400,30);
        add(nameTextField);



        JLabel fname = new JLabel("Father's Name:");
        fname.setFont(new Font("Raleway",Font.BOLD,20));
        fname.setBounds(100,190,200,30);
        add(fname);

        fnameTextField = new JTextField();
        fnameTextField.setFont(new Font("Raleway",Font.BOLD,14));
        fnameTextField.setBounds(300,190,400,30);
        add(fnameTextField);



        JLabel dob = new JLabel("Date of Birth: ");
        dob.setFont(new Font("Raleway",Font.BOLD,20));
        dob.setBounds(100,240,400,30);
        add(dob);

        jDateChooser = new JDateChooser();
        jDateChooser.setBounds(300,240,200,30);
        add(jDateChooser);



        JLabel gender = new JLabel("Gender: ");
        gender.setFont(new Font("Raleway",Font.BOLD,20));
        gender.setBounds(100,290,200,30);
        add(gender);


        male = new JRadioButton("Male");
        male.setBounds(300,290,60,30);
        male.setBackground(Color.WHITE);
        add(male);

         female = new JRadioButton("Female");
        female.setBounds(450,290,120,30);
        female.setBackground(Color.WHITE);
        add(female);

        ButtonGroup genderGroup = new ButtonGroup();
        genderGroup.add(male);
        genderGroup.add(female);


        JLabel email = new JLabel("Email Address: ");
        email.setFont(new Font("Raleway",Font.BOLD,20));
        email.setBounds(100,340,200,30);
        add(email);


        emailTextField = new JTextField();
        emailTextField.setFont(new Font("Raleway",Font.BOLD,14));
        emailTextField.setBounds(300,340,400,30);
        add(emailTextField);

        JLabel maritalStatus = new JLabel("Marital Status: ");
        maritalStatus.setFont(new Font("Raleway",Font.BOLD,20));
        maritalStatus.setBounds(100,390,200,30);
        add(maritalStatus);

        married = new JRadioButton("Married");
        married.setBounds(300,390,100,30);
        married.setBackground(Color.WHITE);
        add(married);

       unmarried = new JRadioButton("Unmarried");
        unmarried.setBounds(450,390,100,30);
        unmarried.setBackground(Color.WHITE);
        add(unmarried);

        other = new JRadioButton("Other");
        other.setBounds(630,390,100,30);
        other.setBackground(Color.WHITE);
        add(other);

        ButtonGroup maritalGroup = new ButtonGroup();
        maritalGroup.add(married);
        maritalGroup.add(unmarried);
        maritalGroup.add(other);

        JLabel address = new JLabel("Address: ");
        address.setFont(new Font("Raleway",Font.BOLD,20));
        address.setBounds(100,440,200,30);
        add(address);

        addressTextField = new JTextField();
        addressTextField.setFont(new Font("Raleway",Font.BOLD,14));
        addressTextField.setBounds(300,440,400,30);
        add(addressTextField);

        JLabel city = new JLabel("City: ");
        city.setFont(new Font("Raleway",Font.BOLD,20));
        city.setBounds(100,490,200,30);
        add(city);

        cityTextField = new JTextField();
        cityTextField.setFont(new Font("Raleway",Font.BOLD,14));
        cityTextField.setBounds(300,490,400,30);
        add(cityTextField);


        JLabel state = new JLabel("State: ");
        state.setFont(new Font("Raleway",Font.BOLD,20));
        state.setBounds(100,540,200,30);
        add(state);


        stateTextField = new JTextField();
        stateTextField.setFont(new Font("Raleway",Font.BOLD,14));
        stateTextField.setBounds(300,540,400,30);
        add(stateTextField);

        JLabel pinCode = new JLabel("Pin Code: ");
        pinCode.setFont(new Font("Raleway",Font.BOLD,20));
        pinCode.setBounds(100,590,200,30);
        add(pinCode);


        pinCodeTextField = new JTextField();
        pinCodeTextField.setFont(new Font("Raleway",Font.BOLD,14));
        pinCodeTextField.setBounds(300,590,400,30);
        add(pinCodeTextField);



        next = new JButton("Next");
        next.setBounds(620,660,80,30);
        next.setBackground(Color.BLACK);
        next.setForeground(Color.WHITE);
        next.setFont(new Font("Railway", Font.BOLD,14));
        next.addActionListener(this);
        add(next);




        setSize(850,800);
        setLocation(350,10);
        setVisible(true);
        setDefaultCloseOperation(EXIT_ON_CLOSE);



    }


    public void actionPerformed(ActionEvent ae){
        String formno = "" + random;//long
        String   name = nameTextField.getText();
        String fname = fnameTextField.getText();
        String dob   = ((JTextField) jDateChooser.getDateEditor().getUiComponent()).getText();
        String gender = null;
        if (male.isSelected()){
            gender = "Male";
        } else if (female.isSelected()) {

            gender = "Female";

        }


       String email = emailTextField.getText();
       String marital = null;

       if (married.isSelected()){
           marital = "Married";
       } else if (unmarried.isSelected()) {
           marital = "Unmarried";

       } else if (other.isSelected()) {
           marital = "Other";
       }


       String address = addressTextField.getText();
       String city = cityTextField.getText();
       String state = stateTextField.getText();
       String pin = pinCodeTextField.getText();


       try{

           if (name.equals("")){
               JOptionPane.showMessageDialog(null, "Name Is Required.");
           }
           if (fname.equals("")) {
               JOptionPane.showMessageDialog(null,"Father Name Is Required.");
           }
           if (dob.equals("")) {
               JOptionPane.showMessageDialog(null,"Father Name Is Required.");
           }
           if (email.equals("")) {
               JOptionPane.showMessageDialog(null,"Email Is Required.");
           }
           if (marital.equals(null)) {
               JOptionPane.showMessageDialog(null,"Please Chose Your Marital Status.");
           }
           if (address.equals("")) {
               JOptionPane.showMessageDialog(null,"Address Is Required.");
           }
           if (state.equals("")) {
               JOptionPane.showMessageDialog(null,"State Name Is Required.");
           }
           if (pin.equals("")) {
               JOptionPane.showMessageDialog(null,"Pin Number Is Required.");
           }
           else {
            Conn c = new Conn();
            String query = "INSERT INTO signup values('"+formno+"','"+name+"','"+fname+"','"+dob+"','"+gender+"','"+email+"','"+marital+"','"+address+"','"+city+"','"+pin+"','"+state+"')";
            c.s.executeUpdate(query);
            JOptionPane.showMessageDialog(null,"Signup Successful!!!");
           }

       }catch (Exception e){
           System.out.println(e);
           JOptionPane.showMessageDialog(null,"Please Fill The Form Properly");
       }
       
    }



    public static void main(String[] args) {
        new SignupOne();
    }

}






//https://youtu.be/OdqsJj3VC-Y
//1212
