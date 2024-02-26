package bank.management.system;

import com.toedter.calendar.JDateChooser;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class SignupTwo extends JFrame implements ActionListener {

    long random;
    JTextField nameTextField, fnameTextField,
            emailTextField, panTextField,
            adharTextField, stateTextField,
            pinCodeTextField;

    JButton next;

    JRadioButton male, female, eyes, eno, syes,sno;

    JDateChooser jDateChooser;

    JComboBox religionCB, categoryCb, occupationCB, educationCB;



    public SignupTwo(){

        setLayout(null);

        setTitle("NEW ACCOUNT APPLICATION FORM - PART 2");

        getContentPane().setBackground(Color.WHITE);



        JLabel additionalDetails= new JLabel("Page 2: Additional Details");
        additionalDetails.setFont(new Font("Raleway",Font.BOLD,22));
        additionalDetails.setBounds(290,80,400,30);
        add(additionalDetails);

        JLabel name = new JLabel("Religion:");
        name.setFont(new Font("Raleway",Font.BOLD,20));
        name.setBounds(100,140,100,30);
        add(name);


        String [] valReligion = {"","Hindu","Muslim","Cristen","Kirati","Buddhist","Other"};
        religionCB = new JComboBox(valReligion);
        religionCB.setBackground(Color.WHITE);
        religionCB.setFont(new Font("Raleway",Font.BOLD,14));
        religionCB.setBounds(300,140,400,30);
        add(religionCB);



        JLabel fname = new JLabel("Category:");
        fname.setFont(new Font("Raleway",Font.BOLD,20));
        fname.setBounds(100,190,200,30);
        add(fname);

        String [] valCategory = {"General","OBC","SC","ST","Other"};

        categoryCb = new JComboBox(valCategory);
        categoryCb.setFont(new Font("Raleway",Font.BOLD,14));
        categoryCb.setBounds(300,190,400,30);
        categoryCb.setBackground(Color.WHITE);
        add(categoryCb);



        JLabel dob = new JLabel("Income: ");
        dob.setFont(new Font("Raleway",Font.BOLD,20));
        dob.setBounds(100,240,200,30);
        add(dob);

        String [] valIncome = {"","Null","< 1,500,00","< 2,500,00","< 5,000,00","Upto 10,000,00"};
        JComboBox incomeCB = new JComboBox<>(valIncome);
        incomeCB.setFont(new Font("Raleway",Font.BOLD,14));
        incomeCB.setBounds(300,240,400,30);
        add(incomeCB);



        JLabel gender = new JLabel("Educational ");
        gender.setFont(new Font("Raleway",Font.BOLD,20));
        gender.setBounds(100,290,200,30);
        add(gender);



        JLabel email = new JLabel("Qualification: ");
        email.setFont(new Font("Raleway",Font.BOLD,20));
        email.setBounds(100,340,200,30);
        add(email);

         String [] educationValues = {"","Non-Graduation","Graduation","Post Graduation","Doctorate","Others"};

        educationCB = new JComboBox(educationValues);
        educationCB.setFont(new Font("Raleway",Font.BOLD,14));
        educationCB.setBounds(300,315,400,30);
        add(educationCB);

        JLabel maritalStatus = new JLabel("Occupation: ");
        maritalStatus.setFont(new Font("Raleway",Font.BOLD,20));
        maritalStatus.setBounds(100,390,200,30);
        add(maritalStatus);

        String [] occupationalValues = {"","Salaried","Self-Employed","Business","Student","Retired", "Others"};
        occupationCB = new JComboBox(occupationalValues);
        occupationCB.setFont(new Font("Raleway",Font.BOLD,20));
        occupationCB.setBounds(300,390,400,30);
        add(occupationCB);


        JLabel address = new JLabel("PAN Number: ");
        address.setFont(new Font("Raleway",Font.BOLD,20));
        address.setBounds(100,440,200,30);
        add(address);

        panTextField = new JTextField();
        panTextField.setFont(new Font("Raleway",Font.BOLD,14));
        panTextField.setBounds(300,440,400,30);
        add(panTextField);

        JLabel city = new JLabel("Aadhar Number: ");
        city.setFont(new Font("Raleway",Font.BOLD,20));
        city.setBounds(100,490,200,30);
        add(city);

        adharTextField = new JTextField();
        adharTextField.setFont(new Font("Raleway",Font.BOLD,14));
        adharTextField.setBounds(300,490,400,30);
        add(adharTextField);


        JLabel state = new JLabel("Senor Citizen: ");
        state.setFont(new Font("Raleway",Font.BOLD,20));
        state.setBounds(100,540,200,30);
        add(state);

        eyes = new JRadioButton("Yes");
        eyes.setBounds(300,540,100,30);
        eyes.setBackground(Color.WHITE);
        add(eyes);

        eno = new JRadioButton("No");
        eno.setBounds(450,540,100,30);
        eno.setBackground(Color.WHITE);
        add(eno);



        ButtonGroup maritalGroup = new ButtonGroup();
        maritalGroup.add(eyes);
        maritalGroup.add(eno);




        JLabel pinCode = new JLabel("Existing Account: ");
        pinCode.setFont(new Font("Raleway",Font.BOLD,20));
        pinCode.setBounds(100,590,200,30);
        add(pinCode);

        syes = new JRadioButton("Yes");
        syes.setBounds(300,590,100,30);
        syes.setBackground(Color.WHITE);
        add(syes);

        sno = new JRadioButton("No");
        sno.setBounds(450,590,100,30);
        sno.setBackground(Color.WHITE);
        add(sno);

        ButtonGroup accountGroup = new ButtonGroup();
        maritalGroup.add(syes);
        maritalGroup.add(sno);


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

        if (eyes.isSelected()){
            marital = "Married";
        } else if (eno.isSelected()) {
            marital = "Unmarried";

        }


        String address = panTextField.getText();
        String city = adharTextField.getText();
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

            }

        }catch (Exception e){
            System.out.println(e);
            JOptionPane jOptionPane = new JOptionPane( "Please Fill The Form Properly");
        }

    }



    public static void main(String[] args) {
        new SignupTwo();
    }

}






//https://youtu.be/OdqsJj3VC-Y
//1212



