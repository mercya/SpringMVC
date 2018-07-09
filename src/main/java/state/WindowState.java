package state;
/**
 * @author shadow
 * @Date 2016��8��12������8:34:09
 * @Fun
 **/
public class WindowState {
	private String stateValue;
	
	public WindowState(String stateValue){
		this.stateValue = stateValue;
	}
	
	public String getStateValue(){
		return this.stateValue;
	}
	
	public void setStateValue(String stateValue){
		this.stateValue = stateValue;
	}
	
	public void handle(){
		if("����".equals(stateValue)){
			switchWindow();
			this.stateValue = "ȫ��";
		}else if("ȫ��".equals(stateValue)){
			switchFullscreen();
			this.stateValue = "����";
		}
	}
	
	private void switchWindow(){
		System.out.println("�л�Ϊ����״̬");
	}
	
	private void switchFullscreen(){
		System.out.println("�л�Ϊȫ��״̬");
	}
}
