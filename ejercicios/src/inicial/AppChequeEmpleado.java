package inicial;

import java.util.Scanner;

public class AppChequeEmpleado {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int otrosGastos = 100.0;
		int hotel;
		int comida;
		int total;
		int totalFinal;

		System.out.print("Ingrese la cantidad de dias que va a viajar");
		Scanner in = new Scanner(System.in);
		int dias = in.nextInt();

		total = (comida + hotel) * dias;
		totalFinal = total + otrosGastos;

		System.out.print("El monto del cheque debe ser de: " + totalFinal);

	}

}
