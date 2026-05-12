public class TreeMain {
    static class Node {
        int data;
        Node left;
        Node right;
        Node(int data) {
            this.data = data;
            left = null;
            right = null;
        }
    }
    Node root;
    void inOrder(Node node) {
        if (node == null) {
            return;
        }
        inOrder(node.left);
        System.out.print(node.data + " ");
        inOrder(node.right);
    }
    void preOrder(Node node) {
        if (node == null) {
            return;
        }
        System.out.print(node.data + " ");
        preOrder(node.left);
        preOrder(node.right);
    }
    void postOrder(Node node) {
        if (node == null) {
            return;
        }
        postOrder(node.left);
        postOrder(node.right);
        System.out.print(node.data + " ");
    }
    public static void main(String[] args) {
        TreeMain tree = new TreeMain();
        tree.root = new Node(1);
        tree.root.left = new Node(2);
        tree.root.right = new Node(3);
        tree.root.left.left = new Node(4);
        tree.root.left.right = new Node(5);
        System.out.println("Binary Tree:");
        System.out.println("        1");
        System.out.println("      /   \\");
        System.out.println("     2     3");
        System.out.println("    / \\");
        System.out.println("   4   5");
        System.out.println("\nIn-order Traversal:");
        tree.inOrder(tree.root);
        System.out.println("\n\nPre-order Traversal:");
        tree.preOrder(tree.root);
        System.out.println("\n\nPost-order Traversal:");
        tree.postOrder(tree.root);
        System.out.println("\n\nName: SYEDA WANIYA SAJJAD");
        System.out.println("Seat Number: EB25210006106");
    }
}