package lp2;

public class TestaGerente {
    public static void main(String[] args) {
       
    	GerenteHerdeiro gerente = new GerenteHerdeiro();

        // podemos chamar m�todos do Funcionario:
        gerente.setNome("Jo�o da Silva");

        // e tamb�m m�todos do Gerente
        gerente.setSenha(4231);
        gerente.autentica(4231);
    }
        
      
    }
        