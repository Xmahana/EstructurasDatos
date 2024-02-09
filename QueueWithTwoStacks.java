import java.util.Stack;

public class QueueWithTwoStacks {
    private Stack<Integer> stack1;
    private Stack<Integer> stack2;

    public QueueWithTwoStacks() {
        stack1 = new Stack<>();
        stack2 = new Stack<>();
    }

    public void enqueue(int element) {
        stack1.push(element);
    }

    public int dequeue() {
        if (stack2.isEmpty()) {
            while (!stack1.isEmpty()) {
                stack2.push(stack1.pop());
            }
        }
        return stack2.pop();
    }

    public static void main(String[] args) {
        QueueWithTwoStacks queue = new QueueWithTwoStacks();
        queue.enqueue(1);
        queue.enqueue(2);
        queue.enqueue(3);

        System.out.println(queue.dequeue()); // Salida: 1
        System.out.println(queue.dequeue()); // Salida: 2
        System.out.println(queue.dequeue()); // Salida: 3
    }
}