package cz.spsmb.lesson26th.dijkster;

import java.util.LinkedList;
import java.util.List;

public abstract class AbstractDijkstra {

    public void run(Node startNode) {
        LinkedList<Node> currentNodes = new LinkedList<>();
        currentNodes.push(startNode);
        startNode.setValue(0);
        while (!currentNodes.isEmpty()) {
            Node currentNode = currentNodes.pop();
            List<Node> neighbours = findAllNeighbours(currentNode);
            currentNodes.addAll(neighbours);
            for (Node node : neighbours) {
                Edge edge = findEdge(node, currentNode);
                int totalSize = currentNode.getValue() + edge.getValue();
                if (node.getValue() > totalSize) {
                    node.setValue(totalSize);
                }
            }
            currentNode.markUsed();
        }
    }

    protected abstract Edge findEdge(Node node, Node currentNode);

    protected abstract List<Node> findAllNeighbours(Node startNode);

    private class Edge {
        private int value;

        public int getValue() {
            return value;
        }

        public void setValue(int value) {
            this.value = value;
        }
    }

    private class Node {

        private int value;

        public int getValue() {
            return 0;
        }

        public void setValue(int totalSize) {
        }

        public void markUsed() {

        }
    }
}
