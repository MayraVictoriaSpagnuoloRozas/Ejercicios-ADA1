package inicial;

import java.util.Scanner;

public class AppAutobuses {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int costoBoleto;
		int costoKilometro = 20;

		System.out.print("Ingrese la cantidad de kilómetros recorridos");
		Scanner in = new Scanner(System.in);
		int kilometroRecorrido = in.nextInt();

		costoBoleto = costoKilometro * kilometroRecorrido;

		System.out.print("El valor del boleto es: " + costoBoleto);

	}

}
