package inicial;

import java.util.Scanner;

public class AppEjercicioPintura {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int mt2 = 2000;
		int total;

		System.out.print("Ingrese la cantidad de metros cuadrados que desea pintar");
		Scanner in = new Scanner(System.in);
		int cantidadMt2 = in.nextInt();

		total = cantidadMt2 * mt2;

		System.out.print("La cantidad de dinero que debe cobrar es: " + total);

	}

}
