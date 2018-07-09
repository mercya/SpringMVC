package flyweight;
/**
 * @author shadow
 * @Date 2016��8��5������8:10:16
 * @Fun	 ��Ԫ(Flyweight)ģʽ  �ṹģʽ	��ҪĿ����ʵ�ֶ���Ĺ���<br/>
 * 		 �����Ͽ�����һ��  ����Ԫ����ģʽ����ϵͳ����Ҫ�ظ�ʹ�õĶ��󣬹���ɵ���Ԫ����<br/>
 * 
 * 		<p>��JDBC���ݿ����ӳء��̳߳ص� ����Ӧ������Ԫģʽ<br/>
 * 			���ݿ����ӳأ�������һ�����������ӣ�������У��õ�ʱȡ�����ͷ�ʱ�ٴ��롣<br/>
 * 			�̳߳أ����ơ�<br/>ThreadLocal�����
 * 		����һ�㶼����һ�����ϴ洢Ԫ������һ����Ԫ��������Ԫ���Ĺ���</p>
 **/
public class MainTest {
	public static void main(String[] args) {
		LetterFactory factory = LetterFactory.getInstance();
		String word = "easiness";
		addLetterByName(factory, word);
		
		getLetter(factory, word);
	}

	static void addLetterByName(LetterFactory factory, String word) {
		for (char c : word.toCharArray()) {
			factory.add(new Letter(c + ""));
		}
	}

	static void getLetter(LetterFactory factory, String word) {
		for (char c : word.toCharArray()) {
			System.out.println(factory.get(c + ""));
		}
	}
}
/**
 * �Ƽ����ͣ�http://blog.csdn.net/hguisu/article/details/7535792
 * */

/**
 * �����ԣ�
 *  1.һ��Ӧ�ó���ʹ�ô�����ͬ�������ƵĶ�����ɺܴ�Ĵ洢������
 *  2.����Ĵ󲿷�״̬�������ⲿ�������Խ���Щ�ⲿ״̬��������С�
 *  3.���ɾ��������ⲿ״̬����ô��������Խ��ٵĹ������ȡ���ܶ������
 *  4.Ӧ�ó��������ڶ����ʶ������Flyweight������Ա��������ڸ����������б�Ķ��󣬱�ʶ���Խ�������ֵ��
 *  5.ʹ����Ԫģʽ��Ҫά��һ���洢��Ԫ�������Ԫ�أ�������Ҫ������Դ����ˣ�ֻҪ�ڶ���ظ�ʹ����Ԫ����ʱ��ֵ��ʹ����Ԫģʽ��
 * **/
