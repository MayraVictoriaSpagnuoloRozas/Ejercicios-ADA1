package inicial;

import java.util.Scanner;

public class AppArticulo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int precioDescuento;
		int precioFinal;
		
		System.out.print("Ingrese el precio del artículo");
		Scanner in = new Scanner(System.in);
		int precio = in.nextInt();
		
		precioDescuento= precio-20%;
		precioFinal= precioDescuento +15%;
		
		System.out.print("El precio con iva y descuento es: " + precioFinal);
		
		

	}

}
