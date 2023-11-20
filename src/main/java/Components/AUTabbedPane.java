package Components;

/*
* Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
* Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
/**
 *
 * @author arfanxn
 */

import javax.swing.*;

public class AUTabbedPane extends JTabbedPane {

    public AUTabbedPane() {
        LoginPanel loginPanel = new LoginPanel();
        RegisterPanel registerPanel = new RegisterPanel();

        this.add("Login", loginPanel);
        this.add("Register", registerPanel);
        

    }

}
