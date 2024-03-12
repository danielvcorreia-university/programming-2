import static java.lang.System.*;
import java.util.Calendar;

public class Data {
  private int dia, mes, ano;

  /** Inicia esta data com o dia de hoje. */
  public Data() {
    Calendar today = Calendar.getInstance();

    dia = today.get(Calendar.DAY_OF_MONTH);
    mes = today.get(Calendar.MONTH) + 1;
    ano = today.get(Calendar.YEAR);
  }

  /** Inicia a data a partir do dia, mes e ano dados. */
  public Data(int dia, int mes, int ano) {
	this.dia = dia;
	this.mes = mes;
	this.ano = ano;
  }
  
  public Data(String alo) {
	  String[] parts = alo.split("-");
	  
	  if (parts.length != 3) {
		  out.println("O formato da data está incorreto");
		  exit(0);
	  }
	  
	  else {
		 ano = Integer.parseInt(parts[0]);
		 mes = Integer.parseInt(parts[1]);
		 dia = Integer.parseInt(parts[2]);
	  }
	  
  }

  /** Devolve esta data segundo a norma ISO 8601. */
  public String toString() {
    return String.format("%04d-%02d-%02d", ano, mes, dia);
  }

  /** Indica se ano é bissexto. */
  public static boolean bissexto(int ano) {
    return ano%4 == 0 && ano%100 != 0 || ano%400 == 0;
  }

    public int dia() {
		return dia;
	}
	
	public int mes() {
		return mes;
	}
	
	public int ano() {
		return ano;
	}

  /** Dimensões dos meses num ano comum. */
  private static final
  int[] diasMesComum = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};

  /** Devolve o número de dias do mês dado. */
  public static int diasDoMes(int mes, int ano) {
	if (bissexto(ano) && mes == 2) {
			int fevbi = 29;
			return fevbi;
	}
	 
    return diasMesComum[mes-1];
  }

  private static final
  String mesExtenso[] = {"janeiro", "fevereiro", "março", "abril", "maio", "junho", "julho", "agosto", "setembro", "outubro", "novembro", "dezembro"};
	
  /** Devolve o mes da data por extenso. */
  public String mesExtenso() {
    return mesExtenso[mes-1];
  }


  /** Devolve esta data por extenso. */
  public String extenso() {
    String Slav = dia + " de " + mesExtenso[mes-1] + " de " + ano;
	
    return Slav;
  }

  /** Indica se um terno (dia, mes, ano) forma uma data válida. */
  public static boolean dataValida(int dia, int mes, int ano) {
    boolean ruski = true;
	
	if (ano < 0 || mes < 1 || mes > 12) {
		ruski = false;
	}
	
	if (dia > diasDoMes(mes, ano) || dia < 1) {
		ruski = false;
	}
	
    return ruski;
  }


  public void seguinte() {
	if (dia != diasDoMes(mes, ano)) {
		dia = dia+1;
		return;
	}
	
	if (dia == diasDoMes(mes, ano) && mes == 12) {
		dia = 1;
		mes = 1;
		ano = ano+1;
		return;
	}
	 
    if (dia == diasDoMes(mes, ano)) {
		dia = 1;
		mes = mes+1;
		return;
	}
	
  }
  
  public int compareTo (Data y) {
	  if (ano > y.ano) {
		  return 1;
	  }
	  
	  else if (ano < y.ano) {
		  return -1;
	  }
	  
	  else if (ano == y.ano) {
		  if (mes > y.mes) {
			  return 1;
		  } 
		  
		  else if (mes < y.mes) {
			  return -1;
		  }
		  
		  else if (mes == y.mes) {
			  if (dia > y.dia) {
				  return 1;
			  }
			  
			  else if (dia < y.dia) {
				  return -1;
			  }
			  
			  else if (dia == dia) {
				  return 0;
			  }
		  }		     
	  }	
	  
	  return 0;  
  }
}

