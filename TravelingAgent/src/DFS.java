import java.util.ArrayList;
import java.util.HashMap;

/**
 * implements a recursive version of the DFS algorithm for going over all of the edges in a graph
 */
public class DFS {

    /**
     * goes over the vertices in the graph, starting from src
     * @param MSP the given minimum spanning tree to search
     * @param src the vertex in which the searching starts
     * @param finalPath the returned path of vertices
     * @return the final path of vertices
     */
    public static ArrayList<Vertex> dfs(minimumSpanningTree MSP, Vertex src, ArrayList<Vertex> finalPath){
        src.setVisited(true);
        finalPath.add(src);
        for (Vertex neighbor: MSP.getNeighborsList().get(src)){
            if (!neighbor.isVisited()){
                    dfs(MSP, neighbor, finalPath);
            }
        }
        return finalPath;
    }
}
