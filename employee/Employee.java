package employee;

public class Employee {
	   private String empId;
	   private String empName;
	   private String empDepartment;
	   private String empGender;
	public Employee(String empId, String empName, String empDepartment, String empGender) {
		super();
		this.empId = empId;
		this.empName = empName;
		this.empDepartment = empDepartment;
		this.empGender = empGender;
	}
	public String getEmpId() {
		return empId;
	}
	public void setEmpId(String empId) {
		this.empId = empId;
	}
	public String getEmpName() {
		return empName;
	}
	public void setEmpName(String empName) {
		this.empName = empName;
	}
	public String getEmpDepartment() {
		return empDepartment;
	}
	public void setEmpDepartment(String empDepartment) {
		this.empDepartment = empDepartment;
	}
	public String getEmpGender() {
		return empGender;
	}
	public void setEmpGender(String empGender) {
		this.empGender = empGender;
	}
	@Override
	public String toString() {
		return "Employee [Id=" + empId + ", Name=" + empName + ", Department=" + empDepartment + ", Gender="
				+ empGender + "]";
	}

	   

}
