class Node {
  public int value;
  public Node next;

  public Node(int value) {
    this.value = value;
    this.next = null;
  }
}
class MyCircularQueue {
    private Node head, tail;
    int size = 0;
    int currSize = 0;
    /** Initialize your data structure here. Set the size of the queue to be k. */
    public MyCircularQueue(int k) {
        size = k;
    }
    
    /** Insert an element into the circular queue. Return true if the operation is successful. */
    public boolean enQueue(int value) {
        if(isFull()) return false;
        Node newTail = new Node(value);
        if(isEmpty()){
            tail = newTail; 
            head = newTail;
        }
        else {
            tail.next = newTail;
            tail = newTail;
        }
        ++currSize;
        return true;
    }
    
    /** Delete an element from the circular queue. Return true if the operation is successful. */
    public boolean deQueue() {
        if(isEmpty()) return false;
        head = head.next;
        --currSize;
        return true;
    }
    
    /** Get the front item from the queue. */
    public int Front() {
        return isEmpty() ? -1 : head.value;
    }
    
    /** Get the last item from the queue. */
    public int Rear() {
         return isEmpty() ? -1 : tail.value;
    }
    
    /** Checks whether the circular queue is empty or not. */
    public boolean isEmpty() {
        return currSize == 0;
    }
    
    /** Checks whether the circular queue is full or not. */
    public boolean isFull() {
        return currSize >= size;
    }
}

/**
 * Your MyCircularQueue object will be instantiated and called as such:
 * MyCircularQueue obj = new MyCircularQueue(k);
 * boolean param_1 = obj.enQueue(value);
 * boolean param_2 = obj.deQueue();
 * int param_3 = obj.Front();
 * int param_4 = obj.Rear();
 * boolean param_5 = obj.isEmpty();
 * boolean param_6 = obj.isFull();
 */