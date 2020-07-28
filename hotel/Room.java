package kosta.hotel;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class Room {
	Map<String, Integer> map;
	
	public Room() {
		map = new HashMap<String, Integer>();
		map.put("SR", 50000);
		map.put("DR", 70000);
		map.put("PR", 100000);
	}
	
	public void roomList() {
		Set set = map.entrySet();
		Iterator iter = set.iterator();
		
		while(iter.hasNext())
		{
			Map.Entry<String, Integer> me = (Map.Entry<String, Integer>)iter.next();
			System.out.println("객실 타입 : " +me.getKey()+ "\t객실 가격 : " +me.getValue());
		}
	}
	
	
}
