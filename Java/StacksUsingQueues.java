class MyStack {
    Queue<Integer> queue = new LinkedList<>();
    Queue<Integer> queue2 = new LinkedList<>();
    /** Initialize your data structure here. */
    public MyStack() {
        // queue = new Queue();
    }
    
    /** Push element x onto stack. */
    public void push(int x) {
        // queue.add(x);
        
        // improvement would be only using 1 queue: 
        queue.add(x);
        int count = queue.size();
        while(count > 1 ){
            queue.add(queue.remove());
            --count;
        }
    }
    
    /** Removes the element on top of the stack and returns that element. */
    public int pop() {
        // while(queue.size() > 1){
        //     queue2.add(queue.remove());
        // }
        // int toReturn = queue.remove();
        // while(!queue2.isEmpty()){
        //     queue.add(queue2.remove());
        // }
        // return toReturn;
        
        return queue.remove();
    }
    
    /** Get the top element. */
    public int top() {
        // while(queue.size() > 1){
        //     queue2.add(queue.remove());
        // }
        // int toReturn = queue.remove();
        // queue2.add(toReturn);
        // while(!queue2.isEmpty()){
        //     queue.add(queue2.remove());
        // }
        // return toReturn;
        return queue.peek();
    }
    
    /** Returns whether the stack is empty. */
    public boolean empty() {
        return queue.isEmpty();
    }
}

/**
 * Your MyStack object will be instantiated and called as such:
 * MyStack obj = new MyStack();
 * obj.push(x);
 * int param_2 = obj.pop();
 * int param_3 = obj.top();
 * boolean param_4 = obj.empty();
 */