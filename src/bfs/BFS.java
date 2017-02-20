package bfs;

import java.util.LinkedList;
import java.util.Queue;

import entity.Vertice;

public class BFS {

	public void bfs(Vertice vertice){
		Queue<Vertice> fila = new LinkedList<Vertice>();
		
		vertice.setVisitado(true);
		fila.add(vertice);
		
		while (! fila.isEmpty()) {
			Vertice verticeAtual = fila.remove();
			System.out.println(verticeAtual+" ");
			
			for(Vertice v: verticeAtual.getVizinhanca()){
				if(!v.isVisitado()){
					v.setVisitado(true);
					fila.add(v);
				}
			}
		}
	}
}
