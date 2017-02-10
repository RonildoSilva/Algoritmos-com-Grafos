package dfs;

import java.util.List;
import java.util.Stack;

import bfs.Vertice;

public class DFS {
	private Stack<Vertice> pilha;
	
	public DFS() {
		this.pilha = new Stack<Vertice>();
	}
	
	public void dfs(List<Vertice> verticeVizinhanca){
		
		for(Vertice v: verticeVizinhanca){
			if(!v.isVisitado()){
				v.setVisitado(true);
				dfsComPilha(v);
			}
		}
		
	}

	private void dfsRecursivo(Vertice vertice) {
		System.out.println(vertice);
		for (Vertice v: vertice.getVizinhanca()) {
			if(!v.isVisitado()){
				v.setVisitado(true);
				dfsRecursivo(v);
			}
		}
	}
	
	private void dfsComPilha(Vertice vertice) {
		this.pilha.add(vertice);
		vertice.setVisitado(true);
		
		while(!pilha.isEmpty()){
			Vertice verticeAtual = this.pilha.pop();
			System.out.println(verticeAtual);
			for (Vertice v: vertice.getVizinhanca()) {
				if(!v.isVisitado()){
					v.setVisitado(true);
					this.pilha.push(v);
				}
			}
		}
	}
}
