//ejercicios de clase de java 2023 03 08

package practicaJava1;

import java.text.DecimalFormat;
import java.time.LocalDateTime;
import java.util.GregorianCalendar;

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
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//primerMetodo(11);
		//System.out.println(true || false || true && !true && !false);
		primerProblema(15, 8, 13);
		segundoProblema(7.5);
		tercerProblema();
		cuartoProblema(100);
		quintoProblema(5);
		sextoProblema(8, 18);
		septimoProblema(3);
		octavoProblema(2023);
		
	}
	
	static void primerProblema(double pLado1, double pLado2, double pLado3) {
		/* 1 escribir un metodo para encontrar el area de un triangulo a partir de 3 lados ingresados
		revisar si es un triangulo valido
		para validar si es un triangulo se debe aplicar teorema de desigualdad del 
		triangulo (la suma de dos lados es mayor que el 3er lado)
		formula para semiperimetro s = (a + b + c)/2
		formula para area a partir del semiperimetro =  raiz cuadrada de Semiperimetro * (semiperimetro - a)(semiperimetro - b)(semiperimetro - c)
		*/
		double lado1 = pLado1;
		double lado2 = pLado2;
		double lado3 = pLado3;
		if(lado1+lado2>lado3 && lado1+lado3>lado2 && lado2+lado3>lado1) {
			System.out.println("Problema 1 - Los valores ingresados: "+lado1+", "+lado2+", "+lado3+" corresponden a un triangulo valido");
			double semiperimetro = (lado1 + lado2 + lado3)/2;
			//System.out.println(lado1);
			//System.out.println(lado2);
			//System.out.println(lado3);
			//System.out.println(semiperimetro);
			double areaTriangulo = Math.sqrt(semiperimetro * ((semiperimetro-lado1)*(semiperimetro-lado2)*(semiperimetro-lado3)));
			System.out.println("Problema 1 - El area del triangulo es: "+areaTriangulo+" unidades cuadradas");
		}
		else {
			System.out.println("Problema 1 - Los valores ingresados no corresponden a un triangulo válido");
		}
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
	
	static void tercerProblema() {
		/*3 escribir un metodo que myuestre popr consola la hora del sistema
		 * utilizar e investigar la libreria de java
		 */
		System.out.println("Problema 3 - La hora del sistema es "+LocalDateTime.now());
	}
	
	static void cuartoProblema(double pSegundos) {
		// 4 Escribir un metodo que convierta n cantidad de segundos a (hora, minutos, segundos) segun sea el caso
	    // ej 3600 = "1 hora = 60 min = 3600 seg"
		double segundos = pSegundos;
		
		double minutos = segundos/60;
		double hora = segundos/3600;
		
		System.out.println("Problema 4 - "+segundos+" segundos, equivalen a "+minutos+" minutos o "+hora+" horas");
	}
	
	static void quintoProblema(double pRadio) {
		// 5 Escribir un metodo para encontrar el volumen de una esfera dado el radio
	    double radio = pRadio;
	    //double cons43 = 4d/3d; 
	    
	    DecimalFormat df = new DecimalFormat("#.##");
	    double volumen = 4d/3d*Double.valueOf(df.format( Math.PI))*(Math.pow(radio, 3));
	    //System.out.println(cons43);
	    System.out.println("Problema 5 - El volumen de una esfera con radio: "+radio+" es de "+volumen+" unidades cubicas");
	}
	    
	
	static void sextoProblema(double pRadio, double pAltura) {
		
	    // 6 Escribir un metodo para encontrar el volumen de un cono a dado el radio y la altura
	    double radio = pRadio;
	    double altura = pAltura;
	    
	    double volumen = 1d/3d*Math.PI*(Math.pow(radio, 2))*altura;
	    
	    System.out.println("Problema 6 - El volumen de un cono con radio: "+radio+" es igual a "+volumen+" unidades cubicas");
	}
	
	static void septimoProblema(double pLado) {
		// 7 Encontrar el area superficial de un cubo dado un lado a
		double lado = pLado;
		
		double areaCubo = 6d*Math.pow(lado, 2);
		
		System.out.println("Problema 7 - El area superficial de un cubo, del cual uno de sus lados mide: "+lado+" es igual a "+areaCubo+" unidades cuadradas");
		

	}
	
	static void octavoProblema(int pAnio) {
		// 8 Escribir un metodo para descubrir si un año ingresado es bisiesto o no
		GregorianCalendar calendario = new GregorianCalendar();
		if(calendario.isLeapYear(pAnio)) {
			System.out.println("Problema 8 - El año "+pAnio+" es bisiesto");
		}
		else {
			System.out.println("Problema 8 - El año "+pAnio+" NO es bisiesto");
			
		}
		
	}

	static void novenoProblema(int pCantidadDeNumerosPrimos) {
		// 9. Escribir mostrar en pantalla los primeros 100 numeros primos
		//int verificacionPar =2;
		double[] numerosPrimos = new double[pCantidadDeNumerosPrimos];
		double[] numerosNoPrimos = new double[pCantidadDeNumerosPrimos];
 		double inicioPrimos = 1;
		for(int i=0;i<pCantidadDeNumerosPrimos;i++) {
			/*if(inicioPrimos%verificacionPar == 0) {
				System.out.println("El numero "+i+" no es primo");
				inicioPrimos++;
			}*/
			if(inicioPrimos != 1 && inicioPrimos != 2 && (inicioPrimos%3d)==0 && (inicioPrimos%2d)!=0)  {
				//&& (inicioPrimos%1d)==0 && inicioPrimos%inicioPrimos==1  && 
			numerosPrimos[i] = inicioPrimos;
			
			System.out.println("el numero "+inicioPrimos+" es primo");
			System.out.println("resultado division"+inicioPrimos%3d);
			System.out.println((inicioPrimos%2d)!=0);
			inicioPrimos++;
			}
			else {
				System.out.println("el numero "+inicioPrimos+" no es primo");
				
				numerosNoPrimos[i] = inicioPrimos;
				System.out.println("resultado division"+inicioPrimos%3d);
				inicioPrimos++;
				
			}
		}
		
		System.out.println("los numeros primos "+Arrays.toString(numerosPrimos));
		System.out.println("el numero NOPRIMOS"+Arrays.toString(numerosNoPrimos));
	}
	
	static void decimoProblema(int num1, int num2) {
		// 10. Escribir un programa para sumar 2 numeros sin usar operadores aritmeticos
		
	        while (num2 != 0) {
	            int carry = num1 & num2; // Encuentra los bits que se van a llevar
	            num1 = num1 ^ num2; // Suma los bits sin llevar
	            num2 = carry << 1; // Lleva los bits al siguiente bit
	        }
	        System.out.println("la suma es: "+num1); 
	    }
	
	
	static void onceavoProblema(int numero) {
		// 11. Escribir un método para verificar si un numero positivo de 2 digitos es palindromo
		 if(numero < 10 || numero > 99){

             System.out.println("No es de 2 digitos");
        }
            int digito1 = numero / 10;
            int digito2 = numero % 10;

            System.out.println("El numero "+numero+" Resultado de palindromo: "+(digito1 == digito2));
	}
	
	static void doceavoProblema(int digitos) {
		// 12. Sin usar loops, escribir un metodo para sumar todos los digitos de un numero donde 99 >= n >= 10
		 if (digitos < 10 || digitos > 99) {
	            System.out.println("El numero ingreso no es de dos digitos");
	        }
	        int digito1 = digitos / 10; // primer digito
	        int digito2 = digitos % 10; // segundo digito
	        System.out.println(digito1 + digito2); // devuelve la suma de los digitos
	}
	
	static void treceavoProblema(String mensaje) {
		// // 13. Escribir un método para remover espacios en blanco de un String. ej -> "Hola Mundo" -> "HolaMundo"
		String nuevaCadena = mensaje.replaceAll("\\s", "");
        System.out.println(nuevaCadena);
	}
	
	static void catorceavoProblema(String mensaje) {
		// 14. Escribir un método para invertir un String. ej -> "Hola" -> "aloH" --- Sin usar loops
		String cadenaInvertida = "";
        for (int x = mensaje.length() - 1; x >= 0; x--) {
            cadenaInvertida = cadenaInvertida + mensaje.charAt(x);
            
        }
        System.out.println(cadenaInvertida);
	}
	
	static int quinceavoProblema(int factorial) {
		// 15. Escribir un metodo para encontrar el factorial de un numero sin loops
		  if (factorial==0) {
			   return 1;
		  }
		  else {
			   return factorial * quinceavoProblema(factorial-1);
			   
			  }
	}

	
}          
