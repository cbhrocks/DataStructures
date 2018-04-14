package DataStructures;

public class LinkedList {
    private class Node{
        public Object item;
        public Node next;
        public Node prev;

        public Node(Object item){
            this.item = item;
            this.next = null;
            this.prev = null;
        }

        public Node(Object item, Node next, Node prev){
            this.item = item;
            this.next = next;
            this.prev = prev;
        }
    }
    private Node first;
    private Node last;
    private int length;

    public LinkedList(){
        this.first = null;
        this.last = null;
        this.length = 0;
    }

    public void add(Object item){
        if (this.first == null){
            this.first = new Node(item, null, null);
            this.last = this.first;
        }
        else{
            this.last.next = new Node(item, null, this.last);
            this.last = this.last.next;
        }
        this.length++;
    }

    public Object remove(int index) {
        if (index == this.length-1)
            this.last = this.last.prev;
        if (index == 0)
            this.first = this.first.next;
        if (index < this.length/2){
            Node node = this.first;
            for(int i = 0; i < index; i++){
                node = node.next;
            }
            if (node.prev != null)
                node.prev.next = node.next;
            else
                this.first = this.first.next;
            if (node.next != null)
                node.next.prev = node.prev;
            this.length--;
            Node retNode = node;
            node = null;
            return retNode.item;
        }
        else{
            Node node = this.last;
            for(int i = this.length-1; i > index; i--){
                node = node.prev;
            }
            if (node.prev != null)
                node.prev.next = node.next;
            if (node.next != null)
                node.next.prev = node.prev;
            this.length--;
            Node retNode = node;
            node = null;
            return retNode.item;
        }
    }

    public int indexOf(Object t){
        Node n = first;
        int index = 0;
        while (n.item != t) {
            n = n.next;
            index++;
        }
        return index;
    }

    public Object get(int index){
        if (index < this.length/2){
            Node node = this.first;
            for(int i = 0; i < index; i++){
                node = node.next;
            }
            return node.item;
        }
        else{
            Node node = this.last;
            for(int i = this.length - 1; i > index; i--){
                node = node.prev;
            }
            return node.item;
        }
    }

    public String toString(){
        if (this.first == null)
            return "[]";
        String output = "[";
        Node n = this.first;
        while (n.next != null){
            output += n.item + ", ";
            n = n.next;
        }
        output += n.item + "]";
        return output;
    }
}
