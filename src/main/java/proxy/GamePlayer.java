package proxy;
/**
 * @author shadow
 * @Date 2016��8��6������9:07:59
 * @Fun �������
 **/
public class GamePlayer implements IGamePlayer {

	private String name = "";
	
	public GamePlayer(String name) {
		// TODO Auto-generated constructor stub
		this.name = name;
	}
	
	@Override
	public void login(String user, String password) {
		// TODO Auto-generated method stub
		System.out.println("��¼��Ϊ" + user + "�Ľ�ɫ " + this.name + " ��¼�ɹ���");
	}

	@Override
	public void killBoss() {
		// TODO Auto-generated method stub
		System.out.println(this.name + " �ڴ�֣�");
	}

	@Override
	public void upgrade() {
		// TODO Auto-generated method stub
		System.out.println(this.name + " ������һ����");
	}

}
