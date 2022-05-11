package cz.spsmb.lesson25th.tree;

public class BinaryTree {

    private Node root;

    public void add(int value) {
        if(root == null) {
            root = new Node();
            root.setValue(value);
        } else {
            int currentValue = root.getValue();
            if(currentValue > value) {
                if(root.getLeftNode() == null) {
                    Node node = new Node();
                    node.setValue(value);
                    root.setLeftNode(node);
                } else {
                    add(root.getLeftNode(), value);
                }
            } else {
                if(root.getRightNode() == null) {
                    Node node = new Node();
                    node.setValue(value);
                    root.setRightNode(node);
                } else {
                    add(root.getRightNode(), value);
                }
            }
        }
    }

    private void add(Node node, int value) {

    }

    public void print() {

    }
}
