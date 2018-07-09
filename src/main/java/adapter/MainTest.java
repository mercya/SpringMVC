package adapter;
/**
 * @author shadow
 * @Date 2016��8��1������8:01:07
 * @Fun �������������������������������ӿ�������
 **/
public class MainTest {
	public static void main(String[] args) {
		//����������
		DrawAdapter4Object objAdapter = new DrawAdapter4Object(new DrawRectangle());
		objAdapter.drawCircle();
		objAdapter.drawRectangle(" in DrawAdapter4Object");
		
		//��������
		DrawAdapter4Class adapter4 = new DrawAdapter4Class();
		adapter4.drawCircle();
		adapter4.drawRectangle(" in DrawAdapter4Class ");
		
		//�ӿ�������
		MyDrawAdapter adapter = new MyDrawAdapter();
		adapter.drawCircle();
		adapter.drawRectangle();
	}
	
	static class MyDrawAdapter extends DefaultDrawAdapter{
		@Override
		public void drawCircle() {
			// TODO Auto-generated method stub
			System.out.println("My DrawAdapter:Draw CirCle");
		}
		
		@Override
		public void drawRectangle() {
			// TODO Auto-generated method stub
			super.drawRectangle();
			System.out.println("My DrawAdapter:Draw Rectangle");
		}
	}
}
/**
 * �ο����ͣ� http://blog.csdn.net/jason0539/article/details/22468457
 * **/
