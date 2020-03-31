
package problem5.node;

import problem5.student.Student;

// to define node properties
public class Node {
    private Student student;
    private Node next;
    public Node(Student student) {
        this.student = student;
        next = null;
    }
}
