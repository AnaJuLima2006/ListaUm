import java.util.Scanner;

public class exe6 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		Double f, c;
		System.out.println("Escreva a temperatura em graus fahrenheit:");
		f = entrada.nextDouble();
		c = (f-32)/1.8;
		System.out.println("A temperatura será:" + c);

	}

}
