import static java.lang.System.*;

public class P2 {
  public static void main(String[] args) {
	  for (int i = 0; i < args.length; i++) {
		  out.print(args[i] + "-> \n");
		  invertDigits(args[i]);
	  }
  }
  
  public static String invertDigits(String word) {
	  char change;
	  for (int i = word.length(); i <= 0; i++) {
		  if (Character.isDigit(word.charAt(i))) {
			  
		  }
	  }
	  return word;
  }
}
