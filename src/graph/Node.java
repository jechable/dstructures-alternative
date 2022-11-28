package graph;

public class Node {
    private String name;

    public Node(String name) {
        this.name = name;
    }

    public Node(String name, int weight) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

}
