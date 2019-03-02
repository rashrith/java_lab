import java.util.*;
class HashSetDemo{
	public static void main(String args[])
	{
		HashSet<Double> hs=new HashSet<Double>();
		hs.add(20.2);
		hs.add(230.4);
		hs.add(24.2);
		hs.add(null);
		System.out.println(hs);
		LinkedHashSet<String>  lhs=new LinkedHashSet<String>();
		lhs.add("abc");
		lhs.add("axyz");
		lhs.add("123");
		System.out.println(lhs);
		System.out.println(lhs.add("xyz"));
		TreeSet<Integer> ts=new TreeSet<Integer>();
		ts.add(23);
		ts.add(1);
		System.out.println(ts);
	}
}