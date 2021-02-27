import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;

public class Main {

    /**
     * runs the program
     * @param args the program receives one argument, which is a text file describing the graphs structure
     *             using a neighbors list.
     */
    public static void main(String[] args){
        try {
            if (args.length != 1){
                throw new IOException();
            }
            GraphBuilder graphBuilder = new GraphBuilder(args[0]);
            graphBuilder.readDescription();
            ArrayList<Edge> edges = graphBuilder.getEdges();
            HashMap<Vertex, ArrayList<Vertex>> neighborsList = graphBuilder.getNeighborsList();
            minimumSpanningTree MSP = Kruskal.kruskal(edges, neighborsList);
//            ArrayList<Vertex> path = DFS.dfs(MSP, MSP.getEdges().get(0).getV1(),
//                    new ArrayList<Vertex>());
//            pathToString(path);
        }
        catch (IOException e){
            System.out.println(e);
        }
    }

    /**
     * Presents a visualisation of the returned solution
     * @param path the returned solution to present
     */
    private static void pathToString(ArrayList<Vertex> path){

    }
}
