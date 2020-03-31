
package problem2.main;

import problem1.mybst.MyBinarySearchTree;

import java.util.Scanner;

// executable class
//use problem1.mybst.MyBinarySearchTree class for creating binary tree
public class MyMain {
    public static void main(String[] args) {
        MyBinarySearchTree t = new MyBinarySearchTree();
        Scanner s = new Scanner(System.in);
        int i = 7;
        System.out.println("Please take only 7 inputs ...");
        while (i > 0) {
            try {
                t.add(s.nextInt());
            } catch (Exception x) {
                System.out.println("You Entered invalid no. ... you are kicked :) ");
                break;
            }
            i--;
        }
        MyBinarySearchTree.preOrder(t.data);
        System.out.println();
        t.postOrder(t.data);
    }
}
