package composite;

import java.util.List;

/**
 * @author shadow
 * @Date 2016��8��4������8:06:20
 * @Fun  ���(Composite)ģʽ���ֽ�������--����ģʽ<br/>
 * 		 ��ʹ���ǲ㼶�����νṹ�������У�ģ���˼�Ԫ�غ͸���Ԫ�صĸ���ͻ�������������Ԫ��һ����������Ԫ�أ�<br/>
 * 		�Ӷ�ʹ�ÿͻ������븴��Ԫ�ص��ڲ��ṹ���<br/>
 * 
 * 		�������������Compositeģʽ��<br/ >
 * 			1.�����ʾ����Ĳ���--�����νṹ��<br/>
 * 			2.��ϣ���û�������϶����뵥������Ĳ�ͬ���û���ͳһ��ʹ����Ͻṹ�е����ж���
 **/
public class MainTest {
	public static void main(String[] args) {
		//Tree�����ʹ��
//		Tree treeA = new Tree("A");
//		treeA.getRoot().add(new TreeNode("B"));
//		treeA.getRoot().add(new TreeNode("C"));
//		treeA.getRoot().add(new TreeNode("D"));
//		
//		TreeNode treeNodeE = new TreeNode("E");
//		treeNodeE.add(new TreeNode("E01"));
//		treeNodeE.add(new TreeNode("E02"));
//		treeA.getRoot().add(treeNodeE);
//		
//		treeA.getRoot().add(new TreeNode("F"));
//		
//		
//		print(treeA.getRoot());
		
		TreeNode treeA = new TreeNode("A");
		treeA.add(new TreeNode("B"));
		treeA.add(new TreeNode("C"));
		TreeNode treeNodeD = new TreeNode("D");
		treeNodeD.add(new TreeNode("D01"));
		treeNodeD.add(new TreeNode("D02"));
		treeA.add(treeNodeD);
		
		print(treeA);
		
		/**
		 * ����ʾ�����ļ�ϵͳ��Ŀ¼���ļ������������ֿ��õݹ�����Ľṹ����һ��������ܱ�ʾ���������壬�����������ģʽ��
		 */
	}
	
	public static void print(TreeNode root){
		if(root == null){
			return;
		}
		System.err.println(root.getName());
		print(root.getChildren());
		
	}
	
	public static void print(List<TreeNode> children){
		if(children == null || children.size() <= 0){
			return;
		}
		
		for(int i = 0; i < children.size(); i++){
			System.out.println(children.get(i).getName());
			print(children.get(i).getChildren());
		}		
	}
}
/**
 * �Ƽ����ͣ�http://blog.csdn.net/hguisu/article/details/7530783
 * */
