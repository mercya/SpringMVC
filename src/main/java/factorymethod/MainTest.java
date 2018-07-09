
package factorymethod;

import model.base.Maze;

/**
 * @fun ��������ģʽ ���������ģʽ
 * @author shadow E-mail:zyydqpi@163.com
 * @Date 2016��8��23������7:10:22
 * @version 1.0
 * @since 
 **/
public class MainTest {
	public static void main(String[] args) {
		MazeGame game = new BombedMazeGame();
		Maze aMaze =  game.CreateMaze();
		System.out.println("" + aMaze.getRoomCount());
		aMaze.getRoom(1).Enter();
		
		game = new EnchantedMazeGame();
		aMaze = game.CreateMaze();
		System.out.println("" + aMaze.getRoomCount());
		aMaze.getRoom(1).Enter();
		
	}
}

/**
 * �Ƽ����ͣ�http://blog.csdn.net/hguisu/article/details/7505909
 * 
 * ���������
 * 	1.���ͻ�������Ҫ֪��Ҫʹ�ö���Ĵ������̡�
 *  2.���ͻ�����ʹ�õĶ�����ڱ䶯�Ŀ��ܣ����߸����Ͳ�֪��ʹ����һ������Ķ���
 * */
