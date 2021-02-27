import java.util.Comparator;

/**
 * implements a comparator of two Edges
 */
public class EdgeComparator implements Comparator<Edge> {

    /**
     * compares two edges by their weight
     * @param e1 the first edge
     * @param e2 the second edge
     * @return -1 if e1s weight is greater than e2s, 1 if the other way around, 0 if the weights are equal
     */
    @Override
    public int compare(Edge e1, Edge e2) {
        return e1.getWeight().compareTo(e2.getWeight());
    }
}
