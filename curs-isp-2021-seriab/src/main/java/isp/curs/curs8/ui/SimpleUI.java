/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package isp.curs.curs8.ui;

import javax.swing.*;

class SimpleUI {
	public static void main(String[] args){
		JFrame f = new JFrame("title");
		JPanel p = new JPanel();
		JButton b = new JButton("press me");

		p.add(b);			// add button to panel
		f.setContentPane(p);    // add panel to frame

		f.setVisible(true);
	}
}
