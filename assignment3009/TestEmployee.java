package assignment3009;
import java.util.Scanner;
public class TestEmployee {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		Employee employee=new Employee();
		
		System.out.println("Employee's salary is: ");
		double salary=sc.nextDouble();
		System.out.println("Employee's work hours per day");
		int workHours=sc.nextInt();
		
		employee.getInfo(salary, workHours);
		employee.AddSal();
		employee.AddWork();
		employee.display();
		

	}

}
