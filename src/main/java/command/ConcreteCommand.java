package command;
/**
 * @author shadow
 * @Date 2016��8��7������8:44:23
 * @Fun  ����������ʵ��
 **/
public class ConcreteCommand implements ICommand {

	private Receiver receiver;
	
	public ConcreteCommand(Receiver receiver) {
		// TODO Auto-generated constructor stub
		this.receiver = receiver;
	}
	
	@Override
	public void execute() {
		// TODO Auto-generated method stub
		this.receiver.action();
	}

}
