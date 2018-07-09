
package builder;
/**
 * ָ���ߣ�ָ�� ��� ����
 * @author shadow E-mail:zyydqpi@163.com
 * @Date 2016��8��20������7:29:25
 * @version 1.0
 * @since 
 **/
public class Director {
	private MazeBuilder builder;
	
	public Director(MazeBuilder builder) {
		// TODO Auto-generated constructor stub
		this.builder = builder;
	}
	
	/**
	 * ���췽���������˽��������
	 */
	public void construct(){
		builder.Buildmaze();
		builder.BuildRoom(1);
		builder.BuildRoom(2);
		builder.BuildDoor(1, 2);
	}
}
