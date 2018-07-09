package chainofresponsibility;

/**
 * @author shadow
 * @Date 2016��8��7������7:58:16
 * @Fun ��������
 **/
public abstract class IFilter {
	private IFilter successor;
	
	//��ȡ��һ������Ԫ
	public IFilter getSuccessor(){
		return successor;
	}
	//������һ������Ԫ
	public void setSuccessor(IFilter successor){
		this.successor = successor;
	}
	/**
	 * �����¼�
	 */
	public abstract void handleFilter();
	
	public abstract void handleFilter2();
}
