package iterator;
/**
 * @author shadow
 * @Date 2016��8��7������9:10:56
 * @Fun �Զ���������ӿ� ����java.util.Iterator
 * 		���ڱ���������ICollection������
 **/
public interface IIterator<T> {
	boolean hasNext();
	boolean hasPrevious();
	
	T next();
	T previous();
}
