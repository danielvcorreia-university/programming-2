import java.util.*;
import java.*;

public class aula_01_exc_1_1 {
	static Scanner sc = new Scanner(System.in);
	
	public static void main (String args[]) {
		char operador;
		double number1, number2, resultado = 0;
		
		do {
			System.out.print("Calculadora\n");
			
			number1 = sc.nextDouble();
			
			do {
				operador = sc.next().charAt(0);
			} while (operador == ' ');
			
			number2 = sc.nextDouble();
			
			switch (operador) {
				case '+':
					resultado = number1 + number2;
					break;
					
				case '-':
					resultado = number1 - number2;
					break;
					
				case '*':
					resultado = number1 * number2;
					break;
					
				case '/':
					resultado = number1 / number2;
					break;			
				default: ;
			}
			
		} while (Validation(operador));
			
			System.out.printf("Resultado = %.1f", resultado);
			
	}
	
	static boolean Validation (char operador) {
		boolean validation = false;
		
		if (operador != '+' && operador != '-' && operador != '*' && operador != '/') {
			validation = true;
			System.out.print("Operador inválido!\n");
		}
		
		return validation;
	}
}

