package Graphs;

import java.util.Iterator;
import java.util.LinkedList;

public class DFSGraph {
private int V;
private LinkedList<Integer> adj[];

 DFSGraph(int v) {
	V = v;
	adj = new LinkedList[v];
	for(int i = 0 ; i < v ; i++)
		adj[i] = new  LinkedList();

}
void addEdge(int v ,int w) {
	adj[v].add(w);
}
	
	
	public static void main(String[] args) {
		DFSGraph g = new DFSGraph(4);
		 
        g.addEdge(0, 1);
        g.addEdge(0, 2);
        g.addEdge(1, 2);
        g.addEdge(2, 0);
        g.addEdge(2, 3);
        g.addEdge(3, 3);
 
        System.out.println("Following is Breadth First Traversal "+
                           "(starting from vertex 2)");
 
        g.DFS(2);
	}
	private void DFS(int s) {
		  boolean visited[] = new boolean[V];
		  
	        for (int i = 0; i < V; ++i)
	            if (visited[i] == false)
	                DFSUtil(i, visited);
		
	}
	private void DFSUtil(int v, boolean[] visited) {
        visited[v] = true;
        System.out.print(v + " ");
        Iterator<Integer> i = adj[v].listIterator(); 
        while(i.hasNext()) {
        	int n = i.next();
        	if(!visited[n])
        		DFSUtil(n, visited);
        }
	}

}
