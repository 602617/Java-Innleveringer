package no.hvl.dat100;

import static java.lang.Integer.*;
import static javax.swing.JOptionPane.*;

public class Oppgave3 {

	public static void main(String[] args) {

		String tallTxt = showInputDialog("Gi n-verdi:");
		int n = parseInt(tallTxt);
		
		showMessageDialog(null, n * fakultet(n-1));
		
		
	}
	
	public static int fakultet(int n) {
		if(n==1) return n;
		return n * fakultet(n-1);
		
		
		
	}
		
	
}

