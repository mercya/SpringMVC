package absfactory;
/**
 * @author shadow
 * @Date 2016��8��18������7:08:24
 * @Fun  ���󹤳�ģʽ��Ϊ����һ����ػ����໥�����Ķ����ṩһ���ӿڣ���������ָ�����ǵľ����ࡣ ���������ģʽ<br/>
 * 		 ���̣����󹤳���ʵ�幤����������Ʒ<br/>
 * 			 �����Ʒ��ʵ���Ʒ��ʵ�ֲ�Ʒ����<br/>
 * 		 ȱ�㣺����Ҫ���һ����Ʒ���ɳ����ʵ�幹�ɣ�����������Ҫ�޸ġ�<br/>
 **/
public class MainTest {
	public static void main(String[] args) {
		IFactory factory = new Factory();
		IProduct1 product1 = factory.createProduct1A();
		product1.show();
		
		IProduct1 product12 = factory.createProduct1B();
		product12.show();
		
		IProduct2 product2 = factory.createProduct2A();
		product2.show();
		
		IProduct2 product22 = factory.createProduct2B();
		product22.show();
	}
}
/**
 * �ο����ͣ�http://blog.csdn.net/zhengzhb/article/details/7359385
 * */
/**
 * ���������
 *  1.ϵͳ���ж����Ʒ�壬��ϵͳһ��ֻ������������һ���Ʒ��
 *  2.ͬ����ͬһ����Ʒ��Ĳ�Ʒ����ʹ�á�
 * **/
 