package memento;

import java.io.Serializable;

/**
 * @author shadow
 * @Date 2016��8��8������8:00:53
 * @Fun һ��������һ�������ڲ�״̬�����Ķ��������Ժ�Ϳ��Խ��ö���ָ���ԭ�ȱ����״̬��
 **/
public class Memento implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 8121679932355414767L;
//	
//	private int number;
//	private File file = null;
	
	private DataState state;
	
	public Memento(Originator o){
		this.state = o.getState();
	}
	
	public DataState getState(){
		return this.state;
	}
	
	public void setState(DataState state){
		this.state = state;
	}
}
