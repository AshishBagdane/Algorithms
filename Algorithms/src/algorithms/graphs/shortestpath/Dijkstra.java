package algorithms.graphs.shortestpath;

import java.util.Comparator;
import java.util.PriorityQueue;

import algorithms.graphs.Vertex;

public class Dijkstra {
    
    public static void apply(Vertex[] graph, Vertex source, int[][] edgeWeight) {
        
        source.setDistance(0);
        
        PriorityQueue<Vertex> unvisitedVertices = new PriorityQueue<>(new Comparator<Vertex>() {
            @Override
            public int compare(Vertex t, Vertex t1) {
                return t.getDistance() - t1.getDistance();
            }
        });
        
        for(Vertex vertex : graph) {
            if(vertex != source) {
                vertex.setDistance(Integer.MAX_VALUE);
                vertex.setParent(null);
            }
            unvisitedVertices.offer(vertex);
        }
        
        while(!unvisitedVertices.isEmpty()) {
            Vertex u = unvisitedVertices.poll();
            for(Vertex v : u.getAdjacentVertices()) {
                int alternateDistance = v.getDistance() + edgeWeight[u.getId()][v.getId()];
                if(alternateDistance < v.getDistance()) {
                    unvisitedVertices.remove(v);
                    v.setDistance(alternateDistance);
                    v.setParent(u);
                    unvisitedVertices.offer(v);
                }
            }
        }
        
    }
}
