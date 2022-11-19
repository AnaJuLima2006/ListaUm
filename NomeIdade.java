import java.util.Scanner;

public class exe2 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner (System.in);
		String nome;
		int anoNasc, anoAtual, idade;
		System.out.println("Escreva seu nome:");
		nome = entrada.next();
		System.out.println("Escreva o ano atual:");
		anoAtual = entrada.nextInt();
		System.out.println("Escreva o ano que você nasceu:");
		anoNasc = entrada.nextInt();
		idade = anoAtual-anoNasc;
		System.out.println("Seu nome é " + nome + ", você tem "  + idade + " anos" );
		
	}

}
