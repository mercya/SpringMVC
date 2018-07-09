package decorator;
/**
 * @author shadow
 * @Date 2016��8��4������9:27:28
 * @Fun
 **/
public class BufferedReader implements IReader {

	private IReader mReader;
	public BufferedReader(IReader reader) {
		// TODO Auto-generated constructor stub
		this.mReader = reader;
	}
	
	@Override
	public void read() {
		// TODO Auto-generated method stub
		System.out.println("read of BufferedReader.");
		mReader.read();
	}

}
