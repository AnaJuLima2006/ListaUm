import java.util.Scanner;

public class exe7 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		int numC;
		Double custo;
		System.out.println("Escreva o n�mero de coelhos:");
		numC = entrada.nextInt();
		custo = (numC*0.70)/18+10;
		System.out.println("O custo para a cria��o de coelhos ser�: " + custo);

	}

}
