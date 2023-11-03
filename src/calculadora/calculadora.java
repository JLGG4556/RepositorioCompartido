package calculadora;

import java.util.Scanner;

public class calculadora {

	/**
	 * Este método hace las funciones de una calculadora 
	 * @author José Luis Gonzalez, Darío Castillo
	 * @param args
	 */
	public static void main(String[] args) {
		 Scanner scanner = new Scanner(System.in);
	        
	        while (true) {
	            System.out.println("Opciones:");
	            System.out.println("Escribe 'add' para sumar dos números");
	            System.out.println("Escribe 'subtract' para restar dos números");
	            System.out.println("Escribe 'multiply' para multiplicar dos números");
	            System.out.println("Escribe 'divide' para dividir dos números");
	            System.out.println("Escribe 'quit' para salir de la calculadora");
	            String peticionUsuario = scanner.next();
	            
	            if (peticionUsuario.equals("quit")) {
	                break;
	            }
	            
	            double resultado;
	            
	            if (peticionUsuario.equals("add")) {
	                resultado = sumaDosVariables(scanner);
	            } else if (peticionUsuario.equals("subtract")) {
	                resultado = restadosVariables(scanner);
	            } else if (peticionUsuario.equals("multiply")) {
	                resultado = multiplicaDosVariables(scanner);
	            } else if (peticionUsuario.equals("divide")) {
	                resultado = divideDosVariables(scanner);
	            } else if (peticionUsuario.equals("AreaCirculo")) {
	                resultado = calcularAreaCircunferencia(scanner);
	            }
	            else {
	                System.out.println("Opción no válida");
	                continue;
	            }

	            System.out.println("El resultado es: " + resultado);
	        }
	        
	        scanner.close();

	}
	
    
    public static double calcularAreaCircunferencia(Scanner scanner) {
    	
    	System.out.println("Ingresa el radio");
    	double radio = scanner.nextDouble();
        double pi = 3.1415926535;
        return pi * radio * radio;
    }
	

	public static double divideDosVariables(Scanner scanner) {
		double numeroIntro1;
		double numeroIntro2;
		double resultado;
		System.out.print("Ingresa el primer número: ");
		numeroIntro1 = scanner.nextDouble();
		System.out.print("Ingresa el segundo número: ");
		numeroIntro2 = scanner.nextDouble();
		resultado = numeroIntro1 / numeroIntro2;
		return resultado;
	}

	public static double multiplicaDosVariables(Scanner scanner) {
		double numeroIntro1;
		double numeroIntro2;
		double resultado;
		System.out.print("Ingresa el primer número: ");
		numeroIntro1 = scanner.nextDouble();
		System.out.print("Ingresa el segundo número: ");
		numeroIntro2 = scanner.nextDouble();
		resultado = numeroIntro1 * numeroIntro2;
		return resultado;
	}

	public static double restadosVariables(Scanner scanner) {
		double numeroIntro;
		double numeroIntro2;
		double resultado;
		System.out.print("Ingresa el primer número: ");
		numeroIntro = scanner.nextDouble();
		System.out.print("Ingresa el segundo número: ");
		numeroIntro2 = scanner.nextDouble();
		resultado = numeroIntro - numeroIntro2;
		return resultado;
	}

	public static double sumaDosVariables(Scanner scanner) {
		double numeroIntro1;
		double numeroIntro2;
		double resultado;
		System.out.print("Ingresa el primer número: ");
		numeroIntro1 = scanner.nextDouble();
		System.out.print("Ingresa el segundo número: ");
		numeroIntro2 = scanner.nextDouble();
		resultado = numeroIntro1 + numeroIntro2;
		return resultado;
	}

}
