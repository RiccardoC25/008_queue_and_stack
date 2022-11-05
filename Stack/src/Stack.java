public class Stack implements IStack{
    Object[] stack = new Object[0];
    int cont = 0; // counter for the elements of the stack
    boolean isPush;

    private void copyArray(Object[] sup){
        if (isPush) {
            for (int i = 0; i < cont; i++) {
                sup[i] = stack[i];
            }
        }else{
            for (int i = 0; i < cont-1; i++) {
                sup[i] = stack[i];
            }
        }

    }
    @Override
    public void push(Object o) { // insert a new element at the top of the stack
        isPush = true;
        Object[] sup = new Object[cont+1];
        copyArray(sup);
        sup[cont] = o;
        stack = sup;
        cont++;
    }
    public void sizeControl(){
        System.out.println("Size of stack is: " + stack.length);
    }

    @Override
    public Object pop() { // remove the element at the top of the stack
        if(cont != 0){
            isPush = false;
            Object o = stack[cont-1];
            Object[] sup = new Object[cont-1];
            copyArray(sup);
            stack = sup;
            cont--;
            return o;
        }else{
            return null;
        }
    }

    @Override
    public Object top() { // return the element at the top of the stack
        if(cont != 0){
            return stack[cont-1];
        }else{
            return null;
        }
    }

    @Override
    public int size() {
        return cont;
    } // return the size of the stack

    @Override
    public boolean isEmpty() { // return if the stack is Empty
        if(cont == 0){
            return true;
        }else {
            return false;
        }
    }
}
