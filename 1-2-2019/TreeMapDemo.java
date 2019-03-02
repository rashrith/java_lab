import java.util.*;
class TreeMapDemo
{
	public static void main(String args[])
	{
		TreeMap<String,Integer> hm=new TreeMap<String,Integer>();
		hm.put("saikrishna",100000);
		hm.put("h8",150000);
		System.out.println(hm);
		System.out.println(hm.put("saikrishna",200000));
		System.out.println(hm.put("koushik",250000));
		System.out.println(hm);
		Set key=hm.keySet();
		System.out.println(key);
		Collection val=hm.Value();
		System.out.println(val);
		Set ent=hm.entrySet();
		System.out.println(ent);
		
		
	}
}