package HomeJava4;

//Учитывая rootдвоичное дерево, проверьте, является ли оно зеркалом самого себя (т. Е. Симметричным вокруг его центра).

import java.util.ArrayDeque;

public class Tree {

    int val;
    Tree left;
    Tree right;

    Tree() {
    }

    Tree(int val) {
        this.val = val;
    }

    Tree(int val, Tree left, Tree right) {
        this.val = val;
        this.left = left;
        this.right = right;
    }

    public static Boolean preorderTraversal(Tree tree) {
        if (tree == null) {
            return true;
        }

        ArrayDeque<Tree> stack = new ArrayDeque<>();
        ArrayDeque<Tree> stack2 = new ArrayDeque<>();
        stack.push(tree);
        stack2.push(tree);

        while (!stack.isEmpty()) {
            Tree cur = stack.pop();
            Tree cur2 = stack2.pop();

            if (cur.left == null && cur2.right != null || cur2.right == null && cur.left != null) {
                return false;
            }

            if (cur.val != cur2.val) {
                return false;
            }

            if (cur.left != null) {
                stack.push(cur.left);
            }
            if (cur.right != null) {
                stack.push(cur.right);
            }

            if (cur2.right != null) {
                stack2.push(cur2.right);
            }
            if (cur2.left != null) {
                stack2.push(cur2.left);
            }
        }
        return true;
    }

    public static void main(String[] args) {          
        Tree tree = new Tree();
        // tree = new Tree(9);    // [9,-42,-42,76,76,13,13]

        // tree.left = new Tree(-42);
        // tree.left.right = new Tree(76);
        // tree.left.right.left = new Tree(76);

        // tree.right = new Tree(-42);
        // tree.right.right = new Tree(13);
        // tree.right.right.right = new Tree(13);

        tree = new Tree(1);    //  [1,2,2,3,4,4,3]

        tree.left = new Tree(2);
        tree.left.left = new Tree(3);
        tree.left.right = new Tree(4);
        
        tree.right = new Tree(2);
        tree.right.right = new Tree(3);
        tree.right.left = new Tree(4);

        boolean output = preorderTraversal(tree);
        System.out.println(output);
    }
}
