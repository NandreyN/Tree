package nandreyn;

public class Main {

    public static void main(String[] args) {
        Tree<CustomInt> binaryTree = new Tree<>();
        binaryTree.add(new CustomInt(10));
        binaryTree.add(new CustomInt(2));
        binaryTree.add(new CustomInt(12));
        binaryTree.add(new CustomInt(-2));
        binaryTree.add(new CustomInt(11));
        binaryTree.add(new CustomInt(40));
        binaryTree.add(new CustomInt(5));
        binaryTree.add(new CustomInt(9));
        binaryTree.add(new CustomInt(16));
        binaryTree.add(new CustomInt(25));
        binaryTree.print();
        binaryTree.remove(new CustomInt(12));
        binaryTree.remove(new CustomInt(9));
        binaryTree.remove(new CustomInt(40));
        binaryTree.print();
        System.out.println(binaryTree.contains(new CustomInt(10)));
        System.out.print("Left-Root-Right : ");
        binaryTree.leftRootRight();

        System.out.print("Left-Right-Root: ");
        binaryTree.leftRightRoot();

        System.out.print("Root-Left-Right : ");
        binaryTree.rootLeftRight();

    }
}
