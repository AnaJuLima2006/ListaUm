import java.util.Scanner;

public class exe5 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner (System.in);
		Double valorP, taxa, tempo, prestacao;
		System.out.println("Escreva o valor da pretação:");
		valorP = entrada.nextDouble();
		System.out.println("Escreva o valor da taxa de juros:");
		taxa = entrada.nextDouble();
		System.out.println("Escreva o valor do tempo de atraso:");
		tempo = entrada.nextDouble();
		prestacao = valorP+(valorP*(taxa/100)*tempo);
		System.out.println("O valor da prestação é: " + prestacao);
	}

}
