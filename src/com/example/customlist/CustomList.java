package com.example.customlist;

public class CustomList<T> {
    Node<T> first;
    Node<T> last;
    int N;

    public CustomList() {
        first = null;
        last = null;
        N = 0;
    }

    public void add(T data){
        if (data == null) { throw new NullPointerException("data is null"); }
        if (!isEmpty()) {
            Node<T> prev = last;
            last = new Node<>(data,last ,null);
            prev.next = last;
        }
        else {
            last = new Node<>(data, first,null);
            first = last;
        }
        N++;
    }

    public boolean remove(T item) {
        if (isEmpty()) { throw new IllegalStateException("list is empty"); }
        boolean result = false;
        Node<T> prev = first;
        Node<T> curr = first;
        while (curr.next != null || curr == last) {
            if (curr.data.equals(item)) {

                if (N == 1) { first = null; last = null; }

                else if (curr.equals(first)) { first = first.next; }

                else if (curr.equals(last)) { last = prev; last.next = null; }

                else {
                    remove(curr);
                   // prev.next = curr.next;
                    }
                N--;
                result = true;
                break;
            }
            prev = curr;
            curr = prev.next;
        }
        return result;
    }

    // O(1)
    public void remove(Node<T> link){
        link.prev.next = link.next;

    }

    @Override
    public String  toString(){
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("[ ");
        Node<T> prev;
        for(Node<T> i = first;i!=null;i=prev.next){
            prev=i;
            stringBuilder.append(i.data).append(", ");
        }
        stringBuilder.append("]");
        return stringBuilder.toString();
    }

    public boolean isEmpty(){
        return N == 0;
    }

    public int size(){
        return N;
    }
}
