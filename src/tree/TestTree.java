package tree;
import java.util.Scanner;

public class TestTree {
    public static void fillTree() {
        Tree t = new Tree();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number of values: ");
        int n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            t.add(sc.nextInt());
        }
        System.out.println("Preorder");
        t.preorder(t.getRoot());
        System.out.println("Inorder");
        t.inorder(t.getRoot());
        System.out.println("Postorder");
        t.postorder(t.getRoot());
    }

    public static void main(String[] args) {


        Tree t = new Tree();

        t.add(73);
        t.add(49);
        t.add(80);
        t.add(39);
        t.add(74);
        t.add(23);
        t.add(96);
        t.add(42);
        t.add(35);
        t.add(46);
        t.add(40);
        t.add(19);
        t.add(53);

        System.out.println("Inorder ");
        t.inorder(t.getRoot());
        System.out.println("Postorder");
        t.postorder(t.getRoot());
        System.out.println("Preorder");
        t.preorder(t.getRoot());

    }
}
