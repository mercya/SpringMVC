package mediator;
/**
 * @author shadow
 * @Date 2016��8��8������7:10:09
 * @Fun �н顢����ʵ������Ҫ����������Ԫ�أ����������
 **/
public class Mediator implements IMediator {

	private XmlCode xmlCode;
	private XmlPreview xmlPreview;
	
	@Override
	public void creareMediator() {
		// TODO Auto-generated method stub
		this.xmlCode = new XmlCode();
		this.xmlPreview = new XmlPreview();
	}

	@Override
	public void work() {
		// TODO Auto-generated method stub
		this.xmlCode.work();
		this.xmlPreview.work(); 
	}

}
