import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;

public class Kruskal {

    /**
     * implementation of the kruskal algorithm for finding a minimum spanning tree in a graph
     * @param graph the graph to find a minimum spanning tree in
     * @return a minimum spanning tree
     */
    public static minimumSpanningTree kruskal(ArrayList<Edge> graph,
                                          HashMap<Vertex, ArrayList<Vertex>> neighborsList){
        ArrayList<Edge> edges = new ArrayList<Edge>();
        HashMap<Vertex, ArrayList<Vertex>> newNeighborsList = new HashMap<>();
        graph.sort(new EdgeComparator());
        for (Edge e: graph){
            if (!isTherePath(e, graph, neighborsList)){
                edges.add(e);
                updateNeighborsList(newNeighborsList, e);
            }
        }
        return new minimumSpanningTree(edges, newNeighborsList);
    }

    /**
     * checks if there is a path between the two vertices e contains
     * @param e the edge to check its vertices
     * @param graph the graph in which to look for a path between the two vertices
     * @return true iff theres a path between the two vertices in the graph
     */
    private static boolean isTherePath(Edge e, ArrayList<Edge> graph,
                                       HashMap<Vertex, ArrayList<Vertex>> neighborsList){
        return BFS.bfs(e.getV1(), e.getV2(), graph, neighborsList);
    }

    private static HashMap<Vertex, ArrayList<Vertex>>  updateNeighborsList(HashMap<Vertex,
            ArrayList<Vertex>> neighborsList, Edge e){
        if (neighborsList.containsKey(e.getV1())){
            neighborsList.get(e.getV1()).add(e.getV2());
            return neighborsList;
        }
        ArrayList<Vertex> neighbors = new ArrayList<Vertex>();
        neighbors.add(e.getV2());
        neighborsList.put(e.getV1(), neighbors);
        return neighborsList;
    }
}
