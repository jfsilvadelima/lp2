package br.com.heranca;

/**
 *
 * @author fjrda
 */

// Herança dá acesso aos atributos e métodos
public class Presidente extends Funcionario{
    String decisao;
    
    public Presidente(){
        super("Maria", 1230.56, 'F', new Endereco()); // chama o construtor da super classe Funcionario        
    }
    
    public String mostra(){
       
        return "Isso é da Super Classe Funcionario:\n"
                + "Nome.:" + getNome()+"\n"
                + "Remuneraão.: "+getRemuneracao()+"\n"
                + "Sexo.:"+getSexo();         
    }
    
    // Sobrescreveu o metodo setRemuneracao() da superclasse Funcionario
    // Herança dá acesso ao comportamento padrão da superclasse
    // Polimorfismo dá a oportunidade de mudar o comportamento herdado da superclasse
   
    
    public void setRemuneracao(double remuneracao){
        super.remuneracao = remuneracao + (0.3 * remuneracao);
    }
}
