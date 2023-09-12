/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Stacks_Queues;

import static Stacks_Queues.PostfixEvaluator.evaluate;
import static Stacks_Queues.PostfixEvaluator.isOperator;
import java.util.Stack;
import java.util.StringTokenizer;


public class PrefixEvaluator {
    public static boolean isOperator(String S){
        return (S.equals("+")||S.equals("-")||S.equals("*")||S.equals("/"));
    }
    public static double evaluate(String op,double n1, double n2){
        if(op.equals("+")) return n1 + n2;
        if(op.equals("-")) return n1 - n2;
        if(op.equals("*")) return n1 * n2;
        if(op.equals("/")){
            if(n2==0)throw new RuntimeException("Divide by 0!");
            return n1/n2;
        }
        throw new RuntimeException("Operator is not supported");
    }
 public static double evaluate(String exp){
        double result=0;
        
        StringTokenizer stk=new StringTokenizer(exp,"() ");
        //Stack<String> stack1=new Stack();
        Stack<Double> stack=new Stack();
        double n1,n2;
        while(stk.hasMoreElements()){
            String part=stk.nextToken();
            
            if(!isOperator(part))stack.push(Double.parseDouble(part));
            else{
                    n2=stack.pop();
                    n1=stack.pop();
                    
                    result=evaluate(part,n1,n2);
                    stack.push(result);
                    }
           
        }
        return result;
    }
 public static void main(String[] args) {
        String exp="-*(3)(4)+(5)(6)";
        //run:1.0
        System.out.println(evaluate(exp));
    }
}
