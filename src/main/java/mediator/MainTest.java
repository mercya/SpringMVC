package mediator;
/**
 * @author shadow
 * @Date 2016��8��8������7:45:56
 * @Fun	 �н���(Mediator)ģʽ  Mediator����˼���н��ߣ������ߣ����������˼�壬���ģʽ�ڹ����б�Ȼ����һ���н飬
 * 		���ڣ����ݵĹ����н���ʹ��������Ҫ��ʽ���໥���ã��Ӷ�ʹ�������ɢ�����ҿ��Զ����ظı�����֮��Ľ�����
 **/
public class MainTest {
	public static void main(String[] args) {
		IMediator mediator = new Mediator();
		//�ڲ�����Ԫ�أ�ά��Ԫ��
		mediator.creareMediator();
		//ִ���ڲ�Ԫ�ص�work�ӿ�
		mediator.work();
	}
}
/**
 * �Ƽ�ģ�飺http://blog.csdn.net/zhengzhb/article/details/7430098
 */