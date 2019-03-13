package lp2;

public class Contas {

	public static void mostrarCalculo(OperacaoMatematica operacao, double x, double y) {
        System.out.println("O resultado �: " + operacao.calcular(x, y));
    }

    public static void main(String args[]) {
        // Primeiro calculamos uma soma
        Contas.mostrarCalculo(new Soma(), 5, 4); // Imprime o resultado �: 10

        // Depois uma subtra��o
        Contas.mostrarCalculo(new Subtracao(), 5, 4); // Imprime o resultado �: 0
    }
}
