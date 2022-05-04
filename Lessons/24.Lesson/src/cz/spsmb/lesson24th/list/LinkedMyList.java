package cz.spsmb.lesson24th.list;

public class LinkedMyList implements MyList {

    private Node root;

    @Override
    public void add(int item) {
        if(root == null) {
            root = new Node();
            root.setValue(item);
        } else {
            Node nextNode = new Node();
            nextNode.setValue(item);
            root.setNextNode(nextNode);
        }
    }

    @Override
    public void remove(int index) {

    }

    @Override
    public int get(int index) {
        return 0;
    }

    @Override
    public void replace(int index, int newValue) {

    }

    @Override
    public int size() {
        return 0;
    }

    @Override
    public String toString() {
        return "LinkedMyList{" +
                "node=" + root +
                '}';
    }

    private class Node {

        private int value;
        private Node nextNode;

        public int getValue() {
            return value;
        }

        public void setValue(int value) {
            this.value = value;
        }

        public Node getNextNode() {
            return nextNode;
        }

        public void setNextNode(Node nextNode) {
            this.nextNode = nextNode;
        }

        @Override
        public String toString() {
            return "Node{" +
                    "value=" + value +
                    ", nextNode=" + nextNode +
                    '}';
        }
    }
}
