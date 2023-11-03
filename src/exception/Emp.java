package exception;


public class Emp {
	int eid;
	String name;
	double sal;
	Emp()
	{}
	public Emp(int eid, String name, double sal)
	{
		super();
		this.eid = eid;
		this.name = name;
		if(sal>0)
		{
			this.sal=sal;
		}
		else
		{
			try
			{
				throw new SalException();
			}
			catch(SalException e)
			{
				this.sal=15;
			}
		}
	}
	void display()
	{
		System.out.println("EID:- "+eid);
		System.out.println("NAME:- "+name);
		System.out.println("SALARY:- "+sal);
	}

}
