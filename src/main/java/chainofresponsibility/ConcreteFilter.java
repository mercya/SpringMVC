package chainofresponsibility;
/**
 * @author shadow
 * @Date 2016��8��7������8:00:34
 * @Fun ��������
 **/
public class ConcreteFilter extends IFilter {

	private String name;
	
	public ConcreteFilter(String name) {
		// TODO Auto-generated constructor stub
		this.name = name;
	}
	
	@Override
	public void handleFilter() {
		// TODO Auto-generated method stub
		/**
		 * �Լ��ȴ������к���ߣ�����������һ�Ρ�
		 */
		System.out.println(name + " ����������");
		
		if(getSuccessor() != null){
			getSuccessor().handleFilter();
		}
	}

	@Override
	public void handleFilter2() {
		// TODO Auto-generated method stub
		/**
		 * �к���߾ͺ���ߴ��������Լ�����
		 */
		
		if(getSuccessor() != null){
			getSuccessor().handleFilter2();
		}else{
			System.out.println(name + " ����������");
		}
	}

}
