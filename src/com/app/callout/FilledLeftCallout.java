/**
 * 
 */
package com.app.callout;

import java.awt.Color;
import java.awt.ComponentOrientation;
import java.awt.Font;
import java.net.URL;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.SwingConstants;
import javax.swing.text.html.HTML;

/**
 * @author prashant.joshi
 *
 */
public class FilledLeftCallout extends Callout {
	
	private static final long serialVersionUID = 1L;
	private Icon icon = null; 
	boolean iconApplied; 

	public FilledLeftCallout(Color filledColor, Color foreColor) {
		this.setBackground(filledColor); 
		this.setForeground(Color.GREEN);
		this.setOpaque(true);
		this.setBorder(new FilledLeftCalloutBorder(filledColor)); 
		this.iconApplied = Boolean.FALSE;
	}
	
	@Override
	public void setText(String text) {
		StringBuffer txtToPrint = new StringBuffer("<html>");
		String txtArr[] = text.split("<br>");
		for (String sText : txtArr) {
			String txt = wordWrap(sText, 40, "Left");
			txtToPrint.append(txt).append("<br>");
		}
		txtToPrint.append("</html>");
		super.setText(txtToPrint.toString());
		super.setFont(new Font("serif", Font.PLAIN, 14));	
	}

	@Override
	public void displayIcon() {
		iconApplied = Boolean.TRUE;
		URL url = this.getClass().getClassLoader().getResource("student.gif");
		icon = new ImageIcon(url);
		this.setIcon(icon);
		this.setVerticalAlignment(SwingConstants.CENTER);
		this.setComponentOrientation(ComponentOrientation.RIGHT_TO_LEFT);
		this.setIconTextGap(10);
	}
}
