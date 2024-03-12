import java.util.*;

public class aula_01_exc_1_2 {
	static Scanner sc = new Scanner(System.in);
	
	public static void main (String args[]) {
		double PG1, PG2, TPI, EF, NF;
		
		System.out.print("PG1? ");
		PG1 = sc.nextDouble();
		
		System.out.print("PG1? ");
		PG2 = sc.nextDouble();
		
		System.out.print("TPI? ");
		TPI = sc.nextDouble();
		
		System.out.print("EF? ");
		EF = sc.nextDouble();
		
		NF = 0.2 * TPI + 0.15 * PG1 + 0.15 * PG2 + 0.5 * EF;
		
		System.out.printf("NF = %.1f\n", NF);
		
		aprovation(NF);
	}
	
	static void aprovation (double NF) {
		String s;
		
		if (NF >= 9.5) { s = "APROVADO!"; }
		
		else s = "REPROVADO!";
		
		System.out.print(s);
	}
}

