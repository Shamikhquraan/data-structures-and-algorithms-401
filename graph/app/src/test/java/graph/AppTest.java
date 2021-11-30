package graph;
import org.junit.jupiter.api.Test;
import java.util.HashSet;
import java.util.LinkedList;
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

    @Test
    public void breadthFirstTest(){
        Graph newGraph = new Graph();
        Node shamikh = newGraph.addNode("shamikh");
        Node ahmad = newGraph.addNode("ahmad");
        Node aya = newGraph.addNode("aya");
        shamikh.addNeighbor(ahmad, 60);
        shamikh.addNeighbor(aya, 55);
        LinkedList<Node> nList = new LinkedList<>();
        nList.add(shamikh);
        nList.add(ahmad);
        nList.add(aya);
        assertEquals( nList, newGraph.breadthFirstSearch(shamikh));
    }


    @Test
    public void businessTrpGraphMoreThanTowParamet(){
    Graph <String> graphNew= new Graph();
        graphNew.addNode("Amman");
        graphNew.addNode("Zarqa");
        graphNew.addNode("Aqba");
        graphNew.addNode("Maldiv");
        graphNew.addNode("Korea");
        graphNew.addNode("Iran");
        graphNew.addEDdgeNewG("Amman","swailh",50);
        graphNew.addEDdgeNewG("Zarqa","capCity",82);
        graphNew.addEDdgeNewG("Irbid","Taybah",99);
        graphNew.addEDdgeNewG("Salt","BalQa",42);
        graphNew.addEDdgeNewG("Jaresh","Sarw",37);

        graphNew.addEDdgeNewG("Maldiv","Korea",26);
        graphNew.addEDdgeNewG("Korea","Iran",105);
        graphNew.addEDdgeNewG("Korea","Iran",105);
        graphNew.addEDdgeNewG("Monstroplolis","Naboo",73);
        graphNew.addEDdgeNewG("Narnia","Naboo",70);

    Node  Amman =  graphNew.getNode("Amman");
    Node  Salt =  graphNew.getNode("Salt");
    Node Jaresh =  graphNew.getNode("Jaresh");
    Node  Ajloun =  graphNew.getNode("Ajloun");

    String[] placeOne = {"Istanbul", "Egge"};
    String[] placeTow={"Amman", "Meat"};
}}
