import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.*;

/**
 * Builds a graph, represented as a table of neighbors out of a given input file.
 */
public class GraphBuilder {

    /*
    the input file which contains the instructions to building the graph.
     */
    private final FileReader graphDescriptionReader;

    /*
    the HashMap representing the edges in the graph
     */
    private final ArrayList<Edge> edges;

    /*
    the HashSet representing the vertices in the graph
     */
    private final HashMap<Vertex, ArrayList<Vertex>> neighborsList;

    /**
     * Constructs a new GraphBuilder object
     * @param filePath a text file containing any number of lines, each line contains two numbers
     *                         separated with a single space. Each two numbers represent a directed (from
     *                         left to right) edge in the graph. The graph cannot have a vertex that is not
     *                         connected to any other vertex. Input can be assumed as valid.
     * @throws FileNotFoundException in case of a problem with opening the input file.
     */
    public GraphBuilder(String filePath) throws FileNotFoundException {
        this.edges = new ArrayList<Edge>();
        this.neighborsList = new HashMap<Vertex, ArrayList<Vertex>>();
        this.graphDescriptionReader = new FileReader(filePath);
    }

    /**
     * Goes over the description file and saves the information
     */
    public void readDescription(){
        Scanner scanner = new Scanner(this.graphDescriptionReader);
        if (!(scanner.hasNextLine())){ // If scanner is empty, return
            return;
        }
        while(scanner.hasNextLine()) {
            String line = scanner.nextLine();
            Integer[] edgeData = processLine(line);
            Vertex[] vertices = new Vertex[] {new Vertex(edgeData[0]), new Vertex(edgeData[1])};
            updateEdges(vertices, edgeData[2]);
            updateNeighborsList(vertices);
        }
    }

    /*
    goes over a single line of two vertices and saves them as Integers
     */
    private Integer[] processLine(String line){
        String[] stringVertices = line.split(" ");
        int v1 = Integer.parseInt(stringVertices[0]);
        int v2 = Integer.parseInt(stringVertices[1]);
        int weight = Integer.parseInt(stringVertices[2]);
        return new Integer[] {v1, v2, weight};
    }

    /*
    updates the data structure representing the edges with a new edge
     */
    private void updateEdges(Vertex[] vertices, Integer weight){
        edges.add(new Edge(vertices[0], vertices[1], weight));
    }

    /*
    updates the data structure representing the vertices with a new vertex
     */
    private void updateNeighborsList(Vertex[] vertices){
        if (neighborsList.containsKey(vertices[0])){
            neighborsList.get(vertices[0]).add(vertices[1]);
            return;
        }
        ArrayList<Vertex> neighbors = new ArrayList<Vertex>();
        neighbors.add(vertices[1]);
        neighborsList.put(vertices[0], neighbors);
    }

    /**
     * @return the vertices of the graph
     */
    public HashMap<Vertex, ArrayList<Vertex>> getNeighborsList(){
        return this.neighborsList;
    }

    /**
     * @return the neighbors list of the graph
     */
    public ArrayList<Edge> getEdges(){
        return this.edges;
    }
}
