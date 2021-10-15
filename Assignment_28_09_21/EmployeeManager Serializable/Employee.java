package com.yash.Serializable;

import java.io.Serializable;

public class Employee implements Serializable {
	
	private static final long serialVersionUID = 1L;
	private int empId;
	private String empFirstName;
	private String empLastName;
	transient private String empDOB;
	private String empGender;
	
	public Employee() {}
	
	public Employee(int empId, String empFirstName, String empLastName, String empDOB, String empGender) {
		super();
		this.empId=empId;
		this.empFirstName=empFirstName;
		this.empLastName=empLastName;
		this.empDOB=empDOB;
		this.empGender=empGender;
	}

	public int getEmpId() {
		return empId;
	}

	public String getEmpFirstName() {
		return empFirstName;
	}

	public String getEmpLastName() {
		return empLastName;
	}

	public String getEmpDOB() {
		return empDOB;
	}

	public String getEmpGender() {
		return empGender;
	}

	@Override
	public String toString() {
		return "Employee [empId=" + empId + ", empFirstName=" + empFirstName + ", empLastName=" + empLastName
				+ ", empDOB=" + empDOB + ", empGender=" + empGender + "]";
	}
}
