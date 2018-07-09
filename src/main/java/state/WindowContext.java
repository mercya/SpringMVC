package state;
/**
 * @author shadow
 * @Date 2016��8��12������8:39:00
 * @Fun  ״̬��ʹ��
 **/
public class WindowContext {
	private WindowState state;
	
	public WindowContext(WindowState state){
		this.state = state;
	}
	
	public WindowState getState(){
		return state;
	}
	
	public void setState(WindowState state){
		this.state = state;
	}
	
	public void switchState(){
		this.state.handle();
	}
}
