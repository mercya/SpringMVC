package visitor;
/**
 * @author shadow
 * @Date 2016��8��13������8:15:25
 * @Fun  ���Ʒ���
 **/
public class StringVisitor implements Visitor {

	String s;
	
	public String toString(){
		return s;
	}
	
	@Override
	public void visit(Gladiolus g) {
		// TODO Auto-generated method stub
		s = "That's Gladiolus";
	}

	@Override
	public void visit(Chrysanthemum c) {
		// TODO Auto-generated method stub
		s = "That's Chrysanthemum";
	}

}
