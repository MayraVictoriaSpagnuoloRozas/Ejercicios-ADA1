package inicial;

import java.util.Scanner;

public class AppMayorDeTres {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int mayor = 0;
		Scanner scanner = new Scanner(System.in);
		System.out.println("Ingrese valor 1");
		int valor1 = scanner.nextInt();
		System.out.println("Ingrese valor 2");
		int valor2 = scanner.nextInt();
		System.out.println("Ingrese valor 3");
		int valor3 = scanner.nextInt();
		if (valor1 > valor2) {
			if (valor1 > valor3) {
				mayor = valor1;
			} else {
				mayor = valor3;
			}

		} else {
			if (valor2 > valor3) {
				mayor = valor2;
			} else {
				mayor = valor3;
			}

		}
		System.out.println("El mayor de los 3 valores es: " + mayor);
		scanner.close();
	}

}
