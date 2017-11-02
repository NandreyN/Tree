package nandreyn;

public class Main {

    public static void main(String[] args) {
        Tree binaryTree = new Tree();
        binaryTree.add(10);
        binaryTree.add(2);
        binaryTree.add(12);
        binaryTree.add(-2);
        binaryTree.add(11);
        binaryTree.add(40);
        binaryTree.add(5);
        binaryTree.add(9);
        binaryTree.add(16);
        binaryTree.add(25);
        binaryTree.print();
        System.out.println(binaryTree.contains(12));
        System.out.print("Left-Root-Right : ");
        binaryTree.leftRootRight();

        System.out.print("Left-Right-Root: ");
        binaryTree.leftRightRoot();

        System.out.print("Root-Left-Right : ");
        binaryTree.rootLeftRight();
    }
}
