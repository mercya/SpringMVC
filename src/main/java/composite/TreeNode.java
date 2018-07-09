package composite;

import java.util.LinkedList;
import java.util.List;

/**
 * @author shadow
 * @Date 2016��8��4������7:59:06
 * @Fun ���ڵ� ����
 * 		Ҳ���������������һ�ѽڵ������һ����
 **/
public class TreeNode {
	private String name;
	private TreeNode parent;
	private List<TreeNode> children;
	
	public TreeNode(String name) {
		// TODO Auto-generated constructor stub
		this.name = name;
		this.children = new LinkedList<>();
	}
	
	public void setName(String name){
		this.name = name;
	}
	
	public String getName(){
		return this.name;
	}
	
	public void setParent(TreeNode parent){
		this.parent = parent;
	}
	
	public TreeNode getParent(){
		return this.parent;
	}
	
	public List<TreeNode> getChildren(){
		return this.children;
	}
	
	public void add(TreeNode node){
		this.children.add(node);
	}
	
	public void remove(TreeNode node){
		this.children.remove(node);
	}
}
