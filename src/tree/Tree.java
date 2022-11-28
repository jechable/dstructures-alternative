package tree;

public class Tree {
    Node root;

    public Tree() {
        this.root = null;
    }

    public Node getRoot() {
        return root;
    }
    public Node insert(Node position, int value) {
        if (position == null) {
            return new Node(value);
        }
        if (value < position.getValue()) {
            position.setLeft(insert(position.getLeft(), value));
        } else if (value > position.getValue()) {
            position.setRight(insert(position.getRight(), value));
        } else return position;
        return position;
    }

    public void add(int value) {
        this.root = insert(this.root, value);
    }

    public void inorder(Node node) {
        if (node != null) {
            inorder(node.getLeft());
            System.out.println(" " + node.getValue());
            inorder(node.getRight());
        }
    }

    public void preorder(Node node) {
        if (node != null) {
            System.out.println(" " + node.getValue());
            preorder(node.getLeft());
            preorder(node.getRight());
        }
    }

    public void postorder(Node node) {
        if (node != null) {
            postorder(node.getLeft());
            postorder(node.getRight());
            System.out.println(" " + node.getValue());
        }
    }

}
