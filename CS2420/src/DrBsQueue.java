public class DrBsQueue {

    private int [] queue;

    private int front;

    private int back;

    private int size;

    public DrBsQueue(){
        queue = new int[7];
        front = 0;
        back = -1;
        size = 0;
    }

    public void enqueue(int a){
        back++;
        size++;
        if (back == queue.length){
            back = 0;
        }

        queue[back]=a;

    }

    public int getFront(){
        if (isEmpty()){
            throw new NullPointerException();
        }
        return queue[front];
    }

    public void dequeue(){
        size--;
        front++;
        if (front == queue.length){
            front = 0;
        }
    }

    public void makeEmpty(){
        size = 0;
        front = 0;
        back = -1;
    }

    public boolean isEmpty(){
        return size == 0;
    }

    public static void main(String[] args) {

        DrBsQueue q = new DrBsQueue();

        q.enqueue(1);
        q.enqueue(2);
        q.enqueue(3);
        q.enqueue(4);
        q.enqueue(5);

        for (int i = 0; i < 5; i++){
            int x = q.getFront();
            System.out.println(x);
            q.dequeue();
        }

        q.enqueue(1);
        q.enqueue(2);
        q.enqueue(3);
        q.enqueue(4);
        q.enqueue(5);

        for (int i = 0; i < 5; i++){
            int x = q.getFront();
            System.out.println(x);
            q.dequeue();
        }


    }


}
