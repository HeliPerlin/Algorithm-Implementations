import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashMap;

/**
 * implements a vertex in the graph
 */
public class Vertex {

    /**
     * the numeric value of the vertex
     */
    public Integer value;

    /*
    indicates whether the vertex was visited for some algorithms
     */
    private boolean visited;

    /**
     * constructs a new vertex
     * @param value the numeric value of the vertex
     */
    public Vertex(Integer value){
        this.value = value;
        visited = false;
    }

    /**
     * sets the visited field to the given boolean value
     * @param b the boolean value to set to
     */
    public void setVisited(boolean b){
        visited = b;
    }

    /**
     * @return true iff the vertex is visited
     */
    public boolean isVisited(){
        return visited;
    }

    /**
     * compares two vertices by their values
     * @param v the vertex to compare to
     * @return true iff the vertices are equal by their values
     */
    public boolean equals(Vertex v) {
        return v.value.equals(this.value);
    }

    /**
     * looks for a vertex with the same value, and returns it if exists in the vertices ArrayList
     * @param neighborsList the neighbors list to look in
     * @return the matching vertex if found, null if not found
     */
    public Vertex findVertexOfValue(ArrayList<Vertex> neighborsList){
        for (Vertex v: neighborsList){
            if (v.equals(this)){
                return v;
            }
        }
        return null;
    }
}
