package inicial;

import java.util.Scanner;

public class AppEjercicioDolares {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int dolar = 100;
		int resultado = 0;

		System.out.print("Ingrese la cantidad de dinero que quiere convertir a dolares");
		Scanner in = new Scanner(System.in);
		int cantidadDinero = in.nextInt();

		if (cantidadDinero > 100) {
			resultado = cantidadDinero / dolar;
		}
		    else { 
				System.out.print("La cantidad de dinero no es suficiente");
		    }
		}

		System.out.print("La cantidad de dolares que puede convertir es: " + resultado);
	}}
