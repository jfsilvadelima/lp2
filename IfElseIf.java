package lp2;

public class IfElseIf {
	// � muito importante a identa��o do c�digo
	public static void main(String []args){
		String estudante = "Maria da Silva";
		double media = 4.2;

		if(media < 4.0){
			// Especificadores de formato %s$d%nf%
			System.out.printf("%s com Media %.2f %n Esta reprovado", estudante, media);
		} else if (media >= 4 & media <= 7.0) {			
			System.out.printf("%s com Media %.2f %n Esta em prova final", estudante, media);
		} else{
			System.out.printf("%s com Media %.2f %n Esta aprovada", estudante, media);
		}
	} //C�digos do Prof. F�bio Jr.

}
