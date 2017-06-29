package algorithms.graphs.shortestpath;

import java.util.Arrays;
import java.util.List;

import algorithms.graphs.Edge;
import algorithms.graphs.Vertex;

public class FloydWarshall {
    
    public static int[][] apply(Vertex[] graph, List<Edge> edges) {
        int[][] distances = new int[graph.length][graph.length];
        
        for(int i = 1; i < graph.length; i++) {
            Arrays.fill(distances[i], 9999999);
        }
        
        for(Vertex vertex : graph) {
            if(vertex != null) {
                distances[vertex.getId()][vertex.getId()] = 0;
            }
        }
        
        for(Edge edge : edges) {
            Vertex u = edge.getSource();
            Vertex v = edge.getDestination();
            distances[u.getId()][v.getId()] = edge.getWeight();
        }
        
        for(int k = 1; k < graph.length; k++) {
            for(int i = 1; i < graph.length; i++) {
                for(int j = 1; j < graph.length; j++) {
                    int alternateDistance = distances[i][k] + distances[k][j];
                    if(distances[i][j] > alternateDistance) {
                        distances[i][j] = alternateDistance;
                    }
                }
            }
        }
        
        return distances;
    }
}
