package com.solvd.laba.jjaccomando;

import com.solvd.laba.jjaccomando.interfaces.LuggageInterface;

public class CustomLinkedList<T extends LuggageInterface> {

    //Node class to represent each element in the linked list
    private static class Node<T> {
        T data;
        Node<T> next;

        Node(T data) {
            this.data = data;
            this.next = null;
        }
    }

    private Node<T> head; //head of the list
    private int size; //size of the list

    public CustomLinkedList() {
        this.head = null;
        this.size = 0;
    }

    //add an element to the end of the list
    public final void add(T data) {
        Node<T> newNode = new Node<>(data);
        if (head == null) {
            head = newNode;
        } else {
            Node<T> current = head;
            while (current.next != null) {
                current = current.next;
            }
            current.next = newNode;
        }
        size++;
    }

    //removes an element from the list
    public final boolean remove(T data) {
        if (head == null) {
            return false;
        }

        if (head.data.equals(data)) {
            head = head.next;
            size--;
            return true;
        }

        Node<T> current = head;
        while (current.next != null && !current.next.data.equals(data)) {
            current = current.next;
        }

        if (current.next != null) {
            current.next = current.next.next;
            size--;
            return true;
        }

        return false;
    }

    @Override
    public String toString() {
        String S = "{";
        Node<T> myNode = head;
        if (myNode == null)
            return S + "}";
        while (myNode.next != null) {
            S += String.valueOf(myNode.data) + "->";
            myNode = myNode.next;
        }
        S += String.valueOf(myNode.data);
        return S + "}";
    }

    //returns the size of the list
    public final int size() {
        return size;
    }

    //returns true if the list is empty
    public final boolean isEmpty() {
        return size == 0;
    }

}
