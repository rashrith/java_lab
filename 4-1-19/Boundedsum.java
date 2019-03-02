public class Boundedsum<T extends Number>{
T a;
T b;
public Boundedsum(T c,T d){
	a=c;
	b=d;
}	
public int Sum(){
	return (a.intValue()+b.intValue());
}
}

 class BoundedsumDemo{
	public static void main(String []args){
	Boundedsum<Integer> obj=new Boundedsum<Integer>(10,20);
	int d=obj.Sum();
	System.out.println("sum of 10 and 20 are:"+d);
}
}