package interpreter;
/**
 * @author shadow
 * @Date 2016��8��7������9:00:03
 * @Fun
 **/
public class XmlDomInterpreter implements Interpreter {
	@Override
	public void interpreter(Context context) {
		// TODO Auto-generated method stub
		System.out.println("xml dom Interpreter : " + context.getData());
	}
}
