package facade;
/**
 * @author shadow
 * @Date 2016��8��4������9:45:26
 * @Fun ����
 **/
public class Scene {
	public Scene(String name){
		System.out.println("�����˳�����" + name);
	}
	
	public void load(){
		System.out.println("�������ء�");
	}
	
	public void unload(){
		System.out.println("����ж�ء�");
	}
}
