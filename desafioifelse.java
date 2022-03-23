package meuprojeto;

import java.util.Scanner;

public class desafioifelse {

	public static void main(String[] args) {
		float nota; //vai armazenar a nota
		Scanner entrada = new Scanner(System.in);
		
		System.out.print("Digite sua nota [0.0 - 10.0]:");
		nota = entrada.nextFloat();
		entrada.close();
		
		// Abaixo, primeiro se cria um filtro utilizando operador lógico &&
		if( (nota <= 10.0) && (nota >=0.0)) { 
			System.out.println("Nota válida");
		
			if( nota >= 7.0) {
				System.out.println("Parabéns, você passou direto.");
			} else {
					if(nota >= 5) {
					System.out.println("Então, está de recuperação.");
				} 	else {
					System.out.println("Reprovado, deveria se envergonhar.");
				} 
			}
		}	
			else {
			System.out.println("Nota inválida, fechando aplicativo.");
		}
}
}



