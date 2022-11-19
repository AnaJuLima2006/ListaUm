import java.util.Scanner;

public class exe8 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		Double pareMa, pareMe, area;
		System.out.println("Escreva a área da parede maior: ");
		pareMa = entrada.nextDouble();
		System.out.println("Escreva a área da parede menor: ");
		pareMe = entrada.nextDouble();
		area = pareMa*pareMe;
		System.out.println("A área da sala será: " + area );
	}

}
