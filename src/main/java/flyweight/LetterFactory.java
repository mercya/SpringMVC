package flyweight;

import java.util.EnumSet;
import java.util.HashMap;
import java.util.Map;

/**
 * @author shadow
 * @Date 2016��8��5������8:05:27
 * @Fun  һ��������ĸ����� ��Ԫ����������������
 **/
public class LetterFactory {
	private Map<String, Letter> map;
	private static LetterFactory instance = new LetterFactory();
	
	private LetterFactory(){
		map = new HashMap<>();
	}
	
	public static LetterFactory getInstance(){
		return instance;
	}
	
	public void add(Letter letter){
		if(letter != null && !map.containsKey(letter.getName())){
			map.put(letter.getName(), letter);
		}
		
		System.out.println("map.size ==== " + map.size());
	}
	
	public Letter get(String name){
		return map.get(name);
	}
}