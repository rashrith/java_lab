// interface to implement dictionary ADT
import java.util.*;
public interface BSTDictionary<K extends Comparable<K>, V>{
	void insert(Node<K,V> p);
	void delete(K x);
	Node<K,V> find(K x);
	int size();
	boolean isEmpty();
	void display();
	}
