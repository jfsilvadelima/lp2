package lp2;

public class Estudante {

	private String nome;
	private String msg;
	
	public Estudante () {
		
	}
	public Estudante (String nome, String msg) {
		this.nome = nome;
		this.msg = msg;
					
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getMsg() {
		return msg;
	}
	public void setMsg(String msg) {
		this.msg = msg;
	}
}
