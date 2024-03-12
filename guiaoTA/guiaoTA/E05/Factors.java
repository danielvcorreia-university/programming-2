import static java.lang.System.*;

public class Factors {

  public static void main(String[] args) {
    for(int i = 0; i < args.length; i++)
      out.println(args[i]+" = "+factors(Integer.parseInt(args[i]), 2));
  }
  
  public static String factors(int n, int c) {
	  if (n == 0) return "0";
	  if (n == 1) return "1";
	  // vou dividir o fator por 2 até valores de fator / 2 porque não é necessário tentar valores depois desses
	  for (int i = 2; i < n/2; i++) {
		  if (n % i == 0) return i + " * "  + factors(n/2, 2);
	  }
	  return String.valueOf(n);
  }

}

