package lp2;

public class TestaFuncionario {
		 
	    public static void main(String[] args) {
	        Funcionario funcionario = new Funcionario();
	        funcionario.setNome("Thiago");
	        funcionario.setSalario(3500);
	         
	        System.out.println(funcionario.getNome());
	        System.out.println(funcionario.getSalario());
	 
	    }
	}
