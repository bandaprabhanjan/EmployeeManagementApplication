import java.util.Date;
import java.util.LinkedHashSet;
import java.util.Set;

public final class Employee {
	private final String name;
	private final String designation;
	private final double salary;
	private final Date dob;
	private Set<String> skills;
	private final Address address;

	public Employee(String name, String designation, double salary, Date dob, Set<String> skills, Address address) {
		super();
		this.name = name;
		this.designation = designation;
		this.salary = salary;
		this.dob = dob;
		this.skills = skills;
		this.address = address;
	}

	public String getName() {
		return name;
	}

	public String getDesignation() {
		return designation;
	}

	public double getSalary() {
		return salary;
	}

	public Date getDob() {
		return new Date(dob.getTime());
	}

	public Set<String> getSkills() {
		return new LinkedHashSet<>(skills);
	}

	@Override
	public String toString() {
		return "Employee [name=" + name + ", designation=" + designation + ", salary=" + salary + ", dob=" + dob
				+ ", skills=" + skills + ", address=" + address + "]";
	}

	public Address getAddress() {
		Address empAddress = new Address();
		empAddress.setStreet(address.getStreet());
		empAddress.setZipcode(address.getZipcode());
		empAddress.setAddressLine1(address.getAddressLine1());
		empAddress.setAddressLine2(address.getAddressLine2());
		return empAddress;
	}

}
