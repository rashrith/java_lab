import java.util.*;
public class WildcardCmp<T extends Number>{
		T []avgarr;
	public WildcardCmp(T arr[]){
		avgarr=arr;
	}
	public double avg(){
		double sum=0;
		for(int i=0;i<avgarr.length;i++)
			sum+=avgarr[i].doubleValue();
		return sum/avgarr.length;
	}
	public boolean SameCompare(WildcardCmp<?> obj){
	
	return (avg()==obj.avg());
	}
	}


	class WildcardDemo
	{
		public static void main(String []args){
			Scanner sc=new Scanner(System.in);
			System.out.println("enter size");
			int n=sc.nextInt();
				Integer []arr=new Integer[n];
			System.out.println("enter elements");
				for(int i=0;i<n;i++)
					arr[i]=sc.nextInt();
				WildcardCmp<Integer> obj=new WildcardCmp<Integer>(arr);
			double iavg=obj.avg();
			System.out.println("average of given integer array is:"+iavg);
				Double []arr1={1.2,2.3,4.5,6.1};
				WildcardCmp<Double> obj1=new WildcardCmp<Double>(arr1);
			double davg=obj1.avg();
			System.out.println("average of given double array is:"+davg);
				if(obj1.SameCompare(obj))
			System.out.println("both are same")	;
				else
			System.out.println("both are not same");
		}
	}