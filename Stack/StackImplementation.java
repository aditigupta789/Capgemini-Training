package Stack;

public class StackImplementation {

    int top=-1;
    int[] stack=new int[5];

    void push(int value){

        stack[++top]=value;
    }

    void pop(){

        System.out.println("Removed: "+stack[top--]);
    }

    void display(){

        for(int i=top;i>=0;i--)
            System.out.println(stack[i]);
    }

    public static void main(String[] args) {

        StackImplementation s=new StackImplementation();

        s.push(10);
        s.push(20);

        s.display();

        s.pop();
    }
}