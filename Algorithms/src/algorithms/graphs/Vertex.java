package algorithms.graphs;

import java.util.TreeSet;

public class Vertex implements Comparable<Vertex>{
    
    private byte color;
    private int distance;
    private Vertex parent;
    private int id;
    private int weight;
    private TreeSet<Vertex> adjacentVertices = new TreeSet<>();

    public Vertex() {
    }

    public Vertex(byte color, int distance, Vertex parent, int id, int weight) {
        this.color = color;
        this.distance = distance;
        this.parent = parent;
        this.id = id;
        this.weight = weight;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public byte getColor() {
        return color;
    }

    public void setColor(byte color) {
        this.color = color;
    }

    public int getDistance() {
        return distance;
    }

    public void setDistance(int distance) {
        this.distance = distance;
    }

    public Vertex getParent() {
        return parent;
    }

    public void setParent(Vertex parent) {
        this.parent = parent;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public TreeSet<Vertex> getAdjacentVertices() {
        return adjacentVertices;
    }

    public void setAdjacentVertices(TreeSet<Vertex> adjacentVertices) {
        this.adjacentVertices = adjacentVertices;
    }

    @Override
    public int compareTo(Vertex that) {
        return this.getId() - that.getId();
    }
    
}
