package graph;

public class Edge {
    private int fromIndex;
    private int toIndex;
    private int distance;

    public Edge(int fromIndex, int toIndex, int distance) {
        this.fromIndex = fromIndex;
        this.toIndex = toIndex;
        this.distance = distance;
    }

    public int getFromIndex() {
        return fromIndex;
    }

    public void setFromIndex(int fromIndex) {
        this.fromIndex = fromIndex;
    }

    public int getToIndex() {
        return toIndex;
    }

    public void setToIndex(int toIndex) {
        this.toIndex = toIndex;
    }

    public int getDistance() {
        return distance;
    }

    public void setDistance(int distance) {
        this.distance = distance;
    }
}
