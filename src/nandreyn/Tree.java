package nandreyn;

import java.util.List;
import java.util.ArrayList;

class Node {
    Node leftChild;
    Node rightChild;
    Node parent;
    int value;

    Node(int n) {
        value = n;
        leftChild = null;
        rightChild = null;
        parent = null;
    }

    int getChildrenNumber() {
        if (leftChild != null && rightChild != null)
            return 2;
        if (leftChild == null && rightChild == null)
            return 0;
        return 1;
    }
}

public class Tree {
    private Node root;

    public Tree() {
        root = null;
    }

    public void add(int val) {
        if (root == null) {
            root = new Node(val);
        } else {
            Node rootCopy = root;

            while (true) {

                if (val <= rootCopy.value) {
                    if (rootCopy.leftChild == null) {
                        rootCopy.leftChild = new Node(val);

                        rootCopy.leftChild.parent = rootCopy;
                        return;
                    }
                    rootCopy = rootCopy.leftChild;
                } else {
                    if (rootCopy.rightChild == null) {
                        rootCopy.rightChild = new Node(val);
                        rootCopy.rightChild.parent = rootCopy;
                        return;
                    }
                    rootCopy = rootCopy.rightChild;
                }
            }
        }
    }

    private boolean contains(Node rt, int val) {
        if (rt == null)
            return false;

        return (rt.value == val) || contains(rt.leftChild, val) || contains(rt.rightChild, val);
    }

    public boolean contains(int val) {
        return contains(root, val);
    }

    public void print() {
        int maxLevels = maxLevels(root);
        List<List<Node>> levelsData = new ArrayList<>(maxLevels);

        for (int level = 0; level < maxLevels; level++) {
            levelsData.add(getLevel(level));
            printLevel(levelsData.get(level), level, maxLevels);
        }
        System.out.print("");
    }

    private List<Node> getLevel(int level) {
        int i = 1;
        List<Node> queue = new ArrayList<>();
        queue.add(root);

        while (i <= level) {
            List<Node> toPush = new ArrayList<>();
            while (!queue.isEmpty()) {
                Node currentNode = queue.remove(0);
                if (currentNode != null) {
                    toPush.add(currentNode.leftChild);
                    toPush.add(currentNode.rightChild);
                } else {
                    toPush.add(null);
                    toPush.add(null);
                }
            }
            queue.clear();
            for (Node node : toPush)
                queue.add(node);

            i++;
        }
        return queue;
    }

    private void printLevel(List<Node> nodes, int level, int maxLevels) {
        int diff = maxLevels - level;
        int spacesBetweenNodes = (int) Math.pow(2, diff + 1) - 1;
        int spacesFront = (int) Math.pow(2, diff) - 1;

        printWhitespaces(spacesFront -1 );
        for (Node node : nodes) {
            if (node != null)
                System.out.print(Integer.toString(node.value));
            else
                printWhitespaces(1);
            printWhitespaces(spacesBetweenNodes );
        }

        System.out.println();
        int edgeLines = (int) Math.pow(2, (Math.max(diff - 1, 0)));
        for (int i = 1; i <= edgeLines; i++) {
            for (Node node : nodes) {
                printWhitespaces(spacesFront - i);
                if (node == null) {
                    printWhitespaces(edgeLines + edgeLines + i + 1);
                    continue;
                }

                if (node.leftChild != null)
                    System.out.print("/");
                else
                    printWhitespaces(1);

                printWhitespaces(i + i - 1);

                if (node.rightChild != null)
                    System.out.print("\\");
                else
                    printWhitespaces(1);

                printWhitespaces(edgeLines + edgeLines - i);
            }

            System.out.println("");
        }
    }


    private void printWhitespaces(int count) {
        for (int i = 0; i < count; i++) {
            System.out.print(" ");
        }
    }

    private int maxLevels(Node rt) {
        if (rt == null) {
            return 0;
        }
        return Math.max(maxLevels(rt.leftChild), maxLevels(rt.rightChild)) + 1;
    }

    private Node find(Node rt, int val) {
        if (rt.value == val)
            return rt;

        Node target = null;

        if (rt.leftChild != null)
            target = find(rt.leftChild, val);

        if (target != null)
            return target;

        if (rt.rightChild != null)
            target = find(rt.rightChild, val);

        return target;
    }

    public void remove(int val) {
        if (!contains(val)) {
            return;
        }

        Node target = find(root, val);
        Node parent = target.parent;

        boolean isTargetLeftChild = (parent.leftChild == target);

        if (target.getChildrenNumber() == 0) {
            target.parent = null;

            if (isTargetLeftChild)
                parent.leftChild = null;
            else
                parent.rightChild = null;
            return;
        }

        if (target.getChildrenNumber() == 1) {
            Node toPaste = (target.leftChild != null) ? target.leftChild : target.rightChild;
            toPaste.parent = parent;
            if (isTargetLeftChild)
                parent.leftChild = toPaste;
            else
                parent.rightChild = toPaste;

            return;
        }

        Node copy = target.rightChild;
        while (copy.leftChild != null)
            copy = copy.leftChild;

        copy.parent.leftChild = null;
        target.value = copy.value;
    }

    public void rootLeftRight() {
        rootLeftRight(root);
        System.out.println("");
    }

    public void rootLeftRight(Node root) {
        if (root == null)
            return;
        System.out.print(root.value + " ");
        rootLeftRight(root.leftChild);
        rootLeftRight(root.rightChild);
    }

    public void leftRightRoot() {
        leftRightRoot(root);
        System.out.println("");
    }

    public void leftRightRoot(Node root) {
        if (root == null)
            return;
        leftRightRoot(root.leftChild);
        leftRightRoot(root.rightChild);
        System.out.print(root.value + " ");
    }

    public void leftRootRight() {
        leftRootRight(root);
        System.out.println("");
    }

    public void leftRootRight(Node root) {
        if (root == null)
            return;
        leftRootRight(root.leftChild);
        System.out.print(root.value + " ");
        leftRootRight(root.rightChild);
    }
}
