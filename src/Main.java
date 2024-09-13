public class Main {
    public static void main(String[] args) {

        Queue q1 = new Queue(5);

        q1.enqueue(10);
        q1.enqueue(20);
        q1.enqueue(30);
        q1.enqueue(40);
        q1.enqueue(50);

        q1.dequeue();
        q1.dequeue();
        q1.dequeue();
        q1.dequeue();
        q1.dequeue();

        q1.enqueue(60);
        q1.enqueue(70);
        q1.enqueue(80);
        q1.enqueue(90);
        q1.enqueue(100);

        q1.dequeue();
        q1.dequeue();
        q1.dequeue();
        q1.dequeue();
        q1.dequeue();


        q1.enqueue(101);

        System.out.println(q1.toString());




    }
}