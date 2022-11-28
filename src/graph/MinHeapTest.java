package graph;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.PriorityQueue;

public class MinHeapTest {
    public static void main(String[] args) {
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        List<Integer> addition = new ArrayList<>(Arrays.asList(3, 5, 2, 120));

        pq.add(1);
        pq.add(3);
        pq.add(4);
        pq.add(0);

        System.out.println(pq);

    }
}
