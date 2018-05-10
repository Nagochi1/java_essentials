package src1.tareas;

import libs.Input;

public class InicialesFacil {
	public static void main(String[] args) 
	{
		System.out.print("Ingrese su nombre completo: " );
		String nombres = Input.get_string();
		String[] arrayNombres = nombres.split("\\s+ ");
	 
		System.out.print("Las iniciales del nombre ingresado son: ");
		for (int i = 0; i < arrayNombres.length; i++) {
			System.out.print(arrayNombres[i].charAt(0));
			
		}
		
	}
}
