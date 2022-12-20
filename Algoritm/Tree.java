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
        this. left = left;
        this. right = right;

    public List<Integer> preorderTraversal(Tree root) {
        ArrayList<Integer> ans = new ArrayList<>();

        if (root == null)
            return ans;

        ArrayDeque<Tree> stack = new ArrayDeque<>();
        stack.push(root);

        while (!stack.isEmpty()) {
            Tree cur = stack.pop();
            ans.add(cur.val);
            if (cur.right != null) {
                stack.push(cur.right);
            }
            if (cur.left != null) {
                stack.push(cur.left);
            }
        }
        return ans;
    }
}
