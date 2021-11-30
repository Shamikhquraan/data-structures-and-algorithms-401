package graph;
import java.util.HashSet;
public class BusinessTrip<T> {
   public HashSet<Node<T>> vertices;

    public BusinessTrip(Graph<String> graphNew, String[] citys2) {
        return;
    }

    public static <T> String businessTrip(Graph graph, String[] cities) {
        int cost = 0;
        if (cities.length <= 1){
            return null;
        }
        for(int i = 0 ; i < cities.length -1; i++) {
            Node sourceNode = graph.getNode(cities[i]);
            Node destNode = graph.getNode(cities[i+1]);
            Edge edge = getEdge(sourceNode, destNode);
            if ( edge == null)
                return "False, $0";
            cost += edge.weight;
        }
        return "True, $"+cost;
    }

    public Node getNode(T value) {
        Node arr[] = new Node[vertices.size()];
        int n=0;
        for(Node ele:vertices){
            arr[n++] = ele;
        }
        for(int i = 0 ; i < arr.length -1; i++) {
            if (arr[i].data == value) {
                return arr[i];
            }
        }
        return null;
    }
    private static Edge getEdge(Node sourceNode, Node destNode) {
        boolean indexOfEdge = isThereDirectFlightbetweenTheCity(sourceNode, destNode);
        if(indexOfEdge == false)
            return null;
        else {
            Edge[] arr =  toArray(sourceNode.neighbors);
            for(int i = 0 ; i <= arr.length -1; i++) {
                if (arr[i].node == destNode) {
                    return arr[i];
                }
            }
            return null;
        }
    }

    private static boolean isThereDirectFlightbetweenTheCity(Node sourceNode, Node destNode) {
        Edge[] arr =  toArray(sourceNode.neighbors);
        for(int i = 0 ; i <= arr.length -1; i++) {
            if (arr[i].node == destNode) {
                return true;
            }
        }
        return false;
    }

    public static Edge[] toArray(HashSet h) {
        Edge arr[] = new Edge[h.size()];
        int n=0;
        for(Object ele : h){
            arr[n++] = (Edge) ele;
        }
        return arr;
    }
}
