package templatemethod;
/**
 * @author shadow
 * @Date 2016��8��12������9:29:03
 * @Fun  ҵ������ģ�壬�ṩ�������
 **/
public abstract class BaseTemplate {
	public abstract void part1();
	
	public abstract void part2();
	
	public abstract void part3();
	
	//Ϊ���ϸ�ʵ������ʹ��final���ɱ���д
	public final void useTemplateMethod(){
		part1();
		part2();
		part3();
	}
}
