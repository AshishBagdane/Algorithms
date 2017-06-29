package algorithms.search.graphs.bfs;

import java.util.ArrayDeque;
import java.util.Queue;

import algorithms.graphs.Vertex;

public class BreadthFirstSearch {
    
    public static void apply(Vertex[] graph, Vertex source) {
        for(Vertex vertex : graph) {
            if(vertex != source && vertex != null) {
                vertex.setColor((byte)0);
                vertex.setDistance(-1);
                vertex.setParent(null);
            }
        }
        Queue<Vertex> vertices = new ArrayDeque<>();
        source.setColor((byte)1);
        source.setDistance(0);
        source.setParent(null);
        vertices.add(source);
        while(!vertices.isEmpty()) {
            Vertex u = vertices.poll();
            for(Vertex v : u.getAdjacentVertices()) {
                if(v.getColor() == 0) {
                    v.setColor((byte)1);
                    v.setDistance(u.getDistance() + 1);
                    v.setParent(u);
                    vertices.offer(v);
                }
            }
            u.setColor((byte)2);
        }
    }
    
    public static void printPath(Vertex[] graph, Vertex source, Vertex sink) {
        if(sink.getParent()==null) {
            return;
        }
        if(source == sink) {
            System.out.println(source.getId());
        }else{
            System.out.println(sink.getId());
            printPath(graph, source, sink.getParent());
        }
    }
}
