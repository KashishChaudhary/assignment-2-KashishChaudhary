
package problem1.mybst;
import problem1.node.TreeNode;

// to implement BinarySearchTree
public class MyBinarySearchTree {
    public static StringBuilder preOrderString;
    public TreeNode data;
    private int count=0;
    public MyBinarySearchTree(){
        this.data = null;
        preOrderString = new StringBuilder();
    }
    public static void preOrder(TreeNode data) {
        if (data == null) {
            return;
        }
        preOrder(data.getLeft());
        preOrder(data.getRight());
        preOrderString.append(data.getData()).append(" ");
    }
}
