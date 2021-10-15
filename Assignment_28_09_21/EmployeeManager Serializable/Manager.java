package com.yash.Serializable;

public class Manager extends Employee{
	
	private static final long serialVersionUID = 1L;
	
	private int managerId;
	
	public Manager(int empId, String empFirstName, String empLastName, String empDOB, String empGender, int managerId) {
		super(empId, empFirstName, empLastName, empDOB, empGender);
		this.managerId=managerId;	
	}
	
	public int getManagerId() {
		return managerId;
	}

	@Override
	public String toString() {
		System.out.println(super.toString());
		return "Manager [managerId=" + managerId + "]";
	}
	
	
}
