import static java.lang.System.*;
import java.util.Scanner;
import java.io.*;
import p2utils.*;

public class CityTraveler {
	
	public static void main (String[] args) throws IOException{
		LinkedList<String> lst = new LinkedList<String>();
		
		//Verificação dos argumentos fornecidos pelo utilizador
		for (int i = 0; i < args.length; i++) {
			File f = new File(args[i]);
			if (f.isDirectory() || !f.exists() || !f.isFile()) {
				out.print("ERROR in file \"" + args[i] + "\": read failure!");
				exit(1);
			}
		}
		
		//copiar ficheiro para uma LinkedList
		File f = new File(args[0]);
		Scanner scf = new Scanner(f);
		while (scf.hasNextLine()) {
			lst.addFirst(scf.nextLine());
			scf.nextLine();
		}
		
		Node show = lst.firstNode();
		
		for (int i = 0; i < lst.size(); i++) {
			
		}
	}
}

