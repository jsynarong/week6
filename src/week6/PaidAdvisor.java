package week6;

import java.util.Scanner;

public class PaidAdvisor extends person {

	public static double regularPayRate, specialPayRate, overtimePayRate, payment = 0;

	public static int totalHours, specialHours;

	private static String first, last;

	private static person p;

	PaidAdvisor(double regularPayRate, double specialPayRate, double overtimePayRate, int totalHours,
			int specialHours) {

		super(first, last);

		PaidAdvisor.regularPayRate = regularPayRate;

		PaidAdvisor.specialPayRate = specialPayRate;

		PaidAdvisor.overtimePayRate = overtimePayRate;

		PaidAdvisor.totalHours = totalHours;

		PaidAdvisor.specialHours = specialHours;

	}

	PaidAdvisor() {

	}

// Calculate overtime and regular hours
	public void calculatePay() {

		int regularHours = totalHours - specialHours, overtimeHours = 0;

		if (regularHours > 30) {

			overtimeHours = regularHours - 30;

			regularHours = totalHours - specialHours - overtimeHours;

		}

		// Calculate payment
		payment = (regularHours * regularPayRate) + (specialHours * specialPayRate) + (overtimeHours * overtimePayRate);

	}

	public void setNameRateHours() {

		Scanner scan = new Scanner(System.in);

		System.out.print("Enter first name: ");

		first = scan.nextLine();

		System.out.print("Enter last name: ");

		last = scan.nextLine();

		p = new person(first, last);

		System.out.print("Enter total hours: ");

		totalHours = Integer.parseInt(scan.nextLine());

		System.out.print("Enter special hours: ");

		specialHours = Integer.parseInt(scan.nextLine());

		// regular pay

		regularPayRate = 25;

		// special pay

		specialPayRate = 50;

		// overtime pay

		overtimePayRate = (regularPayRate * 1.5);

	}

	public double getPayRate() {
		return regularPayRate;
	}

	public int getHoursWorked() {

		return totalHours;

	}

	public String toString() {

		return "Total salary for Advisor " + p.getFirstName() + " " + p.getLasttName() + " is: $" + payment;

	}

}