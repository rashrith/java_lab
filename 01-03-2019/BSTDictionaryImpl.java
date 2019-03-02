//class to implement the operations of a BST
import java.util.*;
public class BSTDictionaryImpl<K extends Comparable<K>, V> implements BSTDictionary<K,V>{
	TreeNode<K,V> head;
	int bsize;
	public BSTDictionaryImpl(){
		head = null;
		bsize = 0;
	}
	public boolean isEmpty(){
		return head==null;
	}
	public int size(){
		return bsize;
	}
	
	public Node<K,V> find(K x){
		if(isEmpty()){
			System.out.println("Dictionary is empty");
			return null;
		}
		else{
			TreeNode<K,V> temp = head;
			while(temp!=null){
				if(x.compareTo(temp.data.key) < 0)
					temp = temp.left;
				else if(x.compareTo(temp.data.key)>0)
					temp = temp.right;
				else
					return temp.data;
			}//while
			System.out.println("key not found");
		}//else
		return null;
	}//end of find
	
	public void insert(Node<K,V> p){
		TreeNode<K,V> temp = head, pt = null;
		TreeNode<K,V> newnode = new TreeNode<K,V>(p,null,null);
		if(isEmpty())
			head = newnode;
		else{
			while(temp != null){
				pt = temp;
				if(p.key.compareTo(temp.data.key)<0)
					temp = temp.left;
				else if(p.key.compareTo(temp.data.key)>0)
					temp = temp.right;
				else{
					System.out.println("No duplicates are allowed");
					return;
				}
			}
		if(p.key.compareTo(pt.data.key)<0)
			pt.left = newnode;
		else
			pt.right = newnode;
		}
		bsize++;
	}
		 
		 					
	public void display(){
		if(isEmpty()){
			System.out.println("Dictionary is empty");
			return;
		}
		else	
			inOrder(head);
	}

	public void inOrder(TreeNode<K,V> temp){
		if(temp!=null){
			inOrder(temp.left);
			System.out.println(temp.data);
			inOrder(temp.right);
		}
	}


	public void delete(K key){
		if(isEmpty()){
			System.out.println("BST is empty, no element to delete");
			return;
		}
		TreeNode<K,V> temp = head, ptemp=null, c = null, s,ps,temp1;
		while(temp!=null && key.compareTo(temp.data.key)!=0){  //locating the node to be deleted
			ptemp = temp;
			if(key.compareTo(temp.data.key)<0)
				temp = temp.left;
			else
				temp = temp.right;
		}
		if(temp == null){
			System.out.println("Key not found to delete");
			return ;
		}
		temp1 = temp;
		if(temp!=null && key.compareTo(temp.data.key)==0){
			if(temp.left == null && temp.right == null)
			{
				if(ptemp.left ==  temp)
					ptemp.left = null;
				else
					ptemp.right = null;
			}
		else if(temp.left!=null && temp.right!=null){
			ps = temp.left;
			while(ps.right != null){
				c = ps;
				ps=ps.right;
			}
			c.right = ps.left;
		                 if(ptemp.right == temp){
				ptemp.right = ps;
				ps.right = temp.right; 		
				ps.left = temp.left;
			}
			else{
				ptemp.left = ps;
				ps.left = temp.left;
				ps.right = temp.right;
			}
	                }
	               else{//node to be deleted has only one child
		     if(temp.left == null && temp.right !=null){
			if(ptemp.left == temp)
				ptemp.left = temp.right;
			else
				ptemp.right = temp.right;
		    }
		   else{
			if(ptemp.left == temp)
				ptemp.left = temp.left;
			else
				ptemp.right = temp.left;
		   }
	      temp1 = null;
	      bsize--;
	}
}
}
}

