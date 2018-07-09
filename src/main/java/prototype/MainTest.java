
package prototype;

import model.base.Door;
import model.base.Maze;
import model.base.Room;
import model.base.Wall;

import java.util.Iterator;

/**
 * @fun ԭ��ģʽ����<br/>
 * 		ע�����1.ʹ��ԭ��ģʽ���ƶ��󲻻������Ĺ��췽����<br/>
 * 			   2.�����ǳ������<br/>
 * @author shadow E-mail:zyydqpi@163.com
 * @Date 2016��8��26������7:13:54
 * @version 1.0
 * @since 
 **/
public class MainTest {
	public static void main(String[] args) throws CloneNotSupportedException {
		Maze maze = new Maze();
		Room room = new Room(1);
		Wall wall = new Wall();
		Door door = new Door(room, room);
		MazeGame game = new MazePrototypeFactory(maze, wall, room, door);
		//����ԭ�Ͷ���
		Maze maze2 = game.CreateMaze();
		
		System.err.println(maze.getRoomCount());
		System.err.println(maze2.getRoomCount());
		
		Iterator<Room> iterator = maze2.iterator();
		
		while(iterator.hasNext()){
			System.err.println("RoomNumber : " + iterator.next().getRoomNumber());
		}
	}
}
/**
 * �Ƽ����ͣ�http://blog.csdn.net/jason0539/article/details/23158081
 */
