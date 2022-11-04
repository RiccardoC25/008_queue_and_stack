public class Stack implements IStack{
    Object[] stack = new Object[214748364];
    int cont = 0;

    @Override
    public void push(Object o) {
        stack[cont] = o;
        cont++;
    }

    @Override
    public Object pop() {
        if(cont != 0){
            Object sup = stack[cont-1];
            stack[cont-1] = null;
            cont--;
            return sup;
        }else{
            return null;
        }
    }

    @Override
    public Object top() {
        if(cont != 0){
            return stack[cont-1];
        }else{
            return null;
        }
    }

    @Override
    public int size() {
        return cont;
    }

    @Override
    public boolean isEmpty() {
        if(cont == 0){
            return true;
        }else {
            return false;
        }
    }
}
