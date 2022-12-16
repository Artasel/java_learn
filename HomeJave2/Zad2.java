package HomeJave2;

public class Zad2 {
    static Zad2 root;
    int key;
    Zad2 left, right;

    Zad2(int item) {
        key = item;
        left = right = null;
    }

    Zad2() {
        
    }

    static boolean isMirror(Zad2 node1, Zad2 node2) {
        if (node1 == null && node2 == null) {
            return true;
        }

        if (node1 != null && node2 != null && node1.key == node2.key) {
            return (isMirror(node1.left, node2.right) && isMirror(node1.right, node2.left));
        }

        return false;
        }

        static boolean isSymmetric(Zad2 qwe) {
        return isMirror(root, root);
    }


        public static void main(String args[]){
            Zad2 tree = new Zad2();
            tree.root = new Zad2(1);
            tree.root.left = new Zad2(2);
            tree.root.right = new Zad2(3);
            boolean output = isSymmetric(tree);
            System.out.println(output);
        }
}
