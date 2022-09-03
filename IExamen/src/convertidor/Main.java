package convertidor;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner visto = new Scanner(System.in);
		int opc;
		
	kilobytes k = new kilobytes();
	megabytes m = new megabytes();
		
		do {
		
		System.out.println("----bienvenido al convertidor----");
		System.out.println("por favor elija una de las siguientes opciones");
		System.out.println("1.  bytes a kilobytes");
		System.out.println("2. kilobytes a megabytes");
		System.out.println("3. salir");
		opc = visto.nextInt();
		
		switch (opc) {
		
		case 1: 
			k.datos();
			k.procedimiento();
			break;
		case 2:
			m.datos();
			m.procedimiento();
			break;
		case 3: 
			System.exit(0);
			break;
		default:
			System.out.println("opcion incorrecta");
			System.out.println("vuelva a intentarlo");
		}
		
		}while(opc!=3);
	}

}
