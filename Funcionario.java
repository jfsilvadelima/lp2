package lp2;

public class Funcionario {
	
	private double salario;
    private String nome;
    private String cpf;
         // m�todos devem vir aqui
     
    public String getNome() {
        return nome;
    }
 
    public void setNome(String nome) {
        this.nome = nome;
    }
     
    public void setSalario(double salario) {
        this.salario = salario;
    }
     
    public double getSalario() {
        return salario;
    }

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public double getBonificacao() {
		// TODO Auto-generated method stub
		return 0;
	}
}

