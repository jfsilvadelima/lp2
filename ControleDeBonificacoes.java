package lp2;

public class ControleDeBonificacoes {
	private double totalDeBonificacoes = 0;
	
	public void registra(Funcionario funcionario) {
	this.totalDeBonificacoes += funcionario.getBonificacao();
	}

	public double getTotalDeBonificacoes() {
	return this.totalDeBonificacoes;
	}
	
	ControleDeBonificacoes controle = new ControleDeBonificacoes();
	
	Gerente funcionario1 = new Gerente();
	
}
