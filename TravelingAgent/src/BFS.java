import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;

/**
 * implements the BFS algorithm for paths-searching in a graph
 */
public class BFS {

    /**
     * looks if there's a path from the source vertex to the dest vertex in the graph, by performing the
     * BFS algorithm and returning true once the dest vertex is found
     * @param src the source vertex
     * @param dest the dest vertex
     * @return true iff there's a path between the source and the dest
     */
    public static boolean bfs(Vertex src, Vertex dest, HashMap<Vertex,
            ArrayList<Vertex>> neighborsList){
        if (neighborsList == null){
            return true;
        }
        LinkedList<Vertex> Q = new LinkedList<Vertex>();
        Q.push(src);
        src.setVisited(true);
        while (!Q.isEmpty()){
            Vertex v = Q.pop();
            if (neighborsList.get(v) == null){
                continue;
            }
            for (Vertex neighbors: neighborsList.get(v)){
                if (neighbors.equals(dest)){
                    resetVisit(neighborsList);
                    return true;
                }
                if (!neighbors.isVisited()){
                    Q.push(neighbors);
                    neighbors.setVisited(true);
                }
            }
        }
        resetVisit(neighborsList);
        return false;
    }

    /*
     * sets all of the vertices as not visited
     */
    private static void resetVisit(HashMap<Vertex, ArrayList<Vertex>> neighborsList){
        for (Vertex v: neighborsList.keySet()){
            v.setVisited(false);
        }
    }
}

