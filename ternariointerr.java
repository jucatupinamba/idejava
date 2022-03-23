package meuprojeto;

public class ternariointerr {

	public static void main(String[] args) {
		int a;
		String b;
		a = 12;
		b = (a == 5) ? "a é igual a 5": "a é diferente de 5";
		System.out.println("Resultado : " + b );
		
		b = (a == 12) ? "a é igual a 12": "a é diferente de 12";
		System.out.println("Resultado : " + b);
		
		int c = 14;
		String d = (c > 14) ? "Atrasadp": (c < 14) ? "Adoamtadp" : "No Horário";
		System.out.println("Resultado : " + d);
		
		/*
		 * a = 14
		 */
		
	}

}


