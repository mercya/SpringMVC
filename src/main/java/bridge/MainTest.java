package bridge;
/**
 * @author shadow
 * @Date 2016��8��4������7:47:27
 * @Fun �Žӣ�Bridge��ģʽ���ǽṹ��ģʽ
 * 
 * 		����������ʵ����ź��ʹ�ö��߿��Զ����ı仯��Ҳ����˵������֮���ǿ���������������
 * 		Ҳ����ָ��һ�����ϵͳ�ĳ��󻯺�ʵ�ֻ�֮��ʹ�����/�ۺϹ�ϵ�������Ǽ̳й�ϵ���Ӷ�ʹ���߿��Զ����ĸı䡣
 **/
public class MainTest {
	public static void main(String[] args) {
		BaseCellphone cellphone = new CellPhone();
		cellphone.setShell(new CellphoneShell());
		cellphone.mapping();
	}
}
/**
 * @Date 2016��8��20��19:07:14
 * 
 * �ŵ㣺1.����ӿڼ���ʵ�֡�
 * 	   2.��߿������ԡ�
 * 	   3.ʵ��ϸ�ڶԿͻ�͸����
 * �ο����ͣ�http://blog.csdn.net/jason0539/article/details/22568865
 */

