package week6;

public class person {
	private String firstName;

	private String lastName;

	public person()

	{

		firstName = "";

		lastName = "";

	}

	public person(String first, String last)

	{

		setName(first, last);

	}

	public String toString()

	{

		return (firstName + " " + lastName);

	}

	public void setName(String first, String last)

	{

		firstName = first;

		lastName = last;

	}

	public String getFirstName() {

		return firstName;

	}

	public String getLasttName() {

		return lastName;

	}

	public static void main(String[] args) {

		PaidAdvisor pa = new PaidAdvisor();

		pa.setNameRateHours();

		pa.calculatePay();

		System.out.println(pa.toString());

	}

}