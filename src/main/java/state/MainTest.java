package state;
/**
 * @author shadow
 * @Date 2016��8��12������8:42:27
 * @Fun  ״̬(State)ģʽ  ��Ϊģʽ
 * 	     �ȸı�����״̬���ָı�������Ϊ���������� ����״̬�ı���Ϊ��
 **/
public class MainTest {
	/**
	 * ������״ֵֻ̬����������״̬��������ƣ�Ҳ���԰�״ֵ̬�Ŀ��ƣ����ɿͻ��������á�
	 */
	public static void main(String[] args) {
		WindowContext context = new WindowContext(new WindowState("����"));
		context.switchState();
		context.switchState();
		context.switchState();
	}	
}
/**
 * �Ƽ����ͣ�http://www.cnblogs.com/java-my-life/archive/2012/06/08/2538146.html
 */
