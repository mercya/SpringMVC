package chainofresponsibility;

/**
 * @author shadow
 * @Date 2016��8��7������8:06:44
 * @Fun  ������(Chain of Responsibility)ģʽ	��Ϊģʽ
 * 		 ������һ��һ�����ݸ�����ߣ�ֱ��ĳһ������ߴ�������Ϊ�����ڣ����εĴ��ݣ���Ҫ��һ����һ����
 **/
public class MainTest {
	public static void main(String[] args) {
		//Ȩ�޹���
		IFilter filter1 = new ConcreteFilter("permission-filter");
		
		//��׺����
		IFilter filter2 = new ConcreteFilter("suffix-filter");
		
		//������
		IFilter filter3 = new ConcreteFilter("style-filter");
		
		//��Ů����
		IFilter filter4 = new ConcreteFilter("beauty-filter");
		filter1.setSuccessor(filter2);
		filter2.setSuccessor(filter3);
		filter3.setSuccessor(filter4);
		System.out.println("----������ÿһ�������ߣ���������ߣ��������ˣ�˳��Ҳ��һ��һ���Ĵ���----");
		filter1.handleFilter();
		
		System.out.println("---�����ǽ������һ������ߴ���----");
		filter1.handleFilter2();
	}
}
