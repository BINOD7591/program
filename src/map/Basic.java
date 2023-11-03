package map;

import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class Basic {
	public static void main(String[] args) {
		Map<String, Integer> m=new HashMap<String, Integer>();
		m.put("Binod",101);
		m.put("Bikash", 102);
		m.put("Rajesh",103);
		System.out.println(m);
		System.out.println(m.put("Rajesh", 105));
		System.out.println(m);
		Set<String> keySet = m.keySet();
		System.out.println(keySet);
		Collection<Integer> values = m.values();
		System.out.println(values);
		Set<Entry<String, Integer>> entrySet = m.entrySet();
		System.out.println(entrySet);
		Iterator itr = entrySet.iterator();
		while (itr.hasNext()) {
			Entry entry = (Entry)itr.next();
			if (entry.getKey().equals("Rajesh")) {
				System.out.println(entry.setValue(107));
			}	
		}
		System.out.println(m);
		
	}
}
