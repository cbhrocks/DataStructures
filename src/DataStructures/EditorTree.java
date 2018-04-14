package DataStructures;

import java.lang.reflect.Array;

public class EditorTree {
    public Node root;

    private class Node{
        public Object item;
        public Character balance;
        public Node left;
        public Node right;

        public Node(Object item){
            this.item = item;
            this.balance = '-';
            this.left = null;
            this.right = null;
        }

        public Node(Object item, Node left, Node right){
            this.item = item;
            this.balance = '-';
            this.left = left;
            this.right = right;
        }
    }

    public void insert(Object){
        if
    }

    public void remove(Object){}

    public void contains(Object){}

    private void rotateLeft(Node root){

    }

    private void rotateRight(Node root){

    }

    public Array[Object] inOrderArray(){

    }
}
