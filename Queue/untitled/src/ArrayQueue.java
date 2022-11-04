public class ArrayQueue implements IQueue{
    public Object [] queue;
    private int size;
    private int capacity;

    public void setSize(int size) {
        this.size = size;
    }

    public ArrayQueue(Object[] queue){
        queue = new Object[2];
        size = 0;
        capacity = 0;
    }

    @Override
    public void enqueue(Object o) {
        if (size == capacity) {
            increaseArraySize();
        }
        queue[size] = 0;
        size++;

    }
    public void increaseArraySize() {
        Object tempArray[] = null;
        if (size == capacity) {
            tempArray = new Object[capacity * 2];
            {
                if (capacity >= 0) {
                    System.arraycopy(queue, 0, tempArray, 0, capacity);
                }
            }
        }
        queue = tempArray;
        capacity = capacity * 2;
    }

    public void shrinkSize() {
        Object[] temp;
        if (size > 0) {
            temp = new Object[size];
            System.arraycopy(queue, 0, temp, 0, size);
            capacity = size;
            queue = temp;
        }
    }

    @Override
    public Object dequeue() {
        Object sup = null;
        if (size == 0) {
            queue[0] = sup;
        }
        return sup;
    }

    @Override
    public Object front() {
        return null;
    }

    @Override
    public int size() {
        return queue.length;
    }

    @Override
    public boolean isEmpty() {
        return false;
    }
}
