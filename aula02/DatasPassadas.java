import static java.lang.System.*;

public class DatasPassadas {

  public static void main(String[] args) {
    Data atual = new Data();
    Data natal = new Data(25, 12, 2017);
    
    do {
		out.printf("dias = %s = %s\n", natal, natal.extenso());
		natal.seguinte();
		
	} while (natal != atual);
	
  }

}

