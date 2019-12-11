package beans;
import java.io.Serializable;
public class Student implements Serializable{
	public String usn;
	public String name;
	public String marks;
	public void setname(String n)
	{
		name = n;
	}
	public String getname()
	{
		return name;
	}
	
	public void setusn(String n)
	{
		usn = n;
	}
	public String getusn()
	{
		return usn;
	}
	
	public void setmarks(String n)
	{
		marks = n;
	}
	public String getmarks()
	{
		return marks;
	}
}
