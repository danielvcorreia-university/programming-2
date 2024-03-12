import java.io.*;
import java.util.Scanner;
import static java.lang.System.*;

public class CopyFile {
	
	static Scanner sc = new Scanner(System.in);
	
	public static void main (String args[]) throws IOException {
		String line;
		String s;
		char a = 'a';
		
		File original = new File(args[0]);
		File copy = new File(args[1]);
		
		if (!original.exists() && !original.isDirectory()) {
			out.println("Original File dosn't exists");
			exit(1);
		}
		
		if (copy.exists() && !copy.isDirectory()) {
			do {
				System.out.println("O nome do ficheiro para onde pretendo copiar o ficheiro original já existe! Pertende reescrever o seu conteúdo? [Y/N] ");
				s = sc.nextLine();
				a = s.charAt(0);
			} while (a != 'y' && a != 'Y' && a != 'n' && a != 'N' );
			
			if (a == 'Y' || a == 'y') {
				Scanner sc = new Scanner(original);
				
				PrintWriter TrindasMinas = new PrintWriter(args[1]);
				
				while (sc.hasNextLine()) {
					line = sc.nextLine();
					TrindasMinas.println(line);
					
				}
				
				TrindasMinas.close();
				sc.close();
				exit(1);
			}
			
			else if (a == 'N' || a == 'n') {
			exit(1);
			}
		}
		
			Scanner sc = new Scanner(original);
			
			PrintWriter TrindasMinas = new PrintWriter(args[1]);
			
			while (sc.hasNextLine()) {
				line = sc.nextLine();
				TrindasMinas.println(line);
				
			}
			
			TrindasMinas.close();
			sc.close();
			
	}
}


