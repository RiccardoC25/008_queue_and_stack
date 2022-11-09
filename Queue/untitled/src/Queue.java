public class Queue implements IQueue {
    Object[] queue = new Object[0];
    int cont = 0;
    boolean isEnqueued = false;

    private void copyQueue(Object[] sup) {
        if (isEnqueued) {
            for (int i = 0; i < cont; i++) {
                sup[i] = queue[i];
            }
        } else {
            for (int i = 0; i < cont - 1; i++) {
                sup[i] = queue[i];
            }
        }
    }

    public void sizeControl(){
        System.out.println("Size of queue is: " + queue.length);
    }

    @Override
    public void enqueue(Object o) {
        isEnqueued = true;
        Object[] sup = new Object[cont + 1];
        copyQueue(sup);
        sup[cont] = o;
        queue = sup;
        cont++;
    }

    @Override
    public Object dequeue() {
        if(cont!=0){
            isEnqueued = false;
            Object o=queue[0];
            Object[] sup = new Object[cont - 1];
            copyQueue(sup);
            queue=sup;
            cont--;
            return o;
        }else{
            return null;
        }
    }

    @Override
    public Object front() {
        return queue[0];
    }

    @Override
    public int size() {
        return cont;
    }

    @Override
    public boolean isEmpty() {
        if(cont==0){
            return true;
        }else{
            return false;
        }
    }
}
