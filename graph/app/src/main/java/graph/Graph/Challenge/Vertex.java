package graph.Graph.Challenge;
import java.util.Objects;

public class Vertex<String> {
    private String data ;
    public Vertex(String data){
        this.data = data ;
    }
    public String getData() {
        return data;
    }
    public void setData(String data) {
        this.data = data;
    }
    @Override
    public java.lang.String toString() {
        return "Vertex{" +
                "data=" + data + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Vertex vertex = (Vertex) o;
        return Objects.equals(data, vertex.data);
    }

    @Override
    public int hashCode() {
        return Objects.hash(data);
    }
}
