// infix to postfix. needs a peek.

import java.util.Scanner;
import java.util.Stack;

class W6CC3{

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        W6CC3 obj = new W6CC3();
        
        System.out.println("Enter the infix expression: ");
        String infix = in.next();
        String postfix = obj.convertToPostfix(infix);

        System.out.println("The postfix expressions is: " +postfix);

        in.close();
    }

    private String convertToPostfix(String infix) {
        String postfix = "";
        Stack <Character> stack = new Stack<>(); // line to create a new stack

        for (int i = 0; i < infix.length(); i++){
            char ch = infix.charAt(i); // taking each characters of string. String.charAt(index)

            if(Character.isLetterOrDigit(ch)){ //Character.isLetterOrDigit(char)
                postfix = postfix + ch; // if its a letter or digit add to postfix string
            }
            else if (ch == '('){
                stack.push(ch); // if its '(' add to stack
            }
            else if(ch ==')'){ // if its ')' check whether the top of stack is '(', if not add the op to postfix
                while (!stack.isEmpty() && stack.peek() != '('){ //functions of stack.
                    postfix = postfix + stack.pop(); 
                }
                stack.pop(); //delete from stack. (needs a peek)
            }
            else {
                while(!stack.isEmpty() && (precedence(ch) < precedence (stack.peek()))){ //if stack is not empty operator precedence is checked 
                    postfix = postfix + stack.pop(); // and the biggest operator in stack is added to postfix
                }
                stack.push(ch); // else char is added to stack
            }
        }

        while (!stack.isEmpty()){ //when expressions are finished the remaining char in stack is added to postfix.
            postfix = postfix + stack.pop();
        }

        return postfix;
    }

    private int precedence(char op){
        switch (op){
            case '/' : return 1; 
            case '-' : return 2; // [{+ op > * op >  - op > / op} > ^ op]
            case '*' : return 3; // technically [^ > / > * > + > -]
            case '+' : return 4; 
        }
        return -1;
    }
}