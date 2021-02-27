import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;

public class BFS {

    /**
     * looks if there's a path from the source vertex to the dest vertex in the graph, by performing the
     * BFS algorithm and returning true once the dest vertex is found
     * @param src the source vertex
     * @param dest the dest vertex
     * @param graph the graph
     * @return true iff there's a path between the source and the dest
     */
    public static boolean bfs(Vertex src, Vertex dest, HashMap<Vertex,
            ArrayList<Vertex>> neighborsList){
        if (neighborsList == null){
            return true;
        }
        LinkedList<Vertex> Q = new LinkedList<Vertex>();
        Q.push(src);
        src.setVisited();
        while (!Q.isEmpty()){
            Vertex v = Q.pop();
            for (Vertex neighbors: neighborsList.get(v)){
                if (neighbors.equals(dest)){
                    return true;
                }
                if (!neighbors.isVisited()){
                    Q.push(neighbors);
                    neighbors.setVisited();
                }
            }
        }
        return false;
    }
}

