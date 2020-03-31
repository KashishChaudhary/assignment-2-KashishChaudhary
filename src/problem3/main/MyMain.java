/*
 *  Created by IntelliJ IDEA.
 *  User: Vaibhav
 *  Date: 23-Mar-20
 *  Time: 7:13 PM
 */
package problem3.main;

import problem3.myqueue.MyPriorityQueue;
import problem3.node.Node;
import problem5.student.Student;

// executable class
// use problem5.student.Student class to create object of student
public class MyMain {
    public static void main(String[] args) {
        MyPriorityQueue myPriorityQueue = new MyPriorityQueue();
        myPriorityQueue.enqueue(new Node(new Student(15, "GLA")));
        myPriorityQueue.enqueue(new Node(new Student(500, "audi ")));
        myPriorityQueue.enqueue(new Node(new Student(50, "abhi")));
        myPriorityQueue.enqueue(new Node(new Student(11, "Jio")));
        myPriorityQueue.enqueue(new Node(new Student(55, "Chaudhary")));
        myPriorityQueue.printQueue();
    }

}
