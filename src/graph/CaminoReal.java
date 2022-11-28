package graph;

public class CaminoReal {
    public static void main(String[] args) {
        Graph g = new Graph();

        g.addNode(new Node("Calkiní")); // index 0
        g.addNode(new Node("Dzitbalché"));
        g.addNode(new Node("Tepakán"));
        g.addNode(new Node("Bécal"));
        g.addNode(new Node("Halachó"));
        g.addNode(new Node("Maxcanú")); // index 5

        g.addEdge(new Edge(0, 1, 5));
        g.addEdge(new Edge(0, 2, 3));
        g.addEdge(new Edge(0, 3, 6));
        g.addEdge(new Edge(0, 5, 12));
        g.addEdge(new Edge(2, 3, 3));
        g.addEdge(new Edge(3, 4, 10));
        g.addEdge(new Edge(4, 5, 15));

        g.printAdjacencyList(g.getAdjacencyList());
        System.out.println(g.getIncidenceMatrixString(g.getIncidenceMatrix()));
    }
}
