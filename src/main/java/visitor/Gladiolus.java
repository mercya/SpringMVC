package visitor;
/**
 * @author shadow
 * @Date 2016��8��13������8:14:15
 * @Fun ����
 **/
public class Gladiolus implements Flower {

	@Override
	public void accept(Visitor v) {
		// TODO Auto-generated method stub
		v.visit(this);
	}

}
