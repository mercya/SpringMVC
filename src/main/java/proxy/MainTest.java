package proxy;

import java.util.Date;

/**
 * @author shadow
 * @Date 2016��8��6������9:24:31
 * @Fun  ����ģʽ	(�ṹ��ģʽ)��Ϊ���������ṩһ�ִ����Կ��ƶ��������ķ��ʡ� <br/>
 * 		 ��ĳЩ����£�һ�������ʺϻ��߲���ֱ��������һ�����󣬶������������ڿͻ��˺�Ŀ�����֮�����н�����á�<br/>
 * <p>
 * �ŵ㣺<br/>
 * 		1.ְ������:��ʵ�Ľ�ɫ����ʵ��ʵ�ʵ�ҵ���߼������ù��������Ǳ�ְ������ͨ�����ڵĴ������һ��������񣬸����Ľ�����Ǳ�̼��������<br/>
 * 		2.�����������ڿͻ��˺�Ŀ�����֮�����н�����ã��������˷���ͻ����û������úͱ�����Ŀ���������á�<br/>
 * 		3.����չ�ԡ�<br/>
 * </p>
 * 
 * <p>
 * ģʽ�ṹ��<br/>
 * 		һ������������Ҫ���ʵĶ���Ŀ���ࣩ��һ���Ǵ����������������������ʵ��ͬһ���ӿڣ��ȷ��ʴ������ٷ�������Ҫ���ʵĶ���<br/>  
 * 		��װ����ģʽ�ʹ���ģʽ֮�仹���кܶ���ġ�װ����ģʽ��ע����һ�������϶�̬����ӷ�����Ȼ������ģʽ��ע�ڿ��ƶԶ���ķ��ʡ�<br/>
 * 		�ô���ģʽ�������ࣨproxy class�����Զ����Ŀͻ�����һ������ľ�����Ϣ����ˣ���ʹ�ô���ģʽ��ʱ�����ǳ�����һ���������д���һ�������ʵ����<br/>
 * 		��װ����ģʽ��ʱ������ͨ���������ǽ�ԭʼ������Ϊһ����������װ���ߵĹ�������<br/>
 * 		ʹ�ô���ģʽ���������ʵ����֮��Ĺ�ϵͨ���ڱ���ʱ���Ѿ�ȷ���ˣ���װ�����ܹ�������ʱ�ݹ�ر����졣<br/>
 * </p>
 **/
public class MainTest {
	@SuppressWarnings("deprecation")
	public static void main(String[] args) {
		/**
		 * ��ͨ�ľ�̬�����ͻ��˲�֪������������ɴ����������书�ܵĵ���
		 */
		IGamePlayer proxy = new GamePlayerProxy("x");
		System.out.println("��ʼʱ���ǣ�" + new Date().toLocaleString());
		proxy.login("zz", "zz");
		proxy.killBoss();
		proxy.upgrade();
		System.out.println("����ʱ���ǣ�"+ new Date().toLocaleString());
		
		System.out.println();
		
		/**
		 * ���������ǿ�˱��������Ĺ���
		 */
		IGamePlayer proxy2 = new GamePlayerProxy2("y");
		proxy2.login("zhao", "y");
		proxy2.killBoss();
		proxy2.upgrade();
		
		System.out.println();
		
		/**
		 * ��̬����ʹ��jdk�ṩ��InvocationHandler��������ñ��������ķ��������java.reflect.Proxy�����������
		 * 
		 * ��̬���뱻���������InvocationHandler����handler�е�invokeʱ������ǿ���������ķ����Ĺ���
		 * ����˵�����������棺����ʲô�ط������ӵ㣩��ִ��ʲô��Ϊ��֪ͨ��
		 * GamePlayerProxy3���Ƿ�����Ϊloginʱ֪ͨ��ʼʱ�䣬upgradeʱ֪ͨ����ʱ�䡣
		 */
		GamePlayerProxy3 dynamic = new GamePlayerProxy3(new GamePlayer("z"));
		IGamePlayer dynamicPlayer = dynamic.getProxy();
		dynamicPlayer.login("some", "jone");
		dynamicPlayer.killBoss();
		dynamicPlayer.upgrade();
		
		System.out.println();
		/**
		 * �������棺һЩ���Ƶ�ҵ���߼���Ҫ�����ڶ�ĵط������ǾͿ��԰�����ȡ�������У�����Ҳ�����������棺����־���棬Ȩ�����棬ҵ�����档
		 */
	}
}
/**
 * �Ƽ����ͣ�http://blog.csdn.net/jackiehff/article/details/8621517
 */