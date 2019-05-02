package lp2;
import javax.swing.JOptionPane;

public class ChatEstudantes {
	public static void main(String[] args){
		Estudante Estudante1 = new Estudante("Estudante1","Ola");
		Estudante Estudante2 = new Estudante("Estudante2","Oi");

		while(true){
			String rv = JOptionPane.showInputDialog(Estudante1.getNome()+": "+Estudante1.getMsg());
			Estudante2.setMsg(rv);

			String rt = JOptionPane.showInputDialog(Estudante2.getNome()+": "+Estudante2.getMsg());
			Estudante1.setMsg(rt);
			
		}
	}
}
