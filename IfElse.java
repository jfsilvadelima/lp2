package lp2;

public class IfElse {
	
	public static void main(String []args){
		String nome = "Maria da Silva";
		int idade = 25;

		if(idade < 18){
			// Especificadores de formato %s$d%nf%
			System.out.printf("%s com %d anos %n Ainda e menor de idade", nome, idade);
		} else {			
			System.out.printf("%s com %d anos %n Ja e maior de idade", nome, idade);
		}
	} //Códigos do Prof. Fábio Jr.
}
