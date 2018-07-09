package prototype;

import model.base.Door;
import model.base.Maze;
import model.base.Room;
import model.base.Wall;

/**
 * @author shadow
 * @Date 2016��7��30������6:52:27
 * @Fun ԭ�����ģʽ	���������ģʽ<br/>
 * 		��ԭ��ʵ��ָ��������������࣬����ͨ��������Щԭ�ʹ����µĶ���<br/>
 *		Prototypeԭ��ģʽ��һ�ִ��������ģʽ��Prototypeģʽ����һ�������ٴ�������һ���ɶ��ƵĶ��󣬸�������֪���κ���δ�����ϸ��<br/>
 *		����ԭ��ͨ����һ��ԭ�Ͷ��󴫸��Ǹ�Ҫ���������Ķ������Ҫ���������Ķ���ͨ������ԭ�Ͷ��󿽱������Լ���ʵʩ������<br/>
 *		��java������Ϊclone()����<br/>
 *		
 **/
public class MazePrototypeFactory extends MazeGame {

	public MazePrototypeFactory(Maze maze, Wall wall, Room room, Door door) {
		this.prototypeMaze = maze;
		this.prototypewall = wall;
		this.prototypeRoom = room;
		this.prototypeDoor = door;
	}

	@Override
	public Maze MakeMaze() throws CloneNotSupportedException {
		// TODO Auto-generated method stub
		return this.prototypeMaze.clone();
	}

	@Override
	public Room MakeRoom(int number) throws CloneNotSupportedException {
		// TODO Auto-generated method stub
		Room room = this.prototypeRoom.clone();
		room.Initialize(number);
		return room;
	} 

	@Override
	public Wall MakeWall() throws CloneNotSupportedException {
		// TODO Auto-generated method stub
		return this.prototypewall.clone();
	}

	@Override
	public Door MakeDoor(Room room1, Room room2) throws CloneNotSupportedException {
		// TODO Auto-generated method stub
		Door door = this.prototypeDoor.clone();
		door.Initialize(room1, room2);
		return null;
	}

	@Override
	public int GetRoomCount() {
		// TODO Auto-generated method stub
		return 0;
	}

	private Maze prototypeMaze;
	private Room prototypeRoom;
	private Wall prototypewall;
	private Door prototypeDoor;

}
