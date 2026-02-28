package Stack;

import java.util.Stack;

public class ReversePolishNatotaion {

    public static void main(String[] args) {

        String[] exp={"2","3","+"};

        Stack<Integer> stack=new Stack<>();

        for(String s:exp){

            if(s.equals("+")){

                int b=stack.pop();
                int a=stack.pop();

                stack.push(a+b);
            }
            else
                stack.push(Integer.parseInt(s));
        }

        System.out.println("Result: "+stack.pop());
    }
}
