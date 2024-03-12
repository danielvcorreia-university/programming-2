import static java.lang.System.*;

public class P2
{
  public static void main(String[] args) {
	  for (int i = 0; i < args.length; i++) {
		  out.printf("\"" + args[i] + "\" contains %d pairs of consecutive equal characters\n", countPairs(args[i]));
	  }
  }
  
  public static int countPairs(String word) {
	  return countPairs(word, 0);
  }
  private static int countPairs(String word, int count) {
	  if (count >= word.length()-1) return 0;
	  if (word.charAt(count) == word.charAt(count+1)) {
		  return 1 + countPairs(word, count+1);
	  }
	  else {
		  return 0 + countPairs(word, count+1);
	  }
	  
  }
}

