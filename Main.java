public class Main {

    public static void main(String[] args) {
        BinarySearchTree<Integer> bst = new BinarySearchTree<>();

        // Insert nodes to create the tree shown in the image
        bst.insert(56);
        bst.insert(30);
        bst.insert(70);
        bst.insert(22);
        bst.insert(40);
        bst.insert(11);
        bst.insert(3);
        bst.insert(16);
        bst.insert(60);
        bst.insert(95);
        bst.insert(65);
        bst.insert(63);
        bst.insert(67);

        // Display the in-order traversal of the tree
        System.out.println("In-order traversal of the BST:");
        bst.inorderTraversal();

        // Check the size of the tree
        System.out.println("\nSize of the BST: " + bst.size());

        // Height of the tree
        System.out.println("Height of the BST: " + bst.height());

        // Search for a value in the tree
        int searchKey = 63;
        System.out.println("Search for " + searchKey + ": " + (bst.search(searchKey) ? "Found" : "Not Found"));
    }
}