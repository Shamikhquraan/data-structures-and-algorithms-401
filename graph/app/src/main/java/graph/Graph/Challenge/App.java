package graph.Graph.Challenge;
public class App {
    public String getGreeting() {
        return "Hello World!";
    }

    public static void main(String[] args) {
        Graph graph = new Graph();
        graph.addVertex("A");
        graph.addVertex("B");
        graph.addVertex("C");
        graph.addVertex("D");
        graph.addVertex("E");
        graph.addVertex("F");
        graph.addVertex("G");
        graph.addVertex("H");

        graph.addEdge("A","D");
        graph.addEdge("A","B");
        graph.addEdge("B","D");
        graph.addEdge("B","C");
        graph.addEdge("C","G");
        graph.addEdge("D","F");
        graph.addEdge("D","H");
        graph.addEdge("D","E");
        graph.addEdge("F","H");

        System.out.println(graph.dft("A").toString());

        Graph graph1 = new Graph();
Node n1 =new Node("Metroville");
        graph1.addVertex("Pandora");
        graph1.addVertex((String) n1.data);
        graph1.addVertex("Monstroplolis");
        graph1.addVertex("Narnia");
        graph1.addVertex("Naboo");

        DepthGraph.depthFirstSearch(n1);
    }
}
