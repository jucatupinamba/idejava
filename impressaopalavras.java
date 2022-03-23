package meuprojeto;

import java.util.Scanner;

public class impressaopalavras {

	public static void main(String[] args) {
		
		Scanner texto = new Scanner(System.in);
		String str;
		System.out.println("Digite seu nome: ");
		str = texto.nextLine();
		
		System.out.println("Digite seu salário: R$");
		float sal = texto.nextFloat();
		float aum = sal +(sal * 5/100); 
		System.out.print("Parabéns " + str + " ganhou um aumento de 5%, agora é R$" + aum);
		texto.close();
	}

}
