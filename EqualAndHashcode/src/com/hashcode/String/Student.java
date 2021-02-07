package com.hashcode.String;

public class Student {
	String name;
	int rollNo;

	public Student(String name, int rollNo) {
		super();
		this.name = name;
		this.rollNo = rollNo;
	}

	public boolean equals(Object obj) {
		try {
			String name1 = this.name;
			int rollNo1 = this.rollNo;
			Student s2 = (Student) obj;
			String name2 = s2.name;
			int rollNo2 = s2.rollNo;
			if (name1.equals(name2) && rollNo1 == rollNo2) {
				return true;
			} else
				return false;
		} catch (ClassCastException e) {
			return false;
		} catch (NullPointerException e) {
			return false;
		}

	}

	public static void main(String[] args) {
Student s1 = new Student("cha",12);
Student s2 = new Student("vij",13);
Student s3 = new Student("cha",12);
System.out.println(s1.equals(s2));
 }
}
