package no.hvl.dat100;

import static javax.swing.JOptionPane.*;
import static java.lang.Integer.*;

public class Oppgave1 {
public static void main(String[] args) {
		
		String tallTxt = showInputDialog("Din lønn:  ");
		int tall = parseInt(tallTxt);
		
		//Skattesats
		double trinn0 = 0;
		double trinn1 = 0.093;
		double trinn2 = 0.241;
		double trinn3 = 0.1152; 
		double trinn4 = 0.1452;
		
		
		if (tall >=0 && tall<= 164100) {
			showMessageDialog(null, trinn0);
		} 
		else if (tall>= 164101 || tall<=230950) {
			showMessageDialog(null, tall * trinn1);
		}
		else if (tall>= 230951 || tall<=580650) {
			showMessageDialog(null, tall * trinn2);
		}
		else if (tall>= 580651 || tall<=934050) {
				showMessageDialog(null, tall * trinn3);
		}
		else if (tall>= 934050) {
					showMessageDialog(null, tall * trinn4);
		}
		
	}
	
	
	

}
