import java.util.*;
class Map1<k,v>{
	class MapNode<k,v>{
		k key;
		v value;
		MapNode<k,v> next;
		MapNode(k key,v value){
			this.key=key;
			this.value=value;
			next=null;
		}
	}
	ArrayList<MapNode<k,v>> buckets;
	int size;
	int numBukets;
	final double Default=load_factor;
	public Map1{
		numBukets=5;
		buckets=new ArrayList<>(numBukets);
		for(int i=0;i<numBukets;i++)
		{
			bukets.add(null);
		}
	}
	int getBuketsid(k key){
		int hashCode=key.hashCode();
		return(hashCode%numBukets);
	}
	void insert(k key,v value){
	int bucketId=getBuketsid(key);
	MapNode<k,v> head=bukets.get(buketId);
	while(head!=null)
	{
		if(head.key.equals(key))
		{
			head.value=value;
			return;
		}
		head=head.next;
	}
	MapNode<k,v> ele=new MapNode<k,v>(key,value);
	
	}
}

















