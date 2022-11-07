package inicial;

import java.util.Scanner;

public class AppEnvios {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Ingrese el número de la zona que desea enviar su paquete: 1. América del Norte- 2. América Central - 3. América del Sur - 4. Europa- 5. Asia ");
		Scanner scanner = new Scanner(System.in);
		int zona = scanner.nextInt();

		while (zona != 5) {
			switch (zona) {
			case 1:
				System.out.println("América del norte");
				break;

			case 2:
				System.out.println("América Central");
				break;

			case 3:
				System.out.println("América del Sur");
				break;

			case 4:
				System.out.println("Europa");
				break;

			case 5:
				System.out.println("Asia");
				break;
			
			System.out.println(
				"Ingrese el número de la zona que desea enviar su paquete: 1. América del Norte- 2. América Central - 3. América del Sur - 4. Europa- 5. Asia ");
			zona = scanner.nextInt();
		

	}
			System.out.println("Introduzca el peso de su paquete en kilogramos: ");

	Scanner scanner = new Scanner(System.in);// escanea lo que ingresa x teclado?
	int peso = scanner.nextInt();

	if(peso!=5);System.out.println("Su paquete no puede ser enviado, es muy pesado");

	if(peso=5)
	{// elif?
		int costo = 0; 
	}switch(zona)
	{
	         case 1:
	        	 System.out.println("El costo es: ", costo= peso * 11);
	        	 break;
	        
	         case 2:
	        	 System.out.println("El costo es: ", costo= peso * 10);
	        	 break;
	        	 
	         case 3:
	        	 System.out.println("El costo es: ", costo= peso * 12);
	        	 break;
	        	 
	         case 4:
	        	 System.out.println("El costo es: ", costo= peso * 24);
	        	 break;
	        	 
	         case 5:
	        	 System.out.println("El costo es: ", costo= peso * 27);
	        	 break;
	         }else { 
	          System.out.println("El valor de la zona es incorrecto");
	    }if

	costo(<> 0){
	        	 System.out.println("El costo del envío es: ", costo);
	         }
		}
	}
}
