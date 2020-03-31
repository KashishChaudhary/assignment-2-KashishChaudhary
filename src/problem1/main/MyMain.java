
package problem1.main;
// executable class

import problem1.mybst.MyBinarySearchTree;

import java.util.Scanner;

public class MyMain {
    public static void main(String[] args) {
        MyBinarySearchTree t = new MyBinarySearchTree();
        Scanner sc = new Scanner(System.in);
        int i = 7;
        System.out.println("Please take only 7 inputs");
        while (i > 0) {
            try {
                t.add(sc.nextInt());
            } catch (Exception e) {
                System.out.println("Error Occurred is \" " + e + " \", so you are going to be kicked-out \n");
                break;
            }
            i--;
        }
        System.out.println("All Left-children are :");
        t.printLeftNode();
        System.out.println("Number of nodes doesn't have left child :");
        t.countNotLeft();


    }
}
