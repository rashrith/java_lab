import java.util.*;
 class Mystack<T>{
private T[] stack;
private int top,size;
public Mystack(int size){
this.size=size;
stack=(T[])new Object[size];
top=-1;
}
public boolean isFull(){
return (top==size-1);
}
public boolean isEmpty(){
return (top==-1);
}
public void push(T e){
stack[++top]=e;
}
public T pop(){
return stack[top--];
}
public String toString(){
return (Arrays.toString(stack));
}}
