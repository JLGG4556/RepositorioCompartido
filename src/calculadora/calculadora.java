package calculadora;

import java.util.Scanner;

public class calculadora {

	public static void main(String[] args) {
		 Scanner scanner = new Scanner(System.in);
	        
	        while (true) {
	            System.out.println("Opciones:");
	            System.out.println("Escribe 'add' para sumar dos números");
	            System.out.println("Escribe 'subtract' para restar dos números");
	            System.out.println("Escribe 'multiply' para multiplicar dos números");
	            System.out.println("Escribe 'divide' para dividir dos números");
	            System.out.println("Escribe 'quit' para salir de la calculadora");
	            String userChoice = scanner.next();
	            
	            if (userChoice.equals("quit")) {
	                break;
	            }
	            
	            double num1, num2, result;
	            
	            if (userChoice.equals("add")) {
	                System.out.print("Ingresa el primer número: ");
	                num1 = scanner.nextDouble();
	                System.out.print("Ingresa el segundo número: ");
	                num2 = scanner.nextDouble();
	                result = num1 + num2;
	            } else if (userChoice.equals("subtract")) {
	                System.out.print("Ingresa el primer número: ");
	                num1 = scanner.nextDouble();
	                System.out.print("Ingresa el segundo número: ");
	                num2 = scanner.nextDouble();
	                result = num1 - num2;
	            } else if (userChoice.equals("multiply")) {
	                System.out.print("Ingresa el primer número: ");
	                num1 = scanner.nextDouble();
	                System.out.print("Ingresa el segundo número: ");
	                num2 = scanner.nextDouble();
	                result = num1 * num2;
	            } else if (userChoice.equals("divide")) {
	                System.out.print("Ingresa el primer número: ");
	                num1 = scanner.nextDouble();
	                System.out.print("Ingresa el segundo número: ");
	                num2 = scanner.nextDouble();
	                result = num1 / num2;
	            } else {
	                System.out.println("Opción no válida");
	                continue;
	            }

	            System.out.println("El resultado es: " + result);
	        }
	        
	        scanner.close();

	}

}