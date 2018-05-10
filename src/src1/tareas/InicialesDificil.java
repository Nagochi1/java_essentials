package src1.tareas;

import libs.Input;

public class InicialesDificil {
	public static void main(String[] args) 
	{
		System.out.print("Ingrese su nombre completo: " );
		String nombres = Input.get_string();
		String[] arrayNombres = nombres.split("\\s+ ");
		String n;
	 
		System.out.print("Las iniciales del nombre ingresado son: ");
		for (int i = 0; i < arrayNombres.length; i++) {
			n = Character.toString(arrayNombres[i].charAt(0));
			System.out.print(n.toUpperCase());
					
		}
	}

}
