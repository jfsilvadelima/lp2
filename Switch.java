package lp2;

import javax.swing.JOptionPane;
public class Switch{
	public static void main(String[] args) {
		String s = JOptionPane.showInputDialog("Digite um numero inteiro entre 1 e 4");
		int n = Integer.parseInt(s);	
		
		switch (n){
			case 1:
				JOptionPane.showMessageDialog(null, "Opcao 1");
				break;
			case 2:
				JOptionPane.showMessageDialog(null, "Opcao 2");
				break;
			case 3:
				JOptionPane.showMessageDialog(null, "Opcao 3");				
			case 4:
				JOptionPane.showMessageDialog(null, "Opcao 4");
			default:
				JOptionPane.showMessageDialog(null, "Entrada invalida");
		}
		//Código do prof. Fábio Jr.
	}
}