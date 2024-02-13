package Interface.Assisgnments.LoopableClassNode;

import org.w3c.dom.traversal.NodeIterator;

import java.util.Iterator;

public class Node {
    int data;
    Node next;

    public Node(int data){
        this.data = data;
        this.next= null;
    }
    public Node(int data, Node next){
        this.data = data;
        this.next=next;
    }


}
