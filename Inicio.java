/**
 * 
 */
package Controlador;

import java.util.Scanner;

/**
 * 
 */
public class Inicio {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Ingrese texto 1 ");
		String texto1 = sc.nextLine();
		System.out.println("Ingrese texto 2 ");
		String texto2 = sc.nextLine();

		String concatenado = texto1 + " " + texto2;
		int longitud = concatenado.length();
		System.out.println("Resultado:" + concatenado);
		System.out.println("Longitud:" + longitud);
		
	}

}
