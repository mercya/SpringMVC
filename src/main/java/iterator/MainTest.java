package iterator;
/**
 * @author shadow
 * @Date 2016��8��7������9:29:29
 * @Fun  ������(Iterator)ģʽ�ֽ����α�(Cursor)ģʽ
 * 		 �ṩһ�ַ�������һ������(container)�����и���Ԫ�أ����ֲ���Ҫ��¶�ö�����ڲ�ϸ�ڡ�
 * 		Iterator ģʽ���Ƿ����˼��϶���ı�����Ϊ�������һ���������������������ȿ�����������¶���ϵ��ڲ��ṹ���ֿ����ⲿ����͸���ķ��ʼ����ڲ������ݡ�
 *  	����Tree,HashSet�������ṩIterator
 * 
 *  	�����µĴ洢�ṹ����newһ��ICollection����Ӧ��new һ��IIterator��ʵ�����ı�����
 **/ 
public class MainTest {
	public static void main(String[] args) {
		ICollection<Integer> collection = new MyCollection<>();
		add(collection, 3, 5, 6, 8, 9, 10, 56, 96, 5);
		for(IIterator<Integer> iterator = collection.iterator(); iterator.hasNext();){
			System.out.println(iterator.next());
		}
		
		System.out.println("----------------------");
		
		ICollection<Object> collection2 = new MyCollection<>();
		add(collection2, "a", "b", "c", "d", 3, 5, 6, 7);
		for(IIterator<Object> iterator = collection2.iterator(); iterator.hasNext();){
			System.out.println(iterator.next());
		}
	}
	
	@SuppressWarnings("unchecked")
	static<T> void add(ICollection<T> c,T ...a){
		for(T t : a){
			c.add(t);
		}
	}
	/**
	 * �Ƽ����ͣ�http://blog.csdn.net/zhengzhb/article/details/7610745
	 * 
	 */
}
