	import java.util.*;

	class Employee{
		Scanner s = new Scanner(System.in);
		String name;
		int emp_numb;
		char gender;

		void input_data(){
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

		void display_data(){
			System.out.println("------------------------------");

			System.out.println("Employee name: "+name);

			System.out.println("Employee number: "+emp_numb);

			System.out.println("Employee gender: "+gender);

			System.out.println("------------------------------");

			
		}
	}

	class SalariedEmployee extends Employee{
		double salary, hra, da;

		SalariedEmployee() {
			System.out.println("Enter salary: ");
			salary = s.nextFloat();
			s.nextLine();
		}

		void allowance(){

			if(gender == 'F'){
				hra =  0.1 * salary;
			} else {
				hra =  0.09 * salary;
			}

			da =  0.05 * salary;

			salary = salary + hra + da;
		}


		void increment(){
			salary = salary + ((float)0.1) * salary ;
			System.out.println();

		}

		public static void main(String[] args) {

			System.out.println("\n**************************");
	 		System.out.println("Vedant Patel IU2141230208");
	 		System.out.println("**************************");

			SalariedEmployee emp = new SalariedEmployee();

			emp.input_data();
			emp.display_data();
			emp.allowance();
			emp.increment();

			System.out.println("Gross salary = " + emp.salary);
			System.out.println("------------------------------");
		}
	}

	// class main{
	// 	public static void main(String[] args) {

	// 		System.out.println("\n**************************");
	// 		System.out.println("Vedant Patel IU2141230208");
	// 		System.out.println("**************************");

	// 		SalariedEmployee person = new SalariedEmployee();

	// 		person.input_data();

	// 		person.display_data();

	// 		person.allowance();

	// 		person.increment();

	// 		System.out.println("------------------------------");
	// 		System.out.println("\nGross salary = " + person.salary);
	// 		System.out.println("------------------------------");

	// 	}
	// }

