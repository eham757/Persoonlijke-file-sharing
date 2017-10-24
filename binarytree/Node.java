package nl.hhs.dsal.week7.binarytree;


public class Node<T extends Comparable> {

    private T data;

    private Node left;
    private Node right;

    public Node(T data) {
        this.data = data;
    }

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }

    public Node getLeft() {
        return left;
    }

    public void setLeft(Node left) {
        this.left = left;
    }

    public Node getRight() {
        return right;
    }

    public void setRight(Node right) {
        this.right = right;
    }

    public boolean oneChild(){
        return (left == null) ^ (right == null);
    }

    public boolean isLeaf(){
        return left==null && right==null;
    }

    @Override
    public String toString() {
        return "Node{" +
                "data=" + data +
                '}';
    }
}

