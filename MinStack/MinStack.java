class MinStack{    
    LinkedList<Integer> stack;
    int min;
    /** initialize your data structure here. */
    public MinStack() {
        stack = new LinkedList<Integer>();
        min = Integer.MAX_VALUE;
    }

    public void push(int x) {
        stack.add(x);
        if (x < min) {
            min = x;
        }
    }

    public void pop() {
        if (stack.removeLast() == min) {
            min = Integer.MAX_VALUE;
            for (int s : stack) {
                if (s < min) {
                    min = s;
                }
            }   
        }
        
    }

    public int top() {
        return stack.peekLast();
    }

    public int getMin() {
        return min;
    }
}

/**
 * Your MinStack object will be instantiated and called as such:
 * MinStack obj = new MinStack();
 * obj.push(x);
 * obj.pop();
 * int param_3 = obj.top();
 * int param_4 = obj.getMin();
 */
