
public class Stack1 {
    private int stackSize;
    private int[] stackArr;
    private int top;

    // create construtore for the stack
    public Stack1(int size) {
        this.stackSize = size;
        this.stackArr = new int[stackSize];
        this.top = -1;
    }

    //adding element in the stack
    public void push(int entry) {
        if (this.isStackFull()) {
            System.out.println("Stack is full so increase the capacity ");
            this.increaseStackCapacity();
        }
        System.out.println("Adding entry :" + entry);
        this.stackArr[++top] = entry;
    }

    //remove
    public int pop() throws Exception {
        if (this.isEmpty()) {
            throw new Exception("Stack is empty");
        }
        int entry = this.stackArr[top--];
        System.out.println("Removed entry: " + entry);
        return entry;
    }

    public long peek() {
        return stackArr[top];
    }

    private void increaseStackCapacity() {
        int[] newStack = new int[this.stackSize * 2];
        for (int i = 0; i < stackSize; i++) {
            newStack[i] = this.stackArr[i];
        }
        this.stackArr = newStack;
        this.stackSize = this.stackSize * 2;
    }

    //return true if the stack is empty
    public boolean isEmpty() {
        return (top == -1);
    }

    //return true if the stack is full
    public boolean isStackFull() {
        return (top == stackSize - 1);
    }

    public static void main(String[] args) {
        Stack1 stack = new Stack1(2);
        for (int i = 0; i < 10; i++) {
            stack.push(i);
        }
        for (int i = 0; i < 4; i++) {
            try {
                stack.pop();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }


}

