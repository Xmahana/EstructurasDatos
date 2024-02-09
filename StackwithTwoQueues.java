import java.util.LinkedList;
import java.util.Queue;

public class StackwithTwoQueues {
    
    private Queue<Object> queue1;
    private Queue<Object> queue2;

    public StackwithTwoQueues() {
        this.queue1 = new LinkedList<>();
        this.queue2 = new LinkedList<>();
    }

    public void push(int x) {
    
        while (!queue1.isEmpty()) {
            queue2.add(queue1.remove());
        }
    
        queue1.add(x);
    
        while (!queue2.isEmpty()) {
            queue1.add(queue2.remove());
        }

    }

    public Object pop() {
        
        if (queue1.isEmpty()) {
            System.out.println("la pila esta vacia");
            return null;
        }

        return queue1.remove();
    }

    public boolean empty() {
        return queue1.isEmpty() && queue2.isEmpty();
    }

    public static void main(String[] args) {
        StackwithTwoQueues stack = new StackwithTwoQueues();
    
        // Prueba push
        stack.push(1);
        stack.push(2);
        stack.push(3);
        
        // Prueba pop
        System.out.println(stack.pop()); // Debería imprimir 3
        System.out.println(stack.pop()); // Debería imprimir 2
        System.out.println(stack.pop()); // Debería imprimir 1

        System.out.println(stack.pop()); // Debería imprimir "la pila esta vacia"

    }



}
