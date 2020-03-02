import java.util.Scanner;
public class EmployeeHours {

	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);

		String name = "";
		double hourlyPay = 0;
		double hoursWorked = 0;

		do {

			System.out.println("Please enter your name: ");
			name = in.nextLine();

			if (!name.equals("QUIT")) {

				System.out.println("How much do you make hourly?: ");
				hourlyPay = in.nextDouble();

				System.out.println("How many hours have you worked?: ");
				hoursWorked = in.nextDouble();

				output (name, hoursWorked, hourlyPay);
				in.nextLine();
			}
		}

		while (!name.equals("QUIT"));

		in.close();
	}

	//	Calculations for pay
	//	Greater than or less than 40

	public static double salary(double hourlyPay, double hoursWorked) {

		double pay = 0;
		if (hoursWorked > 0) {
			if (hoursWorked <= 40 && hoursWorked != 0) {
				pay = hourlyPay * hoursWorked;
			}
			else if (hoursWorked > 40) {
				pay = hourlyPay * 40;

				pay = 1.5 * hourlyPay * (hoursWorked - 40);

			}
			else System.out.println("Invalid statement");

		}
		return pay;



	}
	public static void output(String name, double hourlyPay, double hoursWorked) {

		double salary = salary (hourlyPay, hoursWorked);
		System.out.println("Employee name: " + name);
		System.out.println("Hours worked: " + hoursWorked);
		System.out.println("Weekly pay: " + salary);
	}
}