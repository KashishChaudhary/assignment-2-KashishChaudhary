
package problem4.myqueue;
// to create queue to store pre - order successor

import problem1.node.TreeNode;
import problem3.node.Node;

public class MyQueue {
    private Node front;
    private Node rear;
    public MyQueue() {
        front = null;
        rear = null;
    }
    public void enqueue(int data) {
        Node ns = new Node();
        ns.setData(data);
        if (front == null) {
            front = rear = ns;
        } else {
            rear.setNext(ns);
            rear = ns;
        }
    }
    public void preSuccessor(TreeNode root) {
        if (root == null)
            return;
        else {
            enqueue(root.getData());
            preSuccessor(root.getLeft());
            preSuccessor(root.getRight());
        }
    }

}
