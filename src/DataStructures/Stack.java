package DataStructures;

public class Stack {
    private Object[] stack;
    private int end;
    private int length;

    public Stack(){
        this.length = 2;
        this.stack = new Object[length];
        this.end = 0;
    }

    public void push(Object t){
        if (this.length <= end) {
            this.length = this.length*2;
            Object[] temp = new Object[this.length];
            for (int i = 0; i < end; i++){
                temp[i] = this.stack[i];
            }
            this.stack = temp;
        }
        this.stack[end] = t;
        end++;
    }

    public Object pop() {
        if (this.end <= 0) {
            return null;
        }
        else {
            this.end--;
            return this.stack[end];
        }

    }

    public String toString(){
        String output = "";
        output += "[";
        //output += this.stack[0];
        for (int i = 0; i < this.end; i++){
            if (i > 0)
                output += ", ";
            output += this.stack[i];
        }
        output += "]";
        return output;
    }
}
