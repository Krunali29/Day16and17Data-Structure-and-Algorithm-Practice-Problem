package com.bridgelabz.Unorderedlist;

public class Node {
    Node next;
    String data;
    public Node(String data) {
        this.next = null;
        this.data = data;
        UnorderedList.size++;
    }

}
