import java.util.*;
class min_stack{
    public Stack<Integer> st;
    public Stack<Integer> minstack;
 public min_stack(){
 st = new Stack<>();
 minstack = new Stack<>();
 }
 public void push(int x){
    st.push(x);
    if(minstack.isEmpty() || x<=minstack.peek()){
        minstack.push(x);
    }else{
        minstack.push(minstack.peek());
    }
 }
 public void pop(){
    if(!st.isEmpty()){
        st.pop();
        minstack.pop();
    }
 }
 public int peek() {
    if(st.isEmpty()){
        return -1;
    }else{
        return st.peek();
    }
 }
 boolean isEmpty() {
    if(st.isEmpty()){
        return true;
    }else{
        return false;
    }
 }
 public int getMin(){
    if(minstack.isEmpty()){
    return -1;
    }
    return minstack.peek();
 }
 public static void main(String args[]){
   min_stack s = new min_stack();
   //Example input: [[1, 2], [1, 3], [3], [2], [4], [1, 1], [4]]
        s.push(2);                                 // push 2
        s.push(3);                                 // push 3
        System.out.println("peek(): " + s.peek());    // [3]
        s.pop();         // pop -> removes 3
        System.out.println("getMin(): " + s.getMin());  // [2]
        s.push(1);       // push 1
        System.out.println("getMin(): " + s.getMin());

 }
}