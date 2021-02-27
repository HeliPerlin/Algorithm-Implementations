import java.util.Comparator;

public class Vertex {
    public Integer value;
    private boolean visited;

    public Vertex(Integer value){
        this.value = value;
        visited = false;
    }

    public void setVisited(){
        visited = !visited;
    }

    public boolean isVisited(){
        return visited;
    }

    public boolean equals(Vertex v) {
        return v.value.equals(this.value);
    }
}
