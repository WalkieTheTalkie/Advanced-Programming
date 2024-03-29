package application;

import java.io.Serializable;

@SuppressWarnings("serial")
public class EmployeeClass extends Person implements Serializable {
	private int EmployeeID;
	private int workinHours;
	private String employeeUser;
	private String employeePass;
	
	
	
	public EmployeeClass(int employeeID, int workinHours, String employeeUser, String employeePass) {
		super();
		EmployeeID = employeeID;
		this.workinHours = workinHours;
		this.employeeUser = employeeUser;
		this.employeePass = employeePass;
	}
	public EmployeeClass() {
		super();
		// TODO Auto-generated constructor stub
	}
	public EmployeeClass(String firstName, String middleInitial, String lastName, String email, String phone,
			String gender, String address, String birthDate, String emergencyContact) {
		super(firstName, middleInitial, lastName, email, phone, gender, address, birthDate, emergencyContact);
		// TODO Auto-generated constructor stub
	}
	public int getEmployeeID() {
		return EmployeeID;
	}
	public void setEmployeeID(int employeeID) {
		EmployeeID = employeeID;
	}
	public int getWorkinHours() {
		return workinHours;
	}
	public void setWorkinHours(int workinHours) {
		this.workinHours = workinHours;
	}
	public String getEmployeeUser() {
		return employeeUser;
	}
	public void setEmployeeUser(String employeeUser) {
		this.employeeUser = employeeUser;
	}
	public String getEmployeePass() {
		return employeePass;
	}
	public void setEmployeePass(String employeePass) {
		this.employeePass = employeePass;
	}
	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "EmployeeID= " + EmployeeID + "\nWorking Hours= " + workinHours + "\nEmployee Username= "
				+ employeeUser + "\nemployeePass=" + employeePass + "\nFirstName=" + FirstName + "\nMiddleInitial="
				+ MiddleInitial + "\nLastName=" + LastName + "\nEmail=" + Email + "\nPhone=" + Phone + "\nGender="
				+ Gender + "\nAddress=" + Address + "\nBirthDate=" + BirthDate + "\nEmergencyContact="
				+ EmergencyContact;
	}
	
}
