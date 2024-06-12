package com.springcore.collections;
import java.util.*;

public class Student {
	private String studentId;
	private String studentName;
	private List<String> phoneNo ;
	private Set<String> address;
	private Map<String,String> map;
	private result res;
	public result getRes() {
		return res;
	}
	public void setRes(result res) {
		this.res = res;
	}
	public String getStudentId() {
		return studentId;
	}
	public void setStudentId(String studentId) {
		this.studentId = studentId;
	}
	public String getStudentName() {
		return studentName;
	}
	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}
	public List<String> getPhoneNo() {
		return phoneNo;
	}
	public void setPhoneNo(List<String> phoneNo) {
		this.phoneNo = phoneNo;
	}
	public Set<String> getAddress() {
		return address;
	}
	public void setAddress(Set<String> address) {
		this.address = address;
	}
	public Map<String, String> getMap() {
		return map;
	}
	public void setMap(Map<String, String> map) {
		this.map = map;
	}
	public Student(String studentId, String studentName, List<String> phoneNo, Set<String> address,
			Map<String, String> map) {
		super();
		this.studentId = studentId;
		this.studentName = studentName;
		this.phoneNo = phoneNo;
		this.address = address;
		this.map = map;
	}
	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "Student [studentId=" + studentId + ", studentName=" + studentName + ", phoneNo=" + phoneNo
				+ ", address=" + address + ", map=" + map + "]";
	}
	
}
