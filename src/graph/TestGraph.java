package graph;

public class TestGraph {
    public static void main(String[] args) {
        Graph g = new Graph();

        g.addNode(new Node("a")); // index 0
        g.addNode(new Node("b"));
        g.addNode(new Node("c"));
        g.addNode(new Node("d"));
        g.addNode(new Node("f")); // index 4

        g.addEdge(new Edge(0, 1, 4));
        g.addEdge(new Edge(0, 4, 5));
        g.addEdge(new Edge(0, 3, 7));
        g.addEdge(new Edge(4, 3, 6));
        g.addEdge(new Edge(1, 2, 2));
        g.addEdge(new Edge(1, 3, 3));

        //g.printAdjacencyList(g.getAdjacencyList());
        //System.out.println(g.getIncidenceMatrixString(g.getIncidenceMatrix()));
        //g.dijkstra(g.getAdjacencyList(), 1, 4);

        Graph test = new Graph();

        test.addNode(new Node("a")); // 0
        test.addNode(new Node("b")); // 1
        test.addNode(new Node("c")); // 2
        test.addNode(new Node("d")); // 3
        test.addNode(new Node("e")); // 4

        test.addEdge(new Edge(0, 1, 6));
        test.addEdge(new Edge(0, 3, 1));
        test.addEdge(new Edge(1, 3, 2));
        test.addEdge(new Edge(3, 4, 1));
        test.addEdge(new Edge(1, 4, 2));
        test.addEdge(new Edge(4, 2, 5));
        test.addEdge(new Edge(1, 2, 5));

        //test.printAdjacencyList(test.getAdjacencyList());
        test.dijkstra(test.getAdjacencyList(), 1, 2);

    }
}