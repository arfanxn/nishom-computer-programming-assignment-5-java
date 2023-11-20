package Components;

import java.awt.BorderLayout;
import javax.swing.JLabel;
import javax.swing.JPanel;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
/**
 *
 * @author arfanxn
 */
public class LoginPanel extends JPanel {

    public JPanel textFieldsPanel;
    public JLabel label;
    public JLabel usernameLabel;
    public JLabel passwordLabel;
    

    public LoginPanel() {
        this.setLayout(new BorderLayout());
        
        this.label = new JLabel();
        this.label.setText("Login Page");
        this.textFieldsPanel = new JPanel();
        
        
        
        
    }

}
