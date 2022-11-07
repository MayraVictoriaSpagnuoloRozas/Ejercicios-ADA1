package inicial;

import java.util.Scanner;

public class AppEstacionamiento {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int horas = 300;
		int total;

		System.out.print("Ingrese la cantidad de horas que el cliente utilizó de estacionamiento");
		Scanner in = new Scanner(System.in);
		int cantidadDeHoras = in.nextInt();

		total = cantidadDeHoras * horas;

		System.out.print("La cantidad de dinero que debe cobrar es: " + total);

	}

}
