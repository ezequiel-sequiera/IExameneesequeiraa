package convertidor;

import java.util.Scanner;

public class kilobytes {

		double v,r;
		Scanner entrada = new Scanner(System.in);
		
	public void procedimiento () {
		
	
		
		r = v / 1000;
		System.out.println("el voltage en kilobytes es "+r);
	}
	
	public void datos () {
		
		System.out.println("por favor ingrese el valor en bytes");
		v = entrada.nextDouble();
	}
	
	
	
}
