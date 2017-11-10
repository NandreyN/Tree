package nandreyn;

public class Main {
    public static void test1() {
        Tree<Integer> binaryTree = new Tree<>();
        binaryTree.add(10);
        binaryTree.add(2);
        binaryTree.add(15);
        binaryTree.add(-2);
        binaryTree.add(11);
        binaryTree.add(40);
        binaryTree.add(5);
        binaryTree.add(9);
        binaryTree.add(35);
        binaryTree.add(37);
        binaryTree.add(13);
        binaryTree.print();
        binaryTree.remove(15);

        binaryTree.print();
        System.out.println(binaryTree.contains(10));
        System.out.print("Left-Root-Right : ");
        binaryTree.leftRootRight();

        System.out.print("Left-Right-Root: ");
        binaryTree.leftRightRoot();

        System.out.print("Root-Left-Right : ");
        binaryTree.rootLeftRight();
    }

    public static void test2() {
        Tree<Integer> binaryTree2 = new Tree<>();
        binaryTree2.add(8);
        binaryTree2.add(6);
        binaryTree2.add(11);
        binaryTree2.add(-5);
        binaryTree2.add(-8);
        binaryTree2.add(-11);
        binaryTree2.add(13);
        binaryTree2.add(17);
        binaryTree2.add(1);
        binaryTree2.add(2);
        binaryTree2.add(10);
        binaryTree2.add(7);
        binaryTree2.print();
        System.out.print("Left-Root-Right : ");
        binaryTree2.leftRootRight();

        System.out.print("Left-Right-Root: ");
        binaryTree2.leftRightRoot();

        System.out.print("Root-Left-Right : ");
        binaryTree2.rootLeftRight();

    }

    public static void test3() {
        printAlphabet();
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

    public static void printSeparator(int testNumber)
    {
        System.out.printf("==================================<TEST#%s>==================================\n",String.valueOf(testNumber));
    }

    public static void printAlphabet()
    {
        System.out.println();
        for (char c = 'a'; c != 'z'; c++)
        {
            System.out.print(String.valueOf(c) + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        printSeparator(1);
        test1();
        printSeparator(2);
        test2();
        printSeparator(3);
        test3();
    }
}
