import java.util.Scanner;

public class exe4 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner (System.in);
		Double horaA, aulaM,d, salario,salarioL;
		System.out.println("Escreva a hora aula:");
		horaA = entrada.nextDouble();
		System.out.println("Escreva o n�mero de aulas por m�s:");
		aulaM = entrada.nextDouble();
		System.out.println("Escreva o valor do desconto INSS:");
		d = entrada.nextDouble();
		salario = aulaM*horaA;
		salarioL = salario-(salario*d/100);
		System.out.println("O sal�rio liquido �: " + salarioL);

	}

}
