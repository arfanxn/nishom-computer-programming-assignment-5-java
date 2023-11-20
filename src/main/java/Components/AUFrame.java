/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Components;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.HeadlessException;
import javax.swing.JFrame;

/**
 *
 * @author arfanxn
 */
public class AUFrame extends JFrame {

    public AUFrame() throws HeadlessException {
        // Configure the frame
        this.setTitle("Authentication");
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.getContentPane().setBackground(new Color(255, 255, 255)); // white background
        this.setResizable(true);
        this.setLayout(new BorderLayout());
    }
    
}
