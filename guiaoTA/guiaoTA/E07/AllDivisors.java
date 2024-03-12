import static java.lang.System.*;

public class AllDivisors {
	public static void main(String[] args) {
		if (args.length != 1) {
			out.println("Usage: java -ea AllDivisors <NUM>");
		}
		
		int n = Integer.parseInt(args[0]);
		out.println();
		printDivisors(n, 0);
	}
	
	public static void printDivisors(int number, int indentation) {
		for (int i = 0; i < indentation; i++) {
			out.print("   ");
		}
		
		out.println(number);
		
		for (int i = number/2; i > 1; i--) {
			if (number % i == 0) printDivisors(i, indentation+1);
		}
	}
}

