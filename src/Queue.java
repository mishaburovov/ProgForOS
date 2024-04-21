import java.util.ArrayList;

public class Queue {
    private ArrayList<Integer> queue;
    
    public Queue() {
        this.queue = new ArrayList<>();
    }
    
    public void add(int element) {
        queue.add(element);
    }
    
    public void remove() {
        if (!queue.isEmpty()) {
            queue.remove(0);
        } else {
            System.out.println("Queue is empty. Nothing to remove.");
        }
    }
    
    public void print() {
        if (queue.isEmpty()) {
            System.out.println("Queue is empty.");
        } else {
            System.out.println("Queue:");
            for (int element : queue) {
                System.out.println(element);
            }
        }
    }
    
    public static void main(String[] args) {
        Queue myQueue = new Queue();
        
        myQueue.add(10);
        myQueue.add(20);
        myQueue.add(30);
        
        myQueue.print();
        
        myQueue.remove();
        
        myQueue.print();
    }
}