// class to create a node of BST
import java.util.*;
public class Node<K  extends Comparable<K> , V>{
	K key;
	V value;
	Node(K x , V y){
		key = x;
		value = y;
	}

	public String toString(){
		return "( "+key+" " +value+")"ot;
	}
}