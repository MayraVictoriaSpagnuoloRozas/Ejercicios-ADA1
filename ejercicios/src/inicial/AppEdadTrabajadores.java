package inicial;

import java.util.Scanner;

public class AppEdadTrabajadores {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int edad;
		int añoActual = 2022;

		System.out.println("Ingrese el año de nacimiento del trabajad@r: ");
		Scanner in = new Scanner(System.in);
		int añoDeNacimiento = in.nextInt();

		edad = añoActual - añoDeNacimiento;

		System.out.println("La edad del trabajad@r es: " + edad);

	}

}
