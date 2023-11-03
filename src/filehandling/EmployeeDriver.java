package filehandling;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.Scanner;

public class EmployeeDriver {

	public static void main(String[] args) throws ClassNotFoundException, IOException
	{
		String path="C:\\Users\\binod\\Java\\F1.txt";
		FileInputStream fis=new FileInputStream(path);
		ObjectInputStream ois=new ObjectInputStream(fis);
		Object o1=ois.readObject();
		Employee e1=(Employee)o1;
		System.out.println(e1.eid);
		System.out.println(e1.sal);
		System.out.println(e1.name);
		ois.close();
	}
}