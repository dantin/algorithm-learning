package com.demo2do.data.list;

/**
 * Single Linked List
 *
 * @param <T> type
 */
public class SingleLinkedList<T> {

    private Node<T> head;

    private Node<T> tail;

    private int size;

    /**
     * Default constructor
     */
    public SingleLinkedList() {
        this.head = null;
        this.tail = null;
        this.size = 0;
    }

    /**
     * Push data at the head of the list
     *
     * @param data the data
     */
    public void push(T data) {

        Node<T> node;
        if (this.isEmpty()) {
            node = new Node<T>(data);
            this.head = node;
            this.tail = node;
        } else {
            node = new Node<T>(data, this.head);
            this.head = node;
        }

        this.size++;
    }

    /**
     * Append data at the end of the list
     *
     * @param data the data
     */
    public void append(T data) {

        Node<T> node = new Node<T>(data);
        if (this.isEmpty()) {
            this.head = node;
            this.tail = node;
        } else {
            this.tail.setNext(node);
            this.tail = node;
        }

        this.size++;
    }

    /**
     * @return size of the list
     */
    public int size() {
        return this.size;
    }

    /**
     * Whether the list is empty
     *
     * @return result
     */
    public boolean isEmpty() {
        return size == 0;
    }

    @Override
    public String toString() {
        StringBuffer sb = new StringBuffer();

        sb.append("List[ ");
        Node<T> node = this.head;
        while (node != null) {
            sb.append(node.getData());
            node = node.getNext();
            if (node != null) {
                sb.append(", ");
            }
        }
        sb.append(" ]");

        return sb.toString();
    }

    /**
     * Node element
     *
     * @param <T> type
     */
    private class Node<T> {

        private Node<T> next;

        private T data;

        /**
         * Node constructor
         *
         * @param data the data
         */
        public Node(T data) {
            this.next = null;
            this.data = data;
        }

        /**
         * Full constructor
         *
         * @param data the data
         * @param next the next node
         */
        public Node(T data, Node<T> next) {
            this.data = data;
            this.next = next;
        }

        @Override
        public String toString() {
            return this.getData().toString();
        }

        public Node<T> getNext() {
            return next;
        }

        public void setNext(Node<T> next) {
            this.next = next;
        }

        public T getData() {
            return data;
        }

        public void setData(T data) {
            this.data = data;
        }
    }
}
