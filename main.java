public class main {

    public static void main(String[] args) {
        BinarySearchTree<Integer> bst = new BinarySearchTree<>();

        bst.insert(56);
        bst.insert(30);
        bst.insert(70);

        System.out.println("In-order traversal of the BST:");
        bst.inorderTraversal();
    }

}