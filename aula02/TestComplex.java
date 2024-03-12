import static java.lang.System.*;
import java.util.Scanner;

public class TestComplex {
  // Exemplo simples de utilização da class Complex
  public static void main(String[] args) {
	Scanner sc = new Scanner(System.in); 
    
    double x = 0, y = 0;
        
    if (args.length == 0) {
		out.print("Re: ");
		x = sc.nextDouble();
		out.print("Im: ");
		y = sc.nextDouble();
		
	}
    
    else if (args.length != 2) {
		System.exit(0);
	}
	
	else {
		x = Double.parseDouble(args[0]);
		y = Double.parseDouble(args[1]);
	}
	
	Complex a = new Complex(x,y);

    // Vamos usar métodos do objeto a
    out.println("(" + a.real() + " + " + a.imag() + "i)");
    out.println("  parte real = " + a.real());
    out.println("  parte imaginaria = " + a.imag());
    out.println("  modulo = " + a.abs());
    out.printf("  argumento =  %2.2f\n", a.arg());
  }

}
