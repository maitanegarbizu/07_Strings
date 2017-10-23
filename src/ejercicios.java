
public class ejercicios {

	public static void main(String[] args) {
		// contar vocales en un String
		
		String frase1 = "hola mundo";
		
		int contador2 = 0;
		
		for ( int indice = 0; indice < frase1.length(); indice ++){
			
			if(frase1.charAt(indice) == 'a' 
					|| frase1.charAt(indice) == 'e'
					|| frase1.charAt(indice) == 'i'
					|| frase1.charAt(indice) == 'o'
					|| frase1.charAt(indice) == 'u'){
				contador2 ++;
			}
		}
			System.out.println("contador de vocales:" + contador2);
	
	
	// contar cuantas veces aparece un caracter en un String
	
	String frase ="hola mundo";
	
	char caracter = 'o';
	
	int contador = 0;
	
	for (int indice =0; indice < frase.length(); indice ++){
		
		if(frase.charAt(indice) == caracter){
			contador = contador + 1;
		}
	}
	
	// Poner los consonantes en mayúsculas
	
	int edad = 13;
	if(edad < 18){
		
	}
	
	char caracter1 = 'i';
	if('u' == caracter){
		
	}
	
	String saludo = "hola";
	if(saludo.equals("kaixo")){
		//condición cumplida
		//el saludo está en euskera
	}else if (saludo.equals("hello")){
		
	}
}
}
