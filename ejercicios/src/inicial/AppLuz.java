package inicial;

import java.util.Scanner;

public class AppLuz {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int kW = 20;
		int total;

		System.out.print("Ingrese la cantidad de KW consumidos");
		Scanner in = new Scanner(System.in);
		int cantKw = in.nextInt();

		total = cantKw * Kw;

		System.out.print("El pago que debe realizar es: " + total);

	}

}
