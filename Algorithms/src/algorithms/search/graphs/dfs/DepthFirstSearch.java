package algorithms.search.graphs.dfs;

import java.util.Stack;

import algorithms.graphs.Vertex;

public class DepthFirstSearch {
    
    public void applyRecursive(Vertex[] graph, Vertex source) {
        source.setColor((byte) 1);
        for(Vertex adjacentVertex : source.getAdjacentVertices()) {
            if(adjacentVertex.getColor() != 1) {
                apply(graph, adjacentVertex);
            }
        }
    }
    
    public void apply(Vertex[] graph, Vertex source) {
        Stack<Vertex> vertices = new Stack<>();
        source.setColor((byte) 0);
        vertices.push(source);
        while(!vertices.isEmpty()) {
            Vertex u = vertices.pop();
            if(u.getColor() != 1) {
                u.setColor((byte) 1);
                for(Vertex v : u.getAdjacentVertices()) {
                    vertices.push(v);
                }
            }
        }
    }
}
