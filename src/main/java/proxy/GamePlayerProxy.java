package proxy;
/**
 * @author shadow
 * @Date 2016��8��6������9:11:26
 * @Fun  ��Ҵ���<br/>
 * 		  ��ͨ�ľ�̬�����ͻ��˲�֪������������ɴ����������书�ܵĵ���<br/>
 **/
public class GamePlayerProxy implements IGamePlayer {

	//���������
	private IGamePlayer gamePlayer = null;
	
	//ͨ�����캯������Ҫ��˭���д���
	public GamePlayerProxy(String userName) {
		// TODO Auto-generated constructor stub
		this.gamePlayer = new GamePlayer(userName);
	}
	
	@Override
	public void login(String user, String password) {
		// TODO Auto-generated method stub
		this.gamePlayer.login(user, password);
	}

	@Override
	public void killBoss() {
		// TODO Auto-generated method stub
		this.gamePlayer.killBoss();
	}

	@Override
	public void upgrade() {
		// TODO Auto-generated method stub
		this.gamePlayer.upgrade();
	}

}
