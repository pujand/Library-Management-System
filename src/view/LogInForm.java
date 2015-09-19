/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import model.Person;

/**
 *
 * @author user
 */
public class LogInForm extends JFrame implements ActionListener{
    JLabel lblUser, lblPassword, lblSelect;
    JTextField tfUser, tfPassword;
    JComboBox type;
    String[] typeList = {"student","staff"};
    JButton btnLogIn;
    Person person;
    
    public LogInForm(){
        setLayout(new FlowLayout());
        setTitle("Log In Form");
        lblSelect = new JLabel("Select:");
        lblUser = new JLabel("Username: ");
        lblPassword = new JLabel("Password: ");
        type = new JComboBox(typeList);
        tfUser = new JTextField(20);
        tfPassword = new JTextField(20);
        
        btnLogIn = new JButton("Log In");
        
        
//        dateModel = new UtilDateModel();
//        JDatePanelImpl datePanel = new JDatePanelImpl(dateModel);        
//        JDatePickerImpl datePicker = new JDatePickerImpl(datePanel, new DateLabelFormatter());
        
        add(lblUser);
        add(tfUser);
        add(lblPassword);
        add(tfPassword);
        // add(datePicker);
        add(lblSelect);
        add(type);
        add(btnLogIn);
        
        setVisible(true);
        setSize(200, 200);
        btnLogIn.addActionListener(this);
       
    }
    

    @Override
    public void actionPerformed(ActionEvent e) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
