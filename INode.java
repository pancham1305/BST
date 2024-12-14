interface INode<T extends Comparable<T>> {
    T getKey();

    INode<T> getLeft();

    INode<T> getRight();

    void setLeft(INode<T> left);

    void setRight(INode<T> right);
}
