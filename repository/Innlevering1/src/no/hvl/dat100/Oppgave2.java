package no.hvl.dat100;

import static javax.swing.JOptionPane.*;
import static java.lang.Integer.*;

public class Oppgave2 {

	public static void main(String[] args) {
		
	
		for (int i=1; i<=10; i++) {
			
			String karTxt = showInputDialog("Poengsum:  ");
			int tallKarakter = parseInt(karTxt);
			
			if (tallKarakter <=100 && tallKarakter>= 90) {
				showMessageDialog(null, "A");
			} 
			else if (tallKarakter<=89 && tallKarakter >=80) {
				showMessageDialog(null, "B");
			}
			else if (tallKarakter<=79 && tallKarakter >=60) {
				showMessageDialog(null, "C");
			}
			else if (tallKarakter<=59 && tallKarakter >=50) {
				showMessageDialog(null, "D");
			}
			else if (tallKarakter<=49 && tallKarakter >=40) {
				showMessageDialog(null, "E");
			}
			else if (tallKarakter<= 39 && tallKarakter >=0) {
				showMessageDialog(null, "F");
			}
			else if(tallKarakter>100 || tallKarakter<0) {
				showMessageDialog(null, "Ugyldig.");
				i--;
				
			}
			}
		
	}
}

