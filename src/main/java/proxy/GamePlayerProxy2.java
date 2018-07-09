package proxy;

import java.util.Date;

/**
 * @author shadow
 * @Date 2016��8��6������9:14:10
 * @Fun �ͻ��� �Ա�������󲻿ɼ�<br/>
 * 		���������ǿ�˱��������Ĺ���<br/>
 **/
public class GamePlayerProxy2 implements IGamePlayer {

	private IGamePlayer gamePlayer = null;
	
	public GamePlayerProxy2(String userName) {
		// TODO Auto-generated constructor stub
		this.gamePlayer = new GamePlayer(userName);
	}
	
	@SuppressWarnings("deprecation")
	@Override
	public void login(String user, String password) {
		// TODO Auto-generated method stub
		System.out.println("��¼ʱ���ǣ�" + new Date().toLocaleString());
		this.gamePlayer.login(user, password);
	}

	@Override
	public void killBoss() {
		// TODO Auto-generated method stub
		this.gamePlayer.killBoss();
	}

	@SuppressWarnings("deprecation")
	@Override
	public void upgrade() {
		// TODO Auto-generated method stub
		this.gamePlayer.upgrade();
		System.out.println("����ʱ���ǣ�" + new Date().toLocaleString());
	}

}
