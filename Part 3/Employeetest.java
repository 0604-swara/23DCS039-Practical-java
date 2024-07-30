import java.util.Scanner; 

class Employee{
	String fs;
	String ls;
	double salary;
	Scanner s = new Scanner(System.in);
	Employee()
	{
	}
	

	Employee(String f ,String l ,double sal)
	{
		fs=f;
		ls=l;
		salary=sal;
	}

	void setfs()
	{
		fs=s.nextLine(); 
	} 	
	void setls()
	{ 
		ls=s.nextLine();
	}
	void setsal()
	{
		salary=s.nextDouble();
		if(salary<=0)
		{ 
			System.out.println("0.0");
		}
		else{ 
			System.out.println(salary+(10/100));
		}
	}
	String getfs()
	{
		return fs;
	}
	String getls()
	{
		return ls;
	}
	double getsal()
	{
		return salary;
	}
}
 class Employeetest{
	public static void main(String args[]){

		Employee e1= new Employee();
		Employee e2= new Employee();
		
		e1.setfs();
		e1.setls();
		e1.setsal();
		System.out.println(e1.getfs());
		System.out.println(e1.getls());
		System.out.println(e1.getsal());

		e2.setfs();
		e2.setls();
		e2.setsal();
		System.out.println(e2.getfs());
		System.out.println(e2.getls());
		System.out.println(e2.getsal());
	}
}

