package observer;
/**
 * @author shadow
 * @Date 2016��8��12������7:44:53
 * @Fun	 ����Ŀ�� Subject<br/>
 * 		�ṩע���ɾ���۲��߶���Ľӿڣ��Լ�֪ͨ�۲��߽��й۲�Ľӿڼ�Ŀ�� �����۲��ҵ��Ľӿڡ�<br/>
 **/
public interface IWathedSubject {
	
	void add(IWatcher watcher);
	
	void remove(IWatcher watcher);
	
	void notifyWatchers();
	
	//���۲�ҵ��仯�Ľӿ�
	void update();
}
