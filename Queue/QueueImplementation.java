package Queue;

public class QueueImplementation {

    int front=0,rear=-1;

    int[] queue=new int[5];

    void add(int value){

        queue[++rear]=value;
    }

    void remove(){

        System.out.println("Removed: "+queue[front++]);
    }

    public static void main(String[] args) {

        QueueImplementation q=new QueueImplementation();

        q.add(10);
        q.add(20);

        q.remove();
    }
}
