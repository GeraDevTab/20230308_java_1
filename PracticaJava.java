//ejercicios de clase de java 2023 03 08

package practicaJava1;

public class Practica {

	// 1 escribir un metodo para encontrar el area de un triangulo a partir de 3 lados ingresados
	//revisar si es un triangulo valido
	
	/*2 esribir un metodo para encontrar el area y la circunferencia de un circulo dado el radio
	 utilizar PI de la libreria de Java
	  */
	
	/*3 escribir un metodo que myuestre popr consola la hora del sistema
	 * utilizar e investigar la libreria de java
	 */

    // 4 Escribir un metodo que convierta n cantidad de segundos a (hora, minutos, segundos) segun sea el caso
    // ej 3600 = "1 hora = 60 min = 3600 seg"
    
    // 5 Escribir un metodo para encontrar el volumen de una esfera dado el radio
    
    // 6 Escribir un metodo para encontrar el volumen de un cono a dado el radio y la altura
    
    // 7 Encontrar el area superficial de un cubo dado un lado a

    // 8 Escribir un metodo para descubrir si un año ingresado es bisiesto o no
	 
	// 9. Escribir mostrar en pantalla los primeros 100 numeros primos
	
	// 10. Escribir un programa para sumar 2 numeros sin usar operadores aritmeticos
	
	// 11. Escribir un método para verificar si un numero positivo de 2 digitos es palindromo
	
	// 12. Sin usar loops, escribir un metodo para sumar todos los digitos de un numero donde 99 >= n >= 10
	
	// 13. Escribir un método para remover espacios en blanco de un String. ej -> "Hola Mundo" -> "HolaMundo"
	
	// 14. Escribir un método para invertir un String. ej -> "Hola" -> "aloH" --- Sin usar loops
	
	// 15. Escribir un metodo para encontrar el factorial de un numero sin loops
	
	static void primerMetodo(int Numero12) {
		System.out.println(Numero12);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//primerMetodo(11);
		//System.out.println(true || false || true && !true && !false);
		segundoProblema(7.5);
	}
	
	static void segundoProblema(double pRadio) {
	/*2 escribir un metodo para encontrar el area y la circunferencia de un circulo dado el radio
	 utilizar PI de la libreria de Java
	 formula para circunferencia de un circulo es: "2r*PI"
	  */
	double pi = Math.PI;
	double radio = pRadio;
	double resultadoArea  = (radio*radio)*pi;
	double resultadoCircunferencia = 2*pi*radio;
	System.out.println("Problema 2 - El area del circulo con radio: "+pRadio+" es igual a: "+resultadoArea);
	System.out.println("Problema 2 - La circunferencia de un circulo con radio: "+pRadio+" es igual a: "+resultadoCircunferencia);
	}

	
}          
