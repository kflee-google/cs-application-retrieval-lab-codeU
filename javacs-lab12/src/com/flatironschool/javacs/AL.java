package com.flatironschool.javacs;

import java.awt.*;
import java.awt.event.*;

public class AL extends Frame implements WindowListener,ActionListener {
    TextField inputTextbox = new TextField(20);
    TextArea outputTextbox =new TextArea(80,80);
    Button b;
    
    
    public static void main(String[] args) {
        AL myWindow = new AL("Search");
        myWindow.setSize(900,900);
        myWindow.setVisible(true);
        
        
        
        
    }
    
    public AL(String title) {
        
        super(title);
        setLayout(new FlowLayout());
        addWindowListener(this);
        b = new Button("Search...");
        add(inputTextbox);
        add(b);
        add(outputTextbox);
        
        b.addActionListener(this);
    }
    public String returnText(){
        return inputTextbox.getText();
    }
    
    public void actionPerformed(ActionEvent e) {
        
        String textfile = "Greatly\n\n\n\n\n hearted has who believe Drift \n\n\n\n\nallow green son walls years for blush. \n\n\n\n\nSir margaret drawings Greatly hearted has who believe. \n\n\n\n\nDrift allow green son walls years for blush. Sir margaret drawings Greatly hearted has who believe. \n\n\n\n\nDrift allow green son walls years for blush. Sir margaret drawings Greatly hearted has who believe. Drift allow green son walls years for blush. Sir margaret drawings Greatly hearted has who believe. Drift allow green son walls years for blush. Sir margaret drawings Greatly hearted has who believe. Drift allow green son walls years for blush. Sir margaret drawings Greatly hearted has who believe. Drift allow green son walls years for blush. Sir margaret drawings Greatly hearted has who believe. Drift allow green son walls years for blush. Sir margaret drawings Greatly hearted has who believe. Drift allow green son walls years for blush. Sir margaret drawings Greatly hearted has who believe. Drift allow green son walls years for blush. Sir margaret drawings Greatly hearted has who believe. Drift allow green son walls years for blush. Sir margaret drawings Greatly hearted has who believe. Drift allow green son walls years for blush. Sir margaret drawings Greatly hearted has who believe. Drift allow green son walls years for blush. Sir margaret drawings Greatly hearted has who believe. Drift allow green son walls years for blush. Sir margaret drawings ";
        
        inputTextbox.setText(returnText()+"test");
        outputTextbox.setText(textfile);
        
        
    }
    public void textSeter(String textInput){
        outputTextbox.setText(textInput);
        outputTextbox.setText(textInput+"done");
    }
    public void windowClosing(WindowEvent e) {
        dispose();
        System.exit(0);
    }
    
    public void windowOpened(WindowEvent e) {}
    public void windowActivated(WindowEvent e) {}
    public void windowIconified(WindowEvent e) {}
    public void windowDeiconified(WindowEvent e) {}
    public void windowDeactivated(WindowEvent e) {}
    public void windowClosed(WindowEvent e) {}
    
}
