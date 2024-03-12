import static java.lang.System.*;

public class Fibonacci {
	static int[] table = new int[100];	
		
  public static void main(String[] args) {
    if (args.length < 1) {
      out.println("USO: java -ea Fibonacci N [N ...]");
      exit(1);
    }

    // Alguns testes:
    assert fibonacci(0) == 0;
    assert fibonacci(1) == 1;
    assert fibonacci(2) == 1;
    assert fibonacci(5) == 5;
	
    for(int i = 0; i < args.length; i++) {
      int n = Integer.parseInt(args[i]);
      long time = nanoTime();  // System.nanoTime() gives the time in ns.
      int f = fibonacci(n);
      time = nanoTime() - time;
      out.printf("fibonacci(%d) = %d (%d ns)\n", n, f, time);
    }
  }

  public static int fibonacci(int n) {
    assert n >= 0;
	int value;
    
    if (n == 0) return table[0];
    else if (n == 2 || n == 1) return 1;
    else {
		if (table[n] != 0) {
			return table[n];
		}
		else {
			value = fibonacci(n-1) + fibonacci(n-2);
			table[n] = value;
			return value;
		}
	}
  }

}
