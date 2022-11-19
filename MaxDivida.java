import java.util.Scanner;

public class exe1 {

	public static void main(String[] args) {
		 Scanner entrada = new Scanner (System.in);
		 Double salario,maxDivida;
		 System.out.println("Escreva o valor do salario:");
		 salario = entrada.nextDouble();
		 maxDivida = (salario*30)/100;
		 System.out.println("O valor máximo de dividas sera:" + maxDivida);

	}

}
