package filehandling;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.Serializable;

import exception.SalException;

public class Employee implements Serializable
{
	int eid;
	String name;
	double sal;
	public Employee() {
		super();
	}
	public Employee(int eid, String name, double sal) {
		super();
		this.eid = eid;
		this.name = name;
		if(sal>0)
		{
			this.sal = sal;
		}
		else
		{
			throw new SalException();
		}
	}
	public static void main(String[] args) throws IOException
	{
		Employee e1=new Employee(101,"Binod",1000);
		File f1=new File("C:\\Users\\binod\\Java\\F1.txt");
		FileOutputStream fos=new FileOutputStream(f1);
		ObjectOutputStream o1=new ObjectOutputStream(fos);
		o1.writeObject(e1);
		o1.close();
	}
	
}
