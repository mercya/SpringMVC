package observer;
/**
 * @author shadow
 * @Date 2016��8��12������8:02:58
 * @Fun  ������ �ǹ۲���ģʽ��һ��ʵ��
 * 		 һЩ��Ҫ������ҵ��ӿ������ �����������ü���������Ӧ������ʵ�ּ�����
 **/
public class User {
	public void register(IRegisterListener register){
		/**
		 * do ... register
		 */
		System.out.println("����ע����....");
		//ע���
		register.onRegistered();
	}
	
	public void login(ILoginListener login){
		/**
		 * do ... login
		 */
		System.out.println("���ڵ�¼��....");
		//��¼��
		login.onLogined();
	}
}
