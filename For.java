package lp2;

import javax.swing.JOptionPane;
public class For{
	public static void main(String[] args) {
		String msg = "Mostra na Tela \n Os numeros de \n 1 a n";
		JOptionPane.showMessageDialog(null, msg);

		String s = JOptionPane.showInputDialog("Digite um numero inteiro");
		int n = Integer.parseInt(s);

		for(int i=1; i<=n; i++){
			JOptionPane.showMessageDialog(null, "i = "+i);
		}
		
		//códigos do Prof. Fábio Jr.
	}
}