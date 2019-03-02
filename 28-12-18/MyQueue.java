import java.util.*;
public class MyQueue{
    private int arr[];
    private int size;
    private int front;
    private int rare;
    public MyQueue(int size){
      	this.size=size;
	arr=new int[this.size];
	front=rare=-1;
   }
   public void enqueue(int ele){
	if(front==-1){
 	    front=0;
                  }

	arr[++rare]=ele;
   }
   public int dequeue(){
      return arr[front++];     	
   }
   public boolean isfull(){
	return (rare==(size-1));
   }
   public boolean isempty(){
	return (front==-1 );
   }
   public void display(){
	for(int i=front;i<rare;i++){
                     System.out.println(arr[i]);
                  }
   }
}

	                              