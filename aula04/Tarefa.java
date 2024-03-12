public class Tarefa {
	
	private Data datai = new Data();
	private Data dataf = new Data();
	private String mensagem;
	
	public Tarefa(Data um, Data dois, String texto) {
		assert 1==dois.compareTo(um): "A data inicial é maior que a final!";
		assert texto!="": "O texto não pode ser vazio!";
		Data datai = um;
		Data dataf = dois;
		mensagem = texto;
	}
	
	public Data fim() {
		return dataf;
	}
	
	public Data inicio() {
		return datai;
	}
	
	public String texto() {
		return mensagem;
	}
	
	public String toString() {
		return (datai.toString() + " | " + dataf.toString() + " -> " + mensagem);
	}
}
