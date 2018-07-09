package strategy;
/**
 * @author shadow
 * @Date 2016��8��12������9:02:11
 * @Fun  ���ݴ��ݵĲ����ִ࣬����Ӧ����Ϊ��
 **/
public class CashContext {
	private ICashSuper casher;
	
	public CashContext() {
		// TODO Auto-generated constructor stub
	}
	
	public CashContext(ICashSuper casher){
		this.casher = casher;
	}
	
	public void setCasher(ICashSuper casher){
		this.casher = casher;
	}
	
	//���ݾ���Ĳ��Զ��󣬵��������㷨��Ϊ
	public double acceptCash(double money){
		return this.casher.acceptCash(money);
	}
}
