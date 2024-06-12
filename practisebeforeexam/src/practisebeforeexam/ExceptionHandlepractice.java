package practisebeforeexam;

import java.util.Scanner;
import java.lang.Exception;

class Student{
	private String studentId;
	private String studentName;
	private int totalMarks;
	public Student(String stid,String stname,int totalmark){
	this.studentId = stid;
	this.studentName = stname;
	this.totalMarks = totalmark;
	
	}
}



public class ExceptionHandlepractice {
	public static Student makeStudent(String data)throws Exception{
		// input A1011:Raja:234
		String arr[] = data.split(":");
		Student s = null;
		try{
		int total = Integer.parseInt(arr[2]);
		s = new Student(arr[0],arr[1],total);
		}
		catch(Exception e){
		throw new Exception("improper data");
		}
		return s;
	}
	
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter student data");
		String data = sc.nextLine();
		
		try {
		Student s = makeStudent(data);
		}
		catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}
	
	
	
}
