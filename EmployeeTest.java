import java.io.*;
	public class EmployeeTest {
		public static void main(String args[]) {
			/* Create two objects using constructor */
			Employee empOne = new Employee("nisar");
			Employee empTwo = new Employee("ali");
			// Invoking methods for each object created
			empOne.empAge(65);
			empOne.empDesignation("Internee");
			empOne.empSalary(16000);
			empOne.printEmployee();
			empTwo.empAge(31);
			empTwo.empDesignation("Software Engineer");
			empTwo.empSalary(26000);
			empTwo.printEmployee();
		}
}