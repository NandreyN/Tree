package nandreyn;

public class Main {

    public static void main(String[] args) {
        Tree<Integer> binaryTree = new Tree<>();
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
        binaryTree.remove(12);
        binaryTree.remove(9);
        binaryTree.remove(40);
        binaryTree.print();
        System.out.println(binaryTree.contains(10));
        System.out.print("Left-Root-Right : ");
        binaryTree.leftRootRight();

        System.out.print("Left-Right-Root: ");
        binaryTree.leftRightRoot();

        System.out.print("Root-Left-Right : ");
        binaryTree.rootLeftRight();

        Tree<CharacterPair> charTree = new Tree<>();
        charTree.add(new CharacterPair("lf"));
        charTree.add(new CharacterPair("aa"));
        charTree.add(new CharacterPair("gf"));
        charTree.add(new CharacterPair("ad"));
        charTree.add(new CharacterPair("oo"));
        charTree.add(new CharacterPair("pl"));
        charTree.print();
        System.out.print("Left-Root-Right : ");
        charTree.leftRootRight();

        System.out.print("Left-Right-Root: ");
        charTree.leftRightRoot();

        System.out.print("Root-Left-Right : ");
        charTree.rootLeftRight();

        System.out.println(charTree.contains(new CharacterPair("pl")));
    }
}
