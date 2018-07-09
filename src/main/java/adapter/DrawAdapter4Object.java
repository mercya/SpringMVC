/**
 * @author shadow
 * @Date 2016��8��1������8:04:42
 * @Fun ������������ ʹ�ö�����ϵķ�ʽ���Ƕ�̬��ϵķ�ʽ��
 * 		���ܻ������ܻ�Բ��DrawAdapter����������DrawRectangle����Adapter���Ǳ������ߣ�
 * 		���������������ߺ�����Ŀ�꣨DrawCircle���������䡣
 **/
package adapter;

public class DrawAdapter4Object implements IDrawCircle {

	private DrawRectangle drawRectangle;
	
	public DrawAdapter4Object(DrawRectangle drawRectangle) {
		// TODO Auto-generated constructor stub
		this.drawRectangle = drawRectangle;
	}
	
	@Override
	public void drawCircle() {
		// TODO Auto-generated method stub
		System.out.println("DrawAdapter4Object:drawCircle");
	}
	
	public void drawRectangle(String msg){
		drawRectangle.drawRectangle(msg);
	}
	
}
