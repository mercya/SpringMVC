package visitor;
/**
 * @author shadow
 * @Date 2016��8��13������8:17:10
 * @Fun  �۷����
 **/
public class BeeVisitor implements Visitor {

	@Override
	public void visit(Gladiolus g) {
		// TODO Auto-generated method stub
		System.out.println("�۷������ʣ�" + g.getClass().getName());
	}

	@Override
	public void visit(Chrysanthemum c) {
		// TODO Auto-generated method stub
		System.out.println("�۷������ʣ�" + c.getClass().getName());
	}
	
}
