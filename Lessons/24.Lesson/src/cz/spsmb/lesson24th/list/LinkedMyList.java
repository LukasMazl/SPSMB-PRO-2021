package cz.spsmb.lesson24th.list;

public class LinkedMyList<E> implements MyList<E> {

    private Node root;
    private int size;

    @Override
    public void add(E item) {
        size++;
        if(root == null) {
            root = new Node();
            root.setValue(item);
        } else {
            Node parent = root;
            while (parent.getNextNode() != null) {
                parent = parent.getNextNode();
            }
            Node node = new Node();
            node.setValue(item);
            parent.setNextNode(node);
        }
    }

    @Override
    public void remove(int index) {
        size--;
        if(index == 0 && this.root != null) {
            this.root = this.root.getNextNode();
        } else {
            Node parent = root;
            Node prevNode;
            int counter = 0;
            while (parent.getNextNode() != null) {
                prevNode = parent.getNextNode();
                parent = parent.getNextNode();
                counter++;
                if(counter == index) {
                    prevNode.setNextNode(parent.getNextNode());
                    parent.setNextNode(null);
                }
            }
        }
    }

    @Override
    public E get(int index) {
        if(index == 0 && this.root != null) {
            return root.getValue();
        } else {
            Node parent = root;
            int counter = 0;
            while (parent.getNextNode() != null) {
                parent = parent.getNextNode();
                counter++;
                if(counter == index) {
                    return parent.getValue();
                }
            }
        }
        throw new IndexOutOfBoundsException();
    }

    @Override
    public void replace(int index, E newValue) {
        if(index == 0 && this.root != null) {
            this.root.setValue(newValue);
        } else {
            Node parent = root;
            int counter = 0;
            while (parent.getNextNode() != null) {
                parent = parent.getNextNode();
                counter++;
                if(counter == index) {
                    parent.setValue(newValue);
                }
            }
        }
    }

    @Override
    public int size() {
        return size;
    }

    @Override
    public String toString() {
        return "LinkedMyList{" +
                "node=" + root +
                '}';
    }

    private class Node {

        private E value;
        private Node nextNode;

        public E getValue() {
            return value;
        }

        public void setValue(E value) {
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
