package observer;
/**
 * @author shadow
 * @Date 2016��8��12������7:39:54
 * @Fun  �۲���(Observer)ģʽ����Ϊ��ģʽ<br/>
 * 		 �۲���ģʽ������һ��һ�Զ��������ϵ���ö���۲��߶���ͬʱ�۲�ĳһ��Ŀ�����<br/>
 * 		���Ŀ�������״̬�Ϸ����仯ʱ����֪ͨ���й۲��߶����������ܹ��Զ������Լ�Ŀ���������Ҫ��ӡ��Ƴ���֪ͨ �۲��ߵĽӿڡ�<br/>
 **/
public class MainTest {
	public static void main(String[] args) {
		/**
		 * ʹ��Java�Դ���Observer�ӿں�Observable��
		 */
		UpdateObserver observer = new UpdateObserver();
		UpdateObservable observable = new UpdateObservable(observer);
		observable.setData(3);
		observable.setData(9);
		System.out.println();
		System.out.println();
		
		/**
		 * �Զ���Ĺ۲���ģ��
		 */
		IWathedSubject watched = new UpdateWatchedSubject();
		watched.add(new UpdateWatcher());
		watched.add(new UpdateWatcher());
		watched.add(new UpdateWatcher());
		watched.update();
		System.out.println();
		
		/**
		 * ��ģʽ-������
		 */
		User user = new User();
		user.register(new IRegisterListener() {
			
			@Override
			public void onRegistered() {
				// TODO Auto-generated method stub
				System.out.println("������ע���...");
			}
		});
		
		user.login(new ILoginListener() {
			
			@Override
			public void onLogined() {
				// TODO Auto-generated method stub
				System.out.println("��������¼��...");
			}
		});
	}
}
/**
 * �Ƽ����ͣ�http://blog.csdn.net/ai92/article/details/375691
 */
