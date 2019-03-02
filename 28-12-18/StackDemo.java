import java.util.*;
class StackDemo{
public static void main(String args[]){
Mystack<Integer> obj=new Mystack<Integer>(5);
int ch=0,e;
do{
System.out.println("1.push\n 2.pop\n 3.display");
System.out.println("enter choice");
Scanner sc=new Scanner(System.in);
ch=sc.nextInt();
switch(ch){
case 1:if(obj.isFull())
System.out.println("stack is empty");
else{
System.out.println("enter element");
e=sc.nextInt();
obj.push(e);
}break;
case 2:if(obj.isEmpty())
System.out.println("stack is empty");
else{
System.out.println("element deleted is:"+obj.pop());
}break;
case 3:if(obj.isEmpty())
System.out.println("stack is empty");
else{
System.out.println(obj.toString());
}break;
case 4:System.exit(1);
default :System.out.println("invalid input");
}
}while(ch>0);
}
}