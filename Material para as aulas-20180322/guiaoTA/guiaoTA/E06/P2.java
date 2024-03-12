import static java.lang.System.*;

public class P2
{
  public static void main(String[] args) {
	  if (args.length == 0) {
		  out.println("Number of arguments incorrect");
		  System.exit(1);
	  }
	  
	  for (int i = 0; i < args.length; i++) {
		  out.printf(args[i] + " contains %d pairs of consecutive equal characters", countPairs(args[i]));
	  }
  }
  
  public static int countPairs(String args) {
	  return countPairs(args, 0);  
   }
  private static int countPairs(String args, int count) {
	  if (count >= args.length()-1) return 0;
	  if (args.charAt(count) == args.charAt(count+1)) {
		  return 1 + countPairs(args, count+1); 
	  }
	  else return 0 + countPairs(args, count+1);
   }
}

