package main;

import java.util.ArrayList;
import java.util.List;

import bfs.BFS;
import dfs.DFS;
import entity.Cidade;
import entity.Vertice;

public class Main {

	public static void main(String[] args) {
		BFS bfs = new BFS();
		DFS dfs = new DFS();
		
		Vertice v1 = new Vertice(new Cidade(1));
		Vertice v2 = new Vertice(new Cidade(2));
		Vertice v3 = new Vertice(new Cidade(3));
		Vertice v4 = new Vertice(new Cidade(4));
		Vertice v5 = new Vertice(new Cidade(5));
		
		v1.adicionarVizinho(v2);
		v1.adicionarVizinho(v4);
		v4.adicionarVizinho(v5);
		v2.adicionarVizinho(v3);
		
		bfs.bfs(v1);
		
		/****/
		List<Vertice> lista = new ArrayList<Vertice>();
		lista.add(v1);
		lista.add(v2);
		lista.add(v3);
		lista.add(v4);
		lista.add(v5);
		
		dfs.dfs(lista);
	}
}
