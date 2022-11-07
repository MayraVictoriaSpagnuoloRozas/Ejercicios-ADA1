package inicial;

import java.util.Scanner;

public class AppEnvios2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(
				"Seleccione la región donde desea hacer el envio: 1.America del Norte- 2.America Central- 3. America del Sur- 4. Europa- 5. Asia");
		Scanner scanner = new Scanner(System.in);
		int zona = scanner.nextInt();

		System.out.println("Introduzca el peso del paquete en kilogramos");
		int peso = scanner.nextInt();
		int costo = 0;

		if (peso > 5) {
			System.out.println("Su paquete no puede ser enviado, es demasiado pesado");
		} else
			switch (zona) {
			case 1:
				costo = peso * 11;
				break;
			case 2:
				costo = peso * 10;
				break;
			case 3:
				costo = peso * 12;
				break;
			case 4:
				costo = peso * 24;
				break;
			case 5:
				costo = peso * 27;
				break;
			default:
				System.out.println("El valor de la zona es incorrecto");

			}
		System.out.println("El costo del envio es: " + costo);
		scanner.close();
	}

}
