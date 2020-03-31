
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
    public void add(final int value) {
        this.data = addService(this.data, value);
    }

    public TreeNode addService(TreeNode treeData, final int addingValue) {
        if (treeData == null) {
            return new TreeNode(addingValue);
        }
        if (addingValue < treeData.getData()) {
            treeData.setLeft(addService(treeData.getLeft(), addingValue));
        } else if (addingValue == treeData.getData()) {
            return treeData;
        } else {
            treeData.setRight(addService(treeData.getRight(), addingValue));
        }
        return treeData;
    }
}
