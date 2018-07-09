package memento;
/**
 * @author shadow
 * @Date 2016��8��8������8:26:30
 * @Fun  ����¼(Memento)ģʽ   ��Ϊģʽ
 * 	 	 ���̣�Memento���ڱ��� ����״̬
 * 			Originator���ڼ������ݣ�����Memento���󣬼�ͨ��Memento�ָ�ԭʼ����
 **/
public class MainTest {
	public static void main(String[] args) {
		//�������ݶ���		
		DataState state = new DataState();
		state.setAction("copy a character");
		//
		Originator originator = new Originator();
		System.out.println("����ԭʼ����");
		originator.setState(state);
		Memento memento = originator.getMemento();
		System.out.println(memento.getState());
		
		System.out.println("��������¼���󣬱���ԭʼ����״̬");
		originator.setState(new DataState());
		
		System.out.println("������һ��������");
		originator.setState(new DataState());
		
		System.out.println("���������ݺ�" + originator.getState().getAction());
		
		/**
		 * memento ��Ҫ������ĳ�أ���Ҫʱȡ�����Իָ����ڲ������������
		 */
		System.out.println("���������ݺ󣬻ָ�ԭ����");
		originator.setMemento(memento);
		System.out.println(originator.getState().getAction());
	}
}

/**
 * �Ƽ����ͣ�http://blog.csdn.net/zhengzhb/article/details/7697549
 */
