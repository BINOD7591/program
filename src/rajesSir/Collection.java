package rajesSir;

import java.util.ArrayList;
import java.util.Collections;

public class Collection {

	public static void main(String[] args) {
		ArrayList al=new ArrayList();
		al.add(20);
		al.add(12);
		al.add(40);
		al.add(6);
		al.add(50);
		System.out.println(al);
		for (int i = 0; i <al.size(); i++) {
			System.out.println(al.get(i));
		}
//		for (Object obj : al) {
//			System.out.println(obj);    //ConcurrentModificationException
//		}
		Collections.sort(al);
		System.out.println(al);

	}

}
