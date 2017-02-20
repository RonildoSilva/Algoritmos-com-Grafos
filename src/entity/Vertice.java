package entity;

import java.util.ArrayList;
import java.util.List;

public class Vertice {

	private Cidade dado;
	private boolean visitado;
	private List<Vertice> vizinhanca;
	
	public Vertice(Cidade dado) {
		this.dado = dado;
		this.vizinhanca = new ArrayList<>();
	}
	
	public Cidade getDado() {
		return dado;
	}



	public void setDado(Cidade dado) {
		this.dado = dado;
	}



	public boolean isVisitado() {
		return visitado;
	}



	public void setVisitado(boolean visitado) {
		this.visitado = visitado;
	}



	public List<Vertice> getVizinhanca() {
		return vizinhanca;
	}

	public void setVizinhanca(List<Vertice> vizinhos) {
		this.vizinhanca = vizinhos;
	}

	public void adicionarVizinho(Vertice vertice){
		this.vizinhanca.add(vertice);
	}
	
	@Override
	public String toString() {
		return String.valueOf(this.dado);
	}
}
