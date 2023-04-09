package test;
import java.util.*;
import employee.*;

class main{
	public static void main(String[] args) {
		System.out.println("\nVEDANT PATEL IU2141230208\n");
		SalariedEmployee emp = new SalariedEmployee();

		emp.input_data();


		emp.display_data();
		emp.allowance();
		emp.increment();

		System.out.println("Gross Salary: " + emp.salary);

	}
}
