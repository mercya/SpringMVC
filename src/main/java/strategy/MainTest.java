package strategy;

/**
 * @author shadow
 * @Date 2016��8��12������9:04:53
 * @Fun ����(Strategy)ģʽ ������Ϊ�� ��ע����Ϊ��ѡ��<br/>
 *      Ҳ��Ϊ����ģʽ(Policy)�� ��װ��һϵ�в��Զ����û���ѡ��ʹ�����ֲ��Զ���<br/>
 *      ��򵥹��������� ����ģʽ��������Զ����Context����Context��װ���Զ���ķ������ã����⹫��Context�ķ����ӿ�<br/>
 *      �򵥹���ģʽ������һ���򵥵Ĳ�������������Ȼ����ó�������ķ���<br/>
 *      ��װ��ģʽ������Context����ʵ��(Implements)ҵ��ӿڣ�����Ҫ��ǿ���еĲ��Զ���Ĺ��ܡ�<br/>
 *      ����ģʽ�������㷨����ϵͳ�У����繤�ʽ��㡣<br/>
 **/
public class MainTest {
	public static void main(String[] args) {
		double money = 998;
		CashContext cashContext = new CashContext(new CashNormal());
		System.out.println("ԭ�ۣ�" + cashContext.acceptCash(money));

		cashContext.setCasher(new CashRebate(8.5));
		System.out.println("��85�ۣ�" + cashContext.acceptCash(money));

		cashContext.setCasher(new CashReturn(300, 50));
		System.out.println("��300��50��" + cashContext.acceptCash(money));
	}
}
/**
 * �������ܽ᣺<br/>
 * 1������ģʽ��һ���Ƚ���������ʹ�õ����ģʽ������ģʽ�Ƕ��㷨�ķ�װ�������㷨�����κ��㷨����ָ��ί�ɸ���ͬ�Ķ������<br/>
 * 	����ģʽͨ����һ��ϵ�е��㷨��װ��һϵ�еĲ��������棬��Ϊһ���������������ࡣ��һ�仰��˵�����ǡ�׼��һ���㷨������ÿһ���㷨��װ������ʹ�����ǿ��Ի�������<br/>
 * 2���ڲ���ģʽ�У�Ӧ���ɿͻ����Լ�������ʲô�����ʹ��ʲô������Խ�ɫ��<br/>
 * 3������ģʽ������װ�㷨���ṩ���㷨���뵽����ϵͳ�У��Լ����㷨��ϵͳ�С����ݡ��ķ��㣬����ģʽ���������ں�ʱʹ�ú����㷨���㷨��ѡ���ɿͻ�����������<br/>
 * 	����һ���̶��������ϵͳ������ԣ����ǿͻ�����Ҫ������о��������֮��������Ա�ѡ����ʵ��㷨����Ҳ�ǲ���ģʽ��ȱ��֮һ��<br/>
 * 	��һ���̶��������˿ͻ��˵�ʹ���Ѷȡ�<br/>
 **/

/**
 * �Ƽ����ͣ�http://design-patterns.readthedocs.io/zh_CN/latest/behavioral_patterns/strategy.html
 * */
 