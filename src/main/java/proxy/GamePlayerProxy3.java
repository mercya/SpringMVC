package proxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.util.Date;

/**
 * @author shadow
 * @Date 2016��8��6������9:17:48
 * @Fun  
 *      ��̬����ʹ��jdk�ṩ��InvocationHandler��������ñ��������ķ��������java.reflect.Proxy�����������<br/>
 * 
 *      ��̬���뱻���������InvocationHandler����handler�е�invokeʱ������ǿ���������ķ����Ĺ���<br/>
 *      ����˵�����������棺����ʲô�ط������ӵ㣩��ִ��ʲô��Ϊ��֪ͨ��<br/>
 *      GamePlayerProxy3���Ƿ�����Ϊloginʱ֪ͨ��ʼʱ�䣬upgradeʱ֪ͨ����ʱ�䡣<br/>
 */

public class GamePlayerProxy3 {
	private IGamePlayer gamePlayer;

	public GamePlayerProxy3(IGamePlayer gamePlayer) {
		// TODO Auto-generated constructor stub
		this.gamePlayer = gamePlayer;
	}

	public IGamePlayer getProxy() {
		return (IGamePlayer) Proxy.newProxyInstance(this.getClass().getClassLoader(), new Class[] { IGamePlayer.class },
				new MyInvocationHandler());
	}

	private class MyInvocationHandler implements InvocationHandler {

		@SuppressWarnings("deprecation")
		@Override
		public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
			// TODO Auto-generated method stub
			if (method.getName().equals("login")) {
				System.out.println("��¼ʱ���ǣ�" + new Date().toLocaleString());
			} else if (method.getName().equals("upgrade")) {
				System.out.println("����ʱ���ǣ�" + new Date().toLocaleString());
			}

			method.invoke(gamePlayer, args);
			return null;
		}

	}
}
