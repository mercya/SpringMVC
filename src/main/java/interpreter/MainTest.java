package interpreter;
/**
 * @author shadow
 * @Date 2016��8��7������9:02:19
 * @Fun	 ������(Interpreter)ģʽ
 * 		����һ�����ԣ����������ķ���һ�ֱ�ʾ��������һ�����������ý�����ʹ�øñ�ʾ�����������о��ӡ�		��Ϊ��ģʽ
 * 		Ӧ�ó��ϣ����������������ʽ�����Թ淶������
 * 		������ģʽ��ʵ�ʵ�ϵͳ������ʹ�õķǳ��٣���Ϊ��������Ч�ʡ������Լ�ά�������⡣
 **/
public class MainTest {
	public static void main(String[] args) {
		Context context = new Context();
		context.setData("һ��XML����");
		new XmlDomInterpreter().interpreter(context);
		new XmlDomInterpreter().interpreter(context);
	}
}
/**
 * �Ƽ����ͣ�http://blog.csdn.net/zhengzhb/article/details/7666020
 */