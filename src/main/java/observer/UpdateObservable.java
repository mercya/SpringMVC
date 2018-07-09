package observer;

import java.util.Observable;
import java.util.Observer;

/**
 * @author shadow
 * @Date 2016��8��12������7:29:31
 * @Fun �۲�Ŀ��
 **/
public class UpdateObservable extends Observable {
	private int data;
	
	public UpdateObservable(Observer obserer) {
		// TODO Auto-generated constructor stub
		addObserver(obserer);
	}
	
	public int getData(){
		return this.data;
	}
	
	public void setData(int data){
		if(data != this.data){
			this.data = data;
			//��� �ı� ֻ�б�Ǻ����֪ͨ��
			setChanged();
			//֪ͨ
			notifyObservers();
		}
	}
}
