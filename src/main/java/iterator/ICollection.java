package iterator;
/**
 * @author shadow
 * @Date 2016��8��7������9:10:13
 * @Fun  �Զ��弯�Ͻӿڣ�����java.util.Collection
 * 		 �������ݴ洢
 **/
public interface ICollection<T> {
	
	//���ص�����
	IIterator<T> iterator();
	
	void add(T t); 
	
	T get(int index);
	
	int size();
}
