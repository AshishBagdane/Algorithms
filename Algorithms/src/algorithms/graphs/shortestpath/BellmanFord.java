package algorithms.graphs.shortestpath;

import java.util.List;

import algorithms.graphs.Edge;
import algorithms.graphs.Vertex;

public class BellmanFord {
    
    public static void apply(Vertex[] graph, List<Edge> edges, Vertex source) {
        
        source.setDistance(0);
        
        for(Vertex vertex : graph) {
            if(vertex != source) {
                vertex.setDistance(Integer.MAX_VALUE);
                vertex.setParent(null);
            }
        }
        
        for(int i = 1; i < graph.length - 1; i++) {
            for(Edge edge : edges) {
                Vertex u = edge.getSource();
                Vertex v = edge.getDestination();
                int alternateDistance = u.getDistance() + edge.getWeight();
                if(alternateDistance < v.getDistance()) {
                    v.setDistance(alternateDistance);
                    v.setParent(u);
                }
            }
        }
        
        for(Edge edge : edges) {
            Vertex u = edge.getSource();
            Vertex v = edge.getDestination();
            if(u.getDistance() + edge.getWeight() < v.getDistance()) {
                System.err.println("Graph contains a negative-weight cycle");
            }
        }
        
    }
}
