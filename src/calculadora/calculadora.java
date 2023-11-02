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
	            } else {
	                System.out.println("Opción no válida");
	                continue;
	            }

	            System.out.println("El resultado es: " + resultado);
	        }
	        
	        scanner.close();

	}

	private static double divideDosVariables(Scanner scanner) {
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

	private static double multiplicaDosVariables(Scanner scanner) {
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

	private static double restadosVariables(Scanner scanner) {
		double numeroIntro;
		double num2;
		double result;
		System.out.print("Ingresa el primer número: ");
		numeroIntro = scanner.nextDouble();
		System.out.print("Ingresa el segundo número: ");
		num2 = scanner.nextDouble();
		result = numeroIntro - num2;
		return result;
	}

	private static double sumaDosVariables(Scanner scanner) {
		double num1;
		double num2;
		double result;
		System.out.print("Ingresa el primer número: ");
		num1 = scanner.nextDouble();
		System.out.print("Ingresa el segundo número: ");
		num2 = scanner.nextDouble();
		result = num1 + num2;
		return result;
	}

}
