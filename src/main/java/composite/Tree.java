package composite;
/**
 * @author shadow
 * @Date 2016��8��4������7:58:19
 * @Fun  �� ����
 **/
public class Tree {
	private TreeNode root;
	
	public Tree(String name){
		this.root = new TreeNode(name);
	}
	
	public TreeNode getRoot(){
		return root;
	}
}
