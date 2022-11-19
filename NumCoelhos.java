import java.util.Scanner;

public class exe7 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		int numC;
		Double custo;
		System.out.println("Escreva o número de coelhos:");
		numC = entrada.nextInt();
		custo = (numC*0.70)/18+10;
		System.out.println("O custo para a criação de coelhos será: " + custo);

	}

}
