package modelo;

import java.util.ArrayList;

public class Conta {
	int id;
	String descricao;
	ArrayList<Talao> taloes;
	ArrayList<Reclamacao> reclamacoes;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getDescricao() {
		return descricao;
	}
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	public ArrayList<Talao> getTaloes() {
		return taloes;
	}
	public void setTaloes(ArrayList<Talao> taloes) {
		this.taloes = taloes;
	}
	
}
