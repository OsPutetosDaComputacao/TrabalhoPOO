package modelo;

public class Reclamacao {
	int id;
	String textoReclamacao;
	TipoProblema tipoProblema;
	boolean status;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getTextoReclamacao() {
		return textoReclamacao;
	}
	public void setTextoReclamacao(String textoReclamacao) {
		this.textoReclamacao = textoReclamacao;
	}
	public TipoProblema getTipoProblema() {
		return tipoProblema;
	}
	public void setTipoProblema(TipoProblema tipoProblema) {
		this.tipoProblema = tipoProblema;
	}
	public boolean isStatus() {
		return status;
	}
	public void setStatus(boolean status) {
		this.status = status;
	}
}
