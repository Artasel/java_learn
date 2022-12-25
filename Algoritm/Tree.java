package Algoritm;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.List;

public class Tree {

    int val;
    Tree left;
    Tree right;

    Tree() {}

    Tree(int val) { this.val = val; }

    Tree(int val, Tree left, Tree right) {
        this.val = val;
        this.left = left;
        this.right = right;
    }

    public static List<Integer> preorderTraversal(Tree root) {
        ArrayList<Integer> ans = new ArrayList<>();

        if (root == null) {
            return ans;
        }

        ArrayDeque<Tree> stack = new ArrayDeque<>();
        stack.push(root);

        while (!stack.isEmpty()) {
            Tree cur = stack.pop();
            System.out.println(stack);
            
            ans.add(cur.val);
            System.out.println(cur.val);
            if (cur.right != null) {
                stack.push(cur.right);
            }
            if (cur.left != null) {
                stack.push(cur.left);
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        List<Integer> ans = new ArrayList<>();
        Tree tree = new Tree();
        tree = new Tree(1);

        tree.left = new Tree(2);
        tree.left.left = new Tree(3);
        tree.left.right = new Tree(4);
        
        tree.right = new Tree(2);
        tree.right.right = new Tree(3);
        tree.right.left = new Tree(4);
        
        ans = preorderTraversal(tree);
        System.out.println(ans);
    }
}
