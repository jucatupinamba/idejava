package meuprojeto;

import java.util.Scanner;

public class projetotreino {

	public static void main(String[] args) {
		Scanner txt = new Scanner(System.in);
		System.out.println("Digite seu nome: ");
		String str = txt.nextLine();
		
		System.out.println("Quanto você tem? ");
		float servico = txt.nextFloat();
	
		System.out.println("Quanto me deve? ");
		float dever = txt.nextFloat();
		
		float div = (servico - dever);
		System.out.println("Muito bem " + str + " sobrou " + div);
		txt.close();
		
		
		
	}

}
