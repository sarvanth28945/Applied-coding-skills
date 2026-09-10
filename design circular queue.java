class MyCircularQueue {
    private final int[] queue;
    private int head;
    private int tail;
    private final int capacity;

    public MyCircularQueue(int k) {
        this.capacity = k + 1; // Extra space to differentiate full vs empty state
        this.queue = new int[this.capacity];
        this.head = 0;
        this.tail = 0;
    }
    
    public boolean enQueue(int value) {
        if (isFull()) {
            return false;
        }
        queue[tail] = value;
        tail = (tail + 1) % capacity;
        return true;
    }
    
    public boolean deQueue() {
        if (isEmpty()) {
            return false;
        }
        head = (head + 1) % capacity;
        return true;
    }
    
    public int Front() {
        return isEmpty() ? -1 : queue[head];
    }
    
    public int Rear() {
        return isEmpty() ? -1 : queue[(tail - 1 + capacity) % capacity];
    }
    
    public boolean isEmpty() {
        return head == tail;
    }
    
    public boolean isFull() {
        return (tail + 1) % capacity == head;
    }
}
