package command;

/**
 * @author shadow
 * @Date 2016��8��7������8:48:11
 * @Fun  ����(Command)ģʽ	 ��Ϊģʽ	������ִ��  ����
 * 		 ���Զ������ӿڵ�ʵ���࣬������ʵ�ı����÷�����
 **/
public class MainTest {
	public static void main(String[] args) {
		//������ִ����
		Receiver receiver = new Receiver();
		//���ڵĸ��������
		ICommand command = new ConcreteCommand(receiver);
		//������
		Invoker invoker = new Invoker(command);
		invoker.invoke();
	}
}
/**
 * �ο����ͣ�http://www.cnblogs.com/zhenyulu/articles/69858.html
 * */
