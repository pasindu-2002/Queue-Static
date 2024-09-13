import java.util.Arrays;

public class Queue {

    int arr[];
    int capacity;
    int front;
    int rear;

    public Queue(int size) {
        capacity = size;
        arr = new int[size];
        front = -1;
        rear = -1;
    }

    public void enqueue(int data){
        if(isFull()){
            System.out.println("Queue Full");
            System.exit(1);
        }

        if (isEmpty()){
            front++;
        }
        rear++;
        arr[rear] = data;
        System.out.println("Insert Successfully");
    }

    public void dequeue(){
        int temp;
        if (isEmpty()){
            System.out.println("Queue Empty");
            System.exit(1);
        }

        System.out.println(arr[front++]);

        if(front>rear){
            front = -1;
            rear = -1;
        }
    }

    public int peek(){
        if(isEmpty()){
            System.out.println("Queue is Empty");
        }
        return arr[front];
    }

    private boolean isEmpty(){
        return rear == -1 && front == -1;
    }

    private boolean isFull(){
        return rear == capacity-1;
    }

    @Override
    public String toString() {
        return "Queue{" +
                "arr=" + Arrays.toString(arr) +
                '}';
    }
}
