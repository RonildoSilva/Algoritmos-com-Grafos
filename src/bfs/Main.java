package bfs;

public class Main {

	public static void main(String[] args) {
		BFS bfs = new BFS();
		
		Vertice v1 = new Vertice(new Dado(1));
		Vertice v2 = new Vertice(new Dado(2));
		Vertice v3 = new Vertice(new Dado(3));
		Vertice v4 = new Vertice(new Dado(4));
		Vertice v5 = new Vertice(new Dado(5));
		
		v1.adicionarVizinho(v2);
		v1.adicionarVizinho(v4);
		v4.adicionarVizinho(v5);
		v2.adicionarVizinho(v3);
		
		bfs.bfs(v1);
	}
}
