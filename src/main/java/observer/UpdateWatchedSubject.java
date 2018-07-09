package observer;

import java.util.ArrayList;
import java.util.List;

/**
 * @author shadow
 * @Date 2016��8��12������7:50:13
 * @Fun  ���屻�۲���Ŀ��
 **/
public class UpdateWatchedSubject implements IWathedSubject {

	private List<IWatcher> list;
	
	public UpdateWatchedSubject() {
		// TODO Auto-generated constructor stub
		this.list = new ArrayList<>();
	}
	@Override
	public void add(IWatcher watcher) {
		// TODO Auto-generated method stub
		this.list.add(watcher);	
	}

	@Override
	public void remove(IWatcher watcher) {
		// TODO Auto-generated method stub
		this.list.add(watcher);
	}

	@Override
	public void notifyWatchers() {
		// TODO Auto-generated method stub
		for(IWatcher watcher : list){
			watcher.update();
		}
	}

	@Override
	public void update() {
		// TODO Auto-generated method stub
		System.out.println("Ŀ�������....");
		notifyWatchers();
	}

}
