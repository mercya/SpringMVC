package visitor;
/**
 * @author shadow
 * @Date 2016��8��13������8:13:05
 * @Fun	�ջ�
 **/
public class Chrysanthemum implements Flower {

	@Override
	public void accept(Visitor v) {
		// TODO Auto-generated method stub
		v.visit(this);
	}

}
