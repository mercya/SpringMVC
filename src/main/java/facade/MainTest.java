package facade;
/**
 * @author shadow
 * @Date 2016��8��4������9:49:14
 * @Fun  ���(Facade)ģʽ
 * 		 �򵥵�˵���ǽ�����������֮�����϶ȣ�ʹ��һ��Facade��������ԭ��������á���ʹ�õ�Ƶ����ʵ�ǳ��ĸߣ�����̬������ʵ������Щ���ƣ�
 * 		��ͬ���ǣ����ģʽ�п��Գ��ж��ʵ���������ã��������ʵ��ҵ���ܡ�
 **/
public class MainTest {
	public static void main(String[] args) {
		/**
		 * �����ʹ�����ģʽ����ô��Actor��Scene��������һ����Ҫ���жԷ�������
		 * ����Ҫ����µľ��幦����ʱ��ֻ��Ҫ��Facade�����һ�����ã�����Ӧ�����ں�����ʹ�ü��ɡ�
		 */
		Facade facade = new Facade();
		facade.startGame();
		System.out.println("-------");
		facade.endGame();
	}
}

/**
 * �Ƽ����ͣ�http://blog.csdn.net/hguisu/article/details/7533759
 * */
