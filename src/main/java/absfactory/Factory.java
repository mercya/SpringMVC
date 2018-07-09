package absfactory;
/**
 * @author shadow
 * @Date 2016��8��18������7:07:15
 * @Fun  ʵ�幤�� ����ʵ���Ʒ����������Ϊ�����Ʒ
 **/
public class Factory implements IFactory {

	@Override
	public IProduct1 createProduct1A() {
		// TODO Auto-generated method stub
		return new GradeProduct1A();
	}

	@Override
	public IProduct1 createProduct1B() {
		// TODO Auto-generated method stub
		return new GradeProduct1B();
	}

	@Override
	public IProduct2 createProduct2A() {
		// TODO Auto-generated method stub
		return new GradeProduct2A();
	}

	@Override
	public IProduct2 createProduct2B() {
		// TODO Auto-generated method stub
		return new GradeProduct2B();
	}

}
