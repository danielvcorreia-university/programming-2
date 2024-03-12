import static java.lang.System.*;

public class P3 {

  public static void main(String[] args) {
	  if (args.length % 2 != 0) {
		  out.println("ERROR: even number of arguments required!");
		  System.exit(1);
	  }
	  
	  for (int i = 0; i < args.length; i+=2) {
		  out.println("\"" + args[i] + "\"" + " is prefixed by \"" + args[i+1] + "\" -> " + isPrefix(args[i], args[i+1], 0));
	  }
  }
  
  public static boolean isPrefix(String word, String prefix, int count) {
	  if(prefix.equals("")) return true;
	  if(word.equals("")) return false;
	  if(word.length() < prefix.length()) return false;
	  if(word.charAt(count) != prefix.charAt(count)) return false;
	  if(count == prefix.length() - 1) return true;
	  return isPrefix(word, prefix, count+1);
  }
}

