package inicial;

import java.util.Scanner;

public class AppEjercicioHipotenusa {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int c;

		System.out.print("Ingrese la valor de a");
		Scanner in = new Scanner(System.in);
		int a = in.nextInt();

		System.out.print("Ingrese la valor de b");
		int b = in.nextInt();

		c = a * a + b * b;

		System.out.print("El valor de la hipotenusa al cuadrado es: " + c);

	}

}
