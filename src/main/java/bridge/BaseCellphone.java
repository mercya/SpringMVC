package bridge;
/**
 * @author shadow
 * @Date 2016��8��4������7:42:45
 * @Fun �ֻ���
 **/
public abstract class BaseCellphone {
	
	private BaseCellphoneShell shell;
	
	public void setShell(BaseCellphoneShell shell){
		this.shell = shell;
	}
	
	public BaseCellphoneShell getShell(){
		return this.shell;
	}
	
	//��Ӧ���ֿ�
	public abstract void mapping();
}
