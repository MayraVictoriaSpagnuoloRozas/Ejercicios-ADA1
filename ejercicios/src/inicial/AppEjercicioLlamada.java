package inicial;

import java.util.Scanner;

public class AppEjercicioLlamada {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int llamada;
		int costoMinuto = 30;

		System.out.print("Ingrese la cantidad de minutos que dura la llamada");
		Scanner in = new Scanner(System.in);
		int tiempoDuracion = in.nextInt();

		llamada = tiempoDuracion * costoMinuto;

		System.out.print("El valor de la llamada es: " + llamada);

	}

}
