package observer;

import java.util.Observable;
import java.util.Observer;

/**
 * @author shadow
 * @Date 2016��8��12������7:38:19
 * @Fun �۲���
 **/
public class UpdateObserver implements Observer {

	@Override
	public void update(Observable o, Object arg) {
		// TODO Auto-generated method stub
		System.out.println("���ܵ����ݱ仯��֪ͨ��");
		
		if(o instanceof UpdateObservable) {
			UpdateObservable uObservable = (UpdateObservable)o;
			System.out.println("���ݱ��Ϊ��" + uObservable.getData());
		}
		
	}

}
