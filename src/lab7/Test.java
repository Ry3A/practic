package lab7;

import lab6.Student;

import java.util.Scanner;
import java.util.Stack;

public class Test {
    public static void main(String[] args) {
        Stack<Integer> first = new Stack<>();
        Stack<Integer> second = new Stack<>();
        first.push(9);
        first.push(7);
        first.push(5);
        first.push(3);
        first.push(1);
        second.push(0);
        second.push(8);
        second.push(6);
        second.push(4);
        second.push(2);
        int k = 0;
        while(!(first.empty()) && (!(second.empty()))){
            if((first.peek() > second.peek()) || (first.peek() == 0 && second.peek() == 9)){
                first.push(first.peek());
                first.push(second.peek());
            }
            else{
                second.push(first.peek());
                second.push(second.peek());
            }
            first.pop();
            second.pop();
            k++;
        }
        System.out.println(k / 7);
        if(first.empty()){
            System.out.println("second");
        }
        else{
            System.out.println("first");
        }
    }
}