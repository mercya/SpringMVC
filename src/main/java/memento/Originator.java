package memento;
/**
 * @author shadow
 * @Date 2016��8��8������8:01:48
 * @Fun 
 **/
public class Originator {
	
	private DataState state;
	
	public Originator() {
		// TODO Auto-generated constructor stub
	}
	
	public Originator(DataState state){
		this.state = state;
	}
	
	public Memento getMemento(){
		return new Memento(this);
	}
	
	public void setMemento(Memento m){
		/**
		 * getMemento()�����Ķ��󣬱�����ĳ�����������Ҫ�ָ�ʱ�����䴫�뵱ǰ��������ʹ��getState()�ó� 
		 */
		this.state = m.getState();
	}
	
	public DataState getState(){
		return this.state;
	}
	
	public void setState(DataState state){
		this.state = state;
	}
	
}
