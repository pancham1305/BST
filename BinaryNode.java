public class BinaryNode<T extends Comparable<T>> implements INode<T> {
    private T key;
    private INode<T> left;
    private INode<T> right;

    public BinaryNode(T key) {
        this.key = key;
        this.left = null;
        this.right = null;
    }

    @Override
    public T getKey() {
        return key;
    }

    @Override
    public INode<T> getLeft() {
        return left;
    }

    @Override
    public INode<T> getRight() {
        return right;
    }

    @Override
    public void setLeft(INode<T> left) {
        this.left = left;
    }

    @Override
    public void setRight(INode<T> right) {
        this.right = right;
    }
}
