package meuprojeto;

import java.util.Scanner;
import java.util.Calendar;

public class desafioCalendar {

	public static void main(String[] args) {
		Scanner texto = new Scanner(System.in);
	
		System.out.println("Digite seu ano de nascimento: ");
		int ano_nasc = texto.nextInt();
		texto.close();
		
		Calendar calendario = Calendar.getInstance();
		int ano_atual = calendario.get(Calendar.YEAR);
		int idade = ano_atual - ano_nasc;
		System.out.println("Sua idade é " + idade);
		
		
		
		
		
				
		
	}
	
}