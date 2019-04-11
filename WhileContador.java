package lp2;

import javax.swing.JOptionPane;
public class WhileContador{
	public static void main(String[] args) {
		String msg = "Mostra na Tela \n Os numeros de \n 1 a n";
		JOptionPane.showMessageDialog(null, msg);

		String s = JOptionPane.showInputDialog("Digite um numero real");
		double n = Double.parseDouble(s);

		double contador = 1.0;
		while(contador <= n){
			JOptionPane.showMessageDialog(null, "contador = "+contador);
			++contador;
		}
		//códigos do Prof. Fábio Jr.

	}
}