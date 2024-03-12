import java.util.*;

public class aula_01_exc_1_4 {
	static Scanner sc = new Scanner (System.in);
	
	public static void main (String args[]) {
		String sentence;
		char s;
		
		do {
			int cont = 0;
			
			System.out.print("Linha? ");
			
			sentence = sc.nextLine();
			
			char a[] = new char [sentence.length()];
			
			for (int i = 0; i < sentence.length(); i++) {
				s = sentence.charAt(i);
				
				if (s == 'r' || s == 'R') {
					cont++;
				}
				
				else if (s == 'l') {
					a[i-cont] = 'u';
				}
				
				else if (s == 'L') {
					a[i-cont] = 'U';
				}
				
				else {
					a[i-cont] = sentence.charAt(i);
				}	
			}
			
			for (int i = 0; i < sentence.length(); i++) {
				System.out.printf("%c", a[i]);
			}
			
			System.out.println();
			
		} while (true);
	}
}

