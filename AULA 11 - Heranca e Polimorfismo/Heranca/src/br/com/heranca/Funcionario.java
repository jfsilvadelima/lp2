package br.com.heranca;



/**
 *
 * @author fjrda
 */
public class Funcionario {
    private String nome;
    public double remuneracao;
    private char sexo;    
    protected Endereco endereco; // protected Visível só para as subclasses

    public Funcionario(){}
    
    public Funcionario(String nome, double remuneracao, char sexo, 
            Endereco endereco) {
        this.nome = nome;
        this.remuneracao = remuneracao;
        this.sexo = sexo;
        this.endereco = endereco;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getRemuneracao() {
        return remuneracao;
    }

    public void setRemuneracao(double remuneracao) {
        this.remuneracao = remuneracao + (0.1 * remuneracao);
    }

    public char getSexo() {
        return sexo;
    }

    public void setSexo(char sexo) {
        this.sexo = sexo;
    }

    public Endereco getEndereco() {
        return endereco;
    }

    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }
    
    

    
}
