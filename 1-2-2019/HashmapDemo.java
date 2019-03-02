import java.util.*;
class HashMapDemo
{
	public static void main(String args[])
	{
		HashMap<String,Integer> hm=new HashMap<String,Integer>();
		hm.put("saikrishna",100000);
		hm.put("h8",150000);
		System.out.println(hm);
		System.out.println(hm.put("saikrishna",200000));
		System.out.println(hm.put("koushik",250000));
		System.out.println(hm);
		Set key=hm.keySet();
		System.out.println(key);
		Collection val=hm.Values();
		System.out.println(val);
		Set ent=hm.entrySet();
		System.out.println(ent);
		
		
	}
}