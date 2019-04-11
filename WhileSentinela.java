package lp2;

import javax.swing.JOptionPane;
public class WhileSentinela{
	public static void main(String[] args) {
		String msg = "Digite: \n s para continuar \n x para sair";
		
		String s = JOptionPane.showInputDialog(null, msg);		

		while(s.equals("s")){
			JOptionPane.showMessageDialog(null, "Sou uma tarefa");

			s = JOptionPane.showInputDialog(null, msg);
		}
		//códigos do Prof. Fábio Jr.

	}
}