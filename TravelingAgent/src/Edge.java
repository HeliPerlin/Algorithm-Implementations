/**
 * represents a single edge in a graph, containing of two vertices and weight function
 */
public class Edge {

    /*
    represents the first vertex
     */
    private Vertex v1;

    /*
    represents the first vertex
     */
    private Vertex v2;

    /*
    the weight of the graph
     */
    private Integer weight;

    /**
     * constructs a new edge
     * @param v1 the first vertex
     * @param v2 the second vertex
     * @param weight the weight of the edge
     */
    public Edge(Vertex v1, Vertex v2, Integer weight){
        this.v1 = v1;
        this.v2 = v2;
        this.weight = weight;
    }

    /**
     * @return first vertex
     */
    public Vertex getV1(){
        return v1;
    }

    /**
     * @return second vertex
     */
    public Vertex getV2(){
        return v2;
    }

    /**
     * @return the weight of the edge
     */
    public Integer getWeight(){
        return this.weight;
    }
}
