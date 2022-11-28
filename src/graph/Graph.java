package graph;
import java.util.*;

public class Graph {
    private List<Node> nodes;
    private List<Edge> edges;
    private List<List<List<Integer>>> adjacencyList;
    private int[][] incidenceMatrix;

    public Graph() {
        this.nodes = new ArrayList<>();
        this.edges = new ArrayList<>();
        this.adjacencyList = new ArrayList<>();
    }

    public void addNode(Node node) {
        this.nodes.add(node);
    }

    public void addEdge(Edge edge) {
        this.edges.add(edge);
        this.edges.add(new Edge(edge.getToIndex(), edge.getFromIndex(), edge.getDistance()));
    }

    public List<Edge> getEdges() {
        return edges;
    }

    public List<Node> getNodes() {
        return nodes;
    }

    public List<List<List<Integer>>> getAdjacencyList() {
        for (int i = 0; i < nodes.size(); i++) {
            adjacencyList.add(i, new ArrayList<>());
            for (int j = 0; j < edges.size(); j++) {
                if (edges.get(j).getFromIndex() == i) {
                    adjacencyList.get(i).add(new ArrayList<>(Arrays.asList(edges.get(j).getToIndex(), edges.get(j).getDistance())));
                }
            }
        }
        return adjacencyList;
    }

    public void printAdjacencyList(List<List<List<Integer>>> adjacencyList) {
        for (int i = 0; i < adjacencyList.size(); i++) {
            System.out.printf(nodes.get(i).getName() + " -> ");
            for (int j = 0; j < adjacencyList.get(i).size(); j++) {
                if (!(j == adjacencyList.get(i).size() - 1)) {
                    System.out.printf(nodes.get(adjacencyList.get(i).get(j).get(0)).getName() + " (" + adjacencyList.get(i).get(j).get(1) + (") -> "));
                } else {
                    System.out.printf(nodes.get(adjacencyList.get(i).get(j).get(0)).getName() + " (" + adjacencyList.get(i).get(j).get(1) + (")"));
                }
            }
            System.out.println();
        }
    }

    public int[][] getIncidenceMatrix() {
        incidenceMatrix = new int[nodes.size()][edges.size()];

        for (int i = 0; i < nodes.size(); i++) {
            for (int j = 0; j < edges.size(); j++) {
                incidenceMatrix[i][j] = 0;
            }
        }

        for (int i = 0; i < edges.size(); i++) {
            int from = edges.get(i).getFromIndex();
            int to = edges.get(i).getToIndex();
            incidenceMatrix[from][i] = 1;
            incidenceMatrix[to][i] = -1;
        }
        return incidenceMatrix;
    }
    
    public String getIncidenceMatrixString(int[][] incidenceMatrix) {
        return Arrays.deepToString(incidenceMatrix).replace("], ", "]\n").replace("[[", "[").replace("]]", "]");
    }

    public void dijkstra(List<List<List<Integer>>> adjacencyList, int source, int destination) {
        List<Integer> shortestDistance = new ArrayList<>();
        Vector<Integer> unvisited = new Vector<>();
        List<Integer> previous = new ArrayList<>();
        List<Integer> nearestNeighbor = new ArrayList<>(Arrays.asList(0, Integer.MAX_VALUE));
        int position;

        for (int i = 0; i < adjacencyList.size(); i++) {
            shortestDistance.add(i, Integer.MAX_VALUE);
            unvisited.add(i);
            previous.add(i, 0);
        }

        shortestDistance.set(source, 0);
        position = source;


        for (int j = 0; j < adjacencyList.size() - 1; j++) {
            for (int i = 0; i < adjacencyList.get(position).size(); i++) {
                int indexOfNeighbor = adjacencyList.get(position).get(i).get(0);
                int distanceToNeighbor = adjacencyList.get(position).get(i).get(1);
                if (unvisited.contains(indexOfNeighbor)) {
                    if (shortestDistance.get(indexOfNeighbor) > shortestDistance.get(position) + distanceToNeighbor) {
                        shortestDistance.set(indexOfNeighbor, shortestDistance.get(position) + distanceToNeighbor);
                        previous.set(indexOfNeighbor, position);
                    }
                    if (shortestDistance.get(indexOfNeighbor) < nearestNeighbor.get(1)) {
                        nearestNeighbor.set(0, indexOfNeighbor);
                        nearestNeighbor.set(1, shortestDistance.get(indexOfNeighbor));
                    }
                }
            }
            unvisited.removeElement(position);
            position = nearestNeighbor.get(0);
            System.out.println(shortestDistance);
            System.out.println(previous);
            System.out.println("next  " + position);
            System.out.println("Unvisited:  " + unvisited);

        }
    }

}
