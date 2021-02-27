import java.util.ArrayList;
import java.util.HashMap;

public class minimumSpanningTree {

    ArrayList<Edge> edges;
    HashMap<Vertex, ArrayList<Vertex>> neighborsList;

    public minimumSpanningTree(ArrayList<Edge> edges, HashMap<Vertex, ArrayList<Vertex>> newNeighborsList){
        this.edges = edges;
        this.neighborsList = newNeighborsList;
    }

    public ArrayList<Edge> getEdges(){
        return this.edges;
    }

    public HashMap<Vertex, ArrayList<Vertex>> getNeighborsList(){
        return this.neighborsList;
    }

}
