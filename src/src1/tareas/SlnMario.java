package src1.tareas;


import libs.Input;


public class SlnMario {
	public static void main(String[] args) 
	{
		System.out.print("Ingrese su nombre completo: " );
		String nombreCompleto, nombre, apellido, espacio;
		nombreCompleto = Input.get_string();
		espacio = " ";
		nombre = nombreCompleto.substring(0,nombreCompleto.indexOf(espacio));
		char n = nombre.charAt(0);
		apellido = nombreCompleto.substring(nombreCompleto.indexOf(espacio)+1,nombreCompleto.length());
		char a = apellido.charAt(0);
		System.out.println("Nombre Completo: " + nombreCompleto);
		System.out.println("Nombre: " + nombre);
		System.out.println("Apellido: " + apellido);
		System.out.println("Los iniciales de su nombre son: " + n +  a);
		
			
	}

}


