package binaryTrees;

public class Main {
    public static void main(String[] args) {
        // BinaryTree tree = new BinaryTree();
        // Scanner scanner = new Scanner(System.in);
        // tree.populate(scanner);
        // tree.display();
        int[] nums = { 1, 2, 3, 4, 5 };

        BST bst = new BST();
        bst.populateSorted(nums, 0, nums.length);
        bst.display();
    }
}
