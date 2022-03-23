package meuprojeto;

import java.util.Scanner;

// Exercício corrigindo erro no código postado por outros

public class errodosoutros {
	
	public static void main(String[] args) {

	Scanner teclado = new Scanner(System.in);

	System.out.println("Número de funcionários: ");
	int count = teclado.nextInt();

	int[] RE_colab = new int[count], cat_colab = new int[count], tempo_casa = new int[count];
	double[] remun = new double[count];
	double bonusc = 200.00;
	double bonust = 15.00;

	// Entrada de dados
	System.out.print("");
	for (int i = 0; i <count; i++) {
	System.out.print("Matrícula do funcionário:");
	int funcionario_matricula = teclado.nextInt();
	
	System.out.print("1- Concursado, 2- Temporário");
	int funcionário_tipo = teclado.nextInt();
	teclado.close();
	// erros corrigidos, programa parava aqui.

}}}
