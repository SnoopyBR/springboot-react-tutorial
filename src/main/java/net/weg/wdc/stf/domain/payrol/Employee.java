package net.weg.wdc.stf.domain.payrol;

import java.util.Objects;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

import lombok.Data;

@Data
@Entity
public class Employee {

	private @Id @GeneratedValue long id;
	private String firstName;
	private String lastName;
	private String description;

	public Employee() {
		// TODO Auto-generated constructor stub
	}

	public Employee( String firstName, String lastName, String description) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.description = description;
	}

	@Override
	public int hashCode() {
		return Objects.hash(id, firstName, lastName, description);
	}

	@Override
	public boolean equals(Object o) {
		if (this == o)
			return true;
		if (o == null || getClass() != o.getClass())
			return false;
		Employee employee = (Employee) o;
		return Objects.equals(id, employee.id) && Objects.equals(firstName, employee.firstName)
				&& Objects.equals(lastName, employee.lastName) && Objects.equals(description, employee.description);
	}

	@Override
	public String toString() {
		return "Employee [id=" + id + ", firstName=" + firstName + ", lastName=" + lastName + ", description="
				+ description + "]";
	}

}
