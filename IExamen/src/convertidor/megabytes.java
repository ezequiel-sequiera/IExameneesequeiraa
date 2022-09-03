package convertidor;

import java.util.Scanner;

public class megabytes {

	double v,r;
	Scanner entrada = new Scanner(System.in);
	
public void procedimiento () {
	

	
	r = v / 1024;
	System.out.println("el voltage en megabytes es "+r);
}

public void datos () {
	
	System.out.println("por favor ingrese el valor en kilobytes");
	v = entrada.nextDouble();
}


}
