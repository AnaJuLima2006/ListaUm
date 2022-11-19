import java.util.Scanner;

public class exe3 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner (System.in);
		Double n1, n2, n3, n4, m;
		System.out.println("Escreva a primeira nota: ");
		n1 = entrada.nextDouble();
		System.out.println("Escreva a segunda nota: ");
		n2 = entrada.nextDouble();
		System.out.println("Escreva a terceira nota: ");
		n3 = entrada.nextDouble();
		System.out.println("Escreva a quarta nota: ");
		n4 = entrada.nextDouble();
		m = (n1+n2+n3+n4)/4;
		System.out.println("Sua média é: " + m);
	}

}
