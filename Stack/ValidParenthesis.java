package Stack;

import java.util.Stack;

public class ValidParenthesis {

    public static void main(String[] args) {

        String s="(){}[]";

        Stack<Character> stack=new Stack<>();

        boolean valid=true;

        for(char c:s.toCharArray()){

            if(c=='('||c=='{'||c=='[')
                stack.push(c);

            else{

                if(stack.isEmpty()){
                    valid=false;
                    break;
                }

                stack.pop();
            }
        }

        if(valid && stack.isEmpty())
            System.out.println("Valid");
        else
            System.out.println("Invalid");
    }
}
