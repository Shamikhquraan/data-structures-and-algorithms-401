
package graph;

import org.junit.jupiter.api.Test;

import java.util.HashSet;

import static org.junit.jupiter.api.Assertions.*;

class AppTest {
    @Test
    public void addingNode() {
        Graph graph = new Graph();
        Node shamikh = graph.addNode("shamikh");
        Node ahmad = graph.addNode("ahmad");
        Node aya = graph.addNode("aya");
        Node walaa = graph.addNode("walaa");
        assertTrue( graph.getSize() == 4);
        assertTrue( graph.getNodes().contains(shamikh));
        assertTrue( graph.getNodes().contains(ahmad));
        assertTrue( graph.getNodes().contains(walaa));
        assertTrue( graph.getNodes().contains(aya));
    }

    @Test
    public void addEdge() {
        Graph edgeGraph = new Graph();
        Node one = edgeGraph.addNode("one");
        Node tow = edgeGraph.addNode("tow");
        Node three = edgeGraph.addNode("three");
        assertTrue( edgeGraph.addEdge(one, tow));
        assertTrue( edgeGraph.addEdge(one, three));
    }

    @Test
    public void zeroGraph(){
        Graph empty = new Graph();
        assertEquals( 0, empty.getSize());
    }
    @Test
    public void getNodes() {
        Graph graph = new Graph();
        Node shamikh = graph.addNode("shamikh");
        Node ahmad = graph.addNode("ahmad");
        Node aya = graph.addNode("aya");
        Node walaa = graph.addNode("walaa");
        HashSet<Node> otherNode = new HashSet<>();
        otherNode.add(shamikh);
        otherNode.add(ahmad);
        otherNode.add(aya);
        otherNode.add(walaa);
        assertTrue( graph.getNodes().equals(otherNode));
    }

    @Test
    public void noWeightAdding(){
        Graph newGraphV = new Graph();
        Node shamikh = newGraphV.addNode("shamikh");
        Node ahmad = newGraphV.addNode("ahmad");
        Node aya = newGraphV.addNode("aya");
        Node walaa = newGraphV.addNode("walaa");
        assertTrue(shamikh.addNeighbor(ahmad));
    }

    @Test
    public void withWeightAdding(){
        Graph newGraphVar = new Graph();
        Node shamikh = newGraphVar.addNode("shamikh");
        Node ahmad = newGraphVar.addNode("ahmad");
        Node aya = newGraphVar.addNode("aya");
        Node walaa = newGraphVar.addNode("walaa");
        assertTrue( shamikh.addNeighbor(ahmad, 70));
    }

    @Test
    public void getNeighbors() {
        Graph newGraphVar = new Graph();
        Node shamikh = newGraphVar.addNode("shamikh");
        Node ahmad = newGraphVar.addNode("ahmad");
        Node aya = newGraphVar.addNode("aya");
        shamikh.addNeighbor(ahmad);
        shamikh.addNeighbor(aya);
        HashSet expected = new HashSet<>();
        expected.add("ahmad");
        expected.add("aya");
        assertEquals(expected.size(), shamikh.neighbors.size());
    }


}
