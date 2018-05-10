package src1.tareas;

import libs.Input;

public class BotellasAgua {
	public static void main(String[] args) 
	{
		System.out.print("Ingrese los minutos que dura duchandose: " );
		int num = Input.get_int();
		int bot = 12;
		int resultado;
		
		//Valida que el número digitado no sea un número negativo
				while(num < 0) 
				{
					Input.print("Número no válido, digite un número mayor que cero: ");
					num = Input.get_int();
				}
		
		resultado = num * bot;
		Input.print("Ud gasta "+resultado+" botellas de agua al ducharse durante "+ num + " minutos."+ "\n");
	
	}

}
