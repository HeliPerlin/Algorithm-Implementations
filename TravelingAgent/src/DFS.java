import java.util.ArrayList;
import java.util.HashMap;

public class DFS {

    public static ArrayList<Vertex> dfs(minimumSpanningTree MSP, Vertex src, ArrayList<Vertex> finalPath){
        src.setVisited();
        for (Vertex neighbor: MSP.getNeighborsList().get(src)){
            if (!neighbor.isVisited()){
                finalPath.add(neighbor);
                dfs(MSP, neighbor, finalPath);
            }
        }
        return finalPath;
    }
}
