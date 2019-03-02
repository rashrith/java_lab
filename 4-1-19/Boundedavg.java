import java.util.*;
public class Boundedavg<T extends Number>{
T []avgarr;
public Boundedavg(T arr[]){
avgarr=arr;
}
public double avg(){
double sum=0;
for(int i=0;i<avgarr.length;i++)
sum+=avgarr[i].doubleValue();
return sum/avgarr.length;
}
}


class BoundedavgDemo{
public static void main(String []args){
Scanner sc=new Scanner(System.in);
System.out.println("enter size");
int n=sc.nextInt();
Integer []arr=new Integer[n];
System.out.println("enter elements");
for(int i=0;i<n;i++)
arr[i]=sc.nextInt();
Boundedavg<Integer> obj=new Boundedavg<Integer>(arr);
double davg=obj.avg();
System.out.println("average of given array is:"+davg);
}
}