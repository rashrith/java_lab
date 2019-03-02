import java.util.*;
public class QueueDemo{
   public static void main(String args[]){
        MyQueue obj=new MyQueue(5);
        int ch=0,e;
        while(ch!=4){
        System.out.println("menu:");
        System.out.println("1.enqueue\n 2.dequeue \n 3.display");
        System.out.println("enter choice:");
        Scanner sc=new Scanner(System.in);
        ch=sc.nextInt();
        switch(ch){
	case 1:if(obj.isfull())
  		System.out.println("queue is full");
	            else{
		e=sc.nextInt();
		obj.enqueue(e);
 	           }
 		break;
	case 2:if(obj.isempty())
		System.out.println("Queue is empty");
	             else{
		  e=obj.dequeue();
		  System.out.println("element is:"+e);
	             }
		break;
	case 3:if(obj.isempty())
		System.out.println("queue is empty");
	            else{
		 obj.display();
		}
		break;
	case 4:System.exit(1);
		break;
	default:System.out.println("not valied input");
        }
}
}
}

