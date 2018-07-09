package singleton;
/**
 * @author shadow
 * @Date 2016��7��30������8:01:22
 * @Fun  ����ģʽ
 **/
public class MazeFactory {
	private static MazeFactory instance;
	private MazeFactory(){
		
	}
	
	public static MazeFactory getInstance(){
		if(instance == null){
			synchronized (MazeFactory.class) {
				if(instance == null){
					instance = new MazeFactory();
				}
			}
		}
		
		return instance;
	}
	
}
