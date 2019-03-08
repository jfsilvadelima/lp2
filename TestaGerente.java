package lp2;

public class TestaGerente {
    public static void main(String[] args) {
       
    	GerenteHerdeiro gerente = new GerenteHerdeiro();

        // podemos chamar métodos do Funcionario:
        gerente.setNome("João da Silva");

        // e também métodos do Gerente
        gerente.setSenha(4231);
        gerente.autentica(4231);
    }
        
      
    }
        