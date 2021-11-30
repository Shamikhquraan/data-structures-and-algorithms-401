package graph.Graph.Challenge;
import graph.LinkedList.LinkedList;
import graph.QueueLinkedList.QueueLinkedList;
import graph.StackLinkedList.StackLinkedList;
import java.util.*;
public class Graph {
    private final Map<Vertex<String> , List<Vertex<String>>> adjVertices ;
    private Map<Vertex<String>, Map<Vertex<String>, Integer>> weightedAdjVertices ;
    private int size ;

    public Graph(){
        this.adjVertices = new HashMap<>();
        this.weightedAdjVertices = new HashMap<Vertex<String>, Map<Vertex<String>, Integer>>();
    }
    public Vertex<String> addVertex(String data){
        Vertex<String> vertex = new Vertex<>(data);
        //if the vertex doesn't exist then add it
        this.adjVertices.putIfAbsent(vertex , new ArrayList<>());
//        this.weightedAdjVertices.putIfAbsent(vertex , new HashMap<>());
        return vertex ;
    }

    public void addEdge(String vertexData1 , String vertexData2 ){
        Vertex<String> vertex1 = new Vertex<>(vertexData1);
        Vertex<String> vertex2 = new Vertex<>(vertexData2);
        //make sure that the two vertex exists , to create an edge between them
        if (this.adjVertices.containsKey(vertex1) && this.adjVertices.containsKey(vertex2)) {
            //get vertex1 key then add vertex2 to its array list
            this.adjVertices.get(vertex1).add(vertex2);
            //get vertex2 key then add vertex1 to its array list
            this.adjVertices.get(vertex2).add(vertex1);
        }
    }

    public void addWeightedEdge(String vertexData1 , String vertexData2 , Integer weight){
        Vertex<String> vertex1 = new Vertex<>(vertexData1);
        Vertex<String> vertex2 = new Vertex<>(vertexData2);
        //make sure that the two vertex exists , to create an edge between them
        if (this.adjVertices.containsKey(vertex1) && this.adjVertices.containsKey(vertex2)) {
            this.weightedAdjVertices.putIfAbsent(vertex1 , new HashMap<Vertex<String>, Integer>());
            this.weightedAdjVertices.putIfAbsent(vertex2 , new HashMap<Vertex<String>, Integer>());
            //get vertex1 key then add vertex2 to its array list
            this.weightedAdjVertices.get(vertex1).put(vertex2 , weight);
            //get vertex2 key then add vertex1 to its array list
            this.weightedAdjVertices.get(vertex2).put(vertex1 , weight);
        }
    }

    public Vertex<String> removeVertex(String vertexData){
        Vertex<String> removedVertex = new Vertex<>(vertexData);
        //remove the vertex with its list from the graph
        this.adjVertices.remove(removedVertex);
        //remove the edge between the vertex and any other vertex
        this.adjVertices.values().forEach(list -> list.remove(removedVertex));
        return removedVertex ;
    }

    public void removeEdge(String vertexData1 , String vertexData2){
        Vertex<String> vertex1 = new Vertex<>(vertexData1);
        Vertex<String> vertex2 = new Vertex<>(vertexData2);
        //make sure that the two vertex exists , to create an edge between them
        if (this.adjVertices.containsKey(vertex1) && this.adjVertices.containsKey(vertex2)) {
            //get vertex1 key then remove vertex2 from its array list
            this.adjVertices.get(vertex1).remove(vertex2);
            //get vertex1 key then remove vertex2 from its array list
            this.adjVertices.get(vertex2).remove(vertex1);
        }
    }

    public List<Vertex<String>> getAdjVertices(String vertexData){
        Vertex<String> vertex = new Vertex<>(vertexData);
        return adjVertices.get(vertex);
    }

    public Map<Vertex<String>, Map<Vertex<String>, Integer>> getWeightedAdjVertices() {
        return weightedAdjVertices;
    }

    public LinkedList<String> bft(String root){
        if (!adjVertices.containsKey(new Vertex<>(root))) return null ;
        LinkedList<String> visited = new LinkedList<String>();
        QueueLinkedList<String> queue = new QueueLinkedList<String>();
        queue.enqueue(root);
        visited.append(root);

        while (!queue.isEmpty()){
            String dequeuedVertex = queue.dequeue();
            for (Vertex<String> vertex : getAdjVertices(dequeuedVertex)){
                if (!visited.includes(vertex.getData())){
                    queue.enqueue(vertex.getData());
                    visited.append(vertex.getData());
                }
            }
        }

        return visited ;
    }

    public LinkedList<String> dft(String root){
        if (!adjVertices.containsKey(new Vertex<>(root))) return null ;
        LinkedList<String> visited = new LinkedList<String>();
        StackLinkedList<String> stack = new StackLinkedList<String>();

        stack.push(root);

        while (!stack.isEmpty()){
            String poppedVertex = stack.pop();
            if (!visited.includes(poppedVertex)) {
                visited.append(poppedVertex);
                for (Vertex<String> vertex : getAdjVertices(poppedVertex)) {
                    stack.push(vertex.getData());
                }
            }
        }
        return visited ;
    }

    public List<Vertex<String>> getNeighbors(String vertexData){
        Vertex<String> vertex = new Vertex<>(vertexData);
        return  adjVertices.get(vertex);
    }

    public int getSize() {
        return adjVertices.size();
    }

    @Override
    public String toString() {
        return "Graph{" +
                "adjVertices=" + adjVertices.toString() +
                '}';
    }

    public String getWeightedGraph(){
        return "Graph{" +
                "adjVertices=" + weightedAdjVertices.toString() +
                '}';
    }
}
