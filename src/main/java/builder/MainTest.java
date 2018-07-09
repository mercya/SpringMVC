
package builder;

import absfactory.MazeFactory;

/**
 * ������(Builder)ģʽ�Ǵ�����ģʽ��������һ���������ش������̵Ĳ�Ʒ��ʹ����ϵķ�ʽ����ָ����(Director)��������������̡�
 * 
 * ������ģʽ�������ֲ�Ʒ�����������й��������������϶���
 * 
 * ��һ�����Ӷ���Ĺ��������ı�ʾ���룬ʹͬ���Ĺ������̿��Դ�����ͬ�ı�ʾ�����������ģʽ����Ϊ������ģʽ��
 *	
 * @author shadow E-mail:zyydqpi@163.com
 * @Date 2016��8��20������7:16:44
 * @version 1.0
 * @since 
 **/
public class MainTest {
	public static void main(String[] args) {
		MazeFactory factory = new MazeFactory();
		MazeBuilder builder = new StandardMazeBuilder(factory);
		Director director = new Director(builder);
		director.construct();
		System.out.println(builder.currentMaze.getRoomCount());
	}
}

/**
 * �ο����ͣ�http://blog.csdn.net/jason0539/article/details/44992733
 * */
