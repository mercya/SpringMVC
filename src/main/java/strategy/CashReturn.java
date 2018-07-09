package strategy;
/**
 * @author shadow
 * @Date 2016��8��12������8:58:25
 * @Fun  ���ֲ���
 **/
public class CashReturn implements ICashSuper {

	//���ֵ��޽��
	private double moneyCondition;
	//���ֽ��
	private double returnMoney;
	
	public CashReturn(double moneyCondition, double returnMoney) {
		// TODO Auto-generated constructor stub
		this.moneyCondition = moneyCondition;
		this.returnMoney = returnMoney;
	}
	
	//���ط���
	@Override
	public double acceptCash(double money) {
		// TODO Auto-generated method stub
		if(money >= moneyCondition){
			return money - Math.floor(money / moneyCondition) * returnMoney;
		}
		return 0;
	}

}
