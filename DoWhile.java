package lp2;

import javax.swing.JOptionPane;
public class DoWhile{
	public static void main(String[] args) {
		String msg = "Digite: \n s para continuar \n x para sair";
		String s = "";		
		do{	
			s = JOptionPane.showInputDialog(null, msg);				
			JOptionPane.showMessageDialog(null, "Sou uma tarefa");			
		} while(s.equals("s"));
	}
}