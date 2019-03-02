//class to implement tree node
import java.util.*;
public class TreeNode<K extends Comparable<K>, V>{
	Node<K,V> data;
	TreeNode<K,V> left;
	TreeNode<K,V> right;
	

	public TreeNode(Node<K,V> d, TreeNode<K,V> l, TreeNode<K,V> r){
		data = d;
		left = l;
		right = r;
	}
}