public class BinarySearchTree<T extends Comparable<T>> {
    private INode<T> root;

    public BinarySearchTree() {
        root = null;
    }

    public void insert(T key) {
        root = insertRec(root, key);
    }

    private INode<T> insertRec(INode<T> root, T key) {

        if (root == null) {
            return new BinaryNode<>(key);
        }

        if (key.compareTo(root.getKey()) < 0) {
            root.setLeft(insertRec(root.getLeft(), key));
        } else if (key.compareTo(root.getKey()) > 0) {
            root.setRight(insertRec(root.getRight(), key));
        }

        return root;
    }

    public void inorderTraversal() {
        inorderRec(root);
    }

    private void inorderRec(INode<T> root) {
        if (root != null) {
            inorderRec(root.getLeft());
            System.out.print(root.getKey() + " ");
            inorderRec(root.getRight());
        }
    }

    public int size() {
        return sizeRec(root);
    }

    private int sizeRec(INode<T> root) {
        if (root == null) {
            return 0;
        }
        return 1 + sizeRec(root.getLeft()) + sizeRec(root.getRight());
    }

    public int height() {
        return heightRec(root);
    }

    private int heightRec(INode<T> root) {
        if (root == null) {
            return 0;
        }
        return 1 + Math.max(heightRec(root.getLeft()), heightRec(root.getRight()));
    }
}
