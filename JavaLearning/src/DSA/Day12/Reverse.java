package DSA.Day12;

import java.util.Stack;

public class Reverse {
    public static void main(String[] args) {
        String stmt="Hello this is a statement";
        Stack<Character> stack=new Stack<>();
        char[] arr=stmt.toCharArray();
        for(char ch:arr){
            stack.push(ch);
        }
        for(int i=0;i<stmt.length();i++){
            arr[i]=stack.pop();
        }
        System.out.println(new String(arr));
    }
}
