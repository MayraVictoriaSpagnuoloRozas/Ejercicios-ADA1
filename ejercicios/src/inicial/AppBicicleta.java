package inicial;

import java.util.Scanner;

public class AppBicicleta {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int velocidad = 45;
		double tiempo;

		System.out.print("Ingrese la cantidad de kilómetros recorridos");
		Scanner in = new Scanner(System.in);
		int kilometrosRecorridos = in.nextInt();

		tiempo = kilometrosRecorridos * velocidad;

		System.out.print("El tiempo utilizado en llegar es: " + tiempo);

	}

}
