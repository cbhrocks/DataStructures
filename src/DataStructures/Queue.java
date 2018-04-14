package DataStructures;

public class Queue {
    private Object[] queue;
    private int end;
    private int length;

    public Queue(){
        end = 0;
        this.length = 2;
        queue = new Object[this.length];
    }

    public void push(Object t){
        if (this.queue.length <= end) {
            this.length = this.length*2;
            Object[] temp = new Object[this.length];
            for (int i = 0; i < end; i++){
                temp[i] = this.queue[i];
            }
            this.queue = temp;
        }
        this.queue[end] = t;
        end++;
    }

    public Object pop() {
        Object item = this.queue[0];
        for (int i = 0; i < this.end; i++){
            this.queue[i] = this.queue[i+1];
        }
        if (this.end > 0)
            this.end--;
        return item;
    }

    public String toString(){
        String output = "";
        output += "[";
        output += this.queue[0];
        for (int i = 1; i < this.end; i++){
            output += ", " + this.queue[i];
        }
        output += "]";
        return output;
    }
}