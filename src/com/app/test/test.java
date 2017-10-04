package com.app.test;

import java.awt.Font;

import javax.swing.*;  
class test  
{  
public static void main(String args[])  
    {  
	
	String msg = "<html>This is how to get:<ul><li><i>italics</i> and "
	        + "<li><b>bold</b> and "
	        + "<li><u>underlined</u>...</ul></html>";
	     
			JLabel label = new JLabel(msg);
	      
    JFrame f= new JFrame("Label Example");  
    label.setBounds(50,100, 100,30);  
    f.add(label);
    f.setSize(300,300);  
    f.setLayout(null);  
    f.setVisible(true);  
    }  
   }  