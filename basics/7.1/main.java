package test;
import java.util.*;
import employee.SalariedEmployee;

class main{
	public static void main(String[] args) {
		SalariedEmployee emp = new SalariedEmployee();

		emp.input_data();


		emp.display_data();
		emp.allowance();
		emp.increment();

		System.out.println("Gross Salary: " + emp.salary);

	}
}
