package facade;
/**
 * @author shadow
 * @Date 2016��8��4������9:46:58
 * @Fun  ��������
 **/
public class Facade {
	Actor actor;
	Scene scene;
	
	public Facade(){
		this.actor = new Actor("lisi");
		this.scene = new Scene("����ʢ��");
	}
	
	public void startGame(){
		actor.load();
		scene.load();
	}
	
	public void endGame(){
		actor.unload();
		scene.unload();
	}
}
