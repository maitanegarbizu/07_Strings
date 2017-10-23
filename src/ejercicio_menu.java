import java.util.Scanner;

public class ejercicio_menu {

	public static void main(String[] args) {
		
		final int SALIR = 0;
		final int CONTAR_VOCALES = 1;
		final int AL_REVES = 2;
		final int CONTAR_CARACTERES = 3;
		final int CONSONANTES_EN_MAYUS = 4;
		
		Scanner scan= new Scanner(System.in);
		int opcion;
		
		String cadena;
		String cadenainvertida ="";
		int contador; //definir
		contador = 0; //inicializar
		//se puede hacer a la vez, int contador = 0;
		String caracter ="";
		
		
		do{
			
			System.out.println("----MENU----");
			System.out.println(CONTAR_VOCALES + "Contar las vocales de un string");
			System.out.println(AL_REVES + "Darle la vuelta a un string");
			System.out.println(CONTAR_CARACTERES + "Contar cuantas veces aparece un caracter");
			System.out.println(CONSONANTES_EN_MAYUS + "Poner las consonantes en mayúsculas");
			System.out.println(SALIR + "Salir");
			
		opcion = Integer.parseInt(scan.nextLine());
			
		
		switch(opcion){
		
		case CONTAR_VOCALES:
		
		// cuantas vocales tiene una cadena string
			
			System.out.println("Escribe una frase o una palabra");
			cadena = scan.nextLine();
				
			for(int i=0; i < cadena.length(); i = i + 1) { //igual a (i++)
				  if ((cadena.charAt(i)=='a') || (cadena.charAt(i)=='e') || (cadena.charAt(i)=='i') || (cadena.charAt(i)=='o') || (cadena.charAt(i)=='u')){
				    contador = contador + 1; // lo mismo que contador++
				  }
				}
			System.out.println("La palabra " + cadena + " contiene " + contador + " vocales");
			
		break;
		
		case AL_REVES:
			
			System.out.println("Escribe una palabra");
			cadena = scan.nextLine();
			
			for (int i=cadena.length(); i>=1; i--)
				cadenainvertida = cadenainvertida + cadena.charAt(i-1);
			
				System.out.println(cadenainvertida);
			
		break;
		
		case CONTAR_CARACTERES:
			
			System.out.println("Escribe un texto");
			cadena = scan.nextLine();
			
			System.out.println("Cadena de Texto: " + cadena);
			System.out.println("Tamaño de la cadena: " +   cadena.length() + " caracteres");
			
			
		break;
		
		case CONSONANTES_EN_MAYUS:
			
			System.out.println("Escribe una frase");
			cadena = scan.nextLine();
			String cadena2 ="";
			
			for(int i=0; i<cadena.length(); i++){
				if((cadena.charAt(i) !='a') && (cadena.charAt(i) !='e') && (cadena.charAt(i) !='i') && (cadena.charAt(i) !='o') && (cadena.charAt(i) !='u')){
					
					caracter = Character.toUpperCase (cadena.charAt(i));
					
				} 
				
				System.out.println("");
				
			}
			
			
		break;
		
		case SALIR:
			default:
				System.out.println("Opción mal");
		break;
		
		}
		
	} while(opcion != SALIR);
}
}


