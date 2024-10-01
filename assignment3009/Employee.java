package assignment3009;

public class Employee {
	private double salary;
	private int workHours;
	
	public Employee()
	{
		salary=0.0;
		workHours=0;
	}
	public void getInfo(double salary, int workHours) {
		
		this.salary = salary;
		this.workHours = workHours;
	}
	public void AddSal()
	{
		if(salary<500)
			
		{
			salary+=10;
		}
	}
	
	public void AddWork()
	{
		if(workHours>6)
		{
			salary+=5;
		}
	}
	
	public void display()
	{
		System.out.println("Salary of Employee = "+salary);
	}

}
