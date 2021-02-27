import java.util.ArrayList;
import java.util.HashMap;

/**
 * represents a minimum spanning tree
 */
public class minimumSpanningTree {

    /*
    holds all of the edges in the graph
     */
    private final ArrayList<Edge> edges;

    /*
    holds the neighbors' list in the graph
     */
    private final HashMap<Vertex, ArrayList<Vertex>> neighborsList;

    /**
     * constructs a new MSP
     * @param edges all of the MSPs edges
     * @param newNeighborsList the MSPs neighborsList
     */
    public minimumSpanningTree(ArrayList<Edge> edges, HashMap<Vertex, ArrayList<Vertex>> newNeighborsList){
        this.edges = edges;
        this.neighborsList = newNeighborsList;
    }

    /**
     * @return the graphs edges
     */
    public ArrayList<Edge> getEdges(){
        return this.edges;
    }

    /**
     * @return the graphs neighbors list
     */
    public HashMap<Vertex, ArrayList<Vertex>> getNeighborsList(){
        return this.neighborsList;
    }

}
