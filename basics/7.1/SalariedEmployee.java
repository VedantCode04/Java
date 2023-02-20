package employee;
import java.util.*;

	class Employee{
		Scanner s = new Scanner(System.in);
		String name;
		int emp_numb;
		char gender;

		public void input_data(){
			System.out.print("Enter name: ");
			name = s.nextLine();

			System.out.print("Enter gender(M/F): ");
			gender = s.next().charAt(0);

			while((gender != 'M') && (gender != 'F') ) {
				System.out.print("please enter gender again: ");
				gender = s.next().charAt(0);
			}

			System.out.print("Enter emp_number: ");
			emp_numb = s.nextInt();
			
		}

		public void display_data(){
			System.out.println("------------------------------");

			System.out.println("Employee name: "+name);

			System.out.println("Employee number: "+emp_numb);

			System.out.println("Employee gender: "+gender);

			System.out.println("------------------------------");

			
		}
	}

	public class SalariedEmployee extends Employee{
		public double salary, hra, da;

		public SalariedEmployee(){
			System.out.println("Enter salary: ");
			salary = s.nextFloat();
			s.nextLine();
		}

		public void allowance(){
			if(gender == 'F'){
				hra =  0.1 * salary;
			} else {
				hra =  0.09 * salary;
			}

			da =  0.05 * salary;

			salary = salary + hra + da;
		}


		public void increment(){
			salary = salary + ((float)0.1) * salary ;
			System.out.println();

		}

	}
