package javaassigment10.question4.university;

import java.util.Scanner;

import javaassigment10.question4.university.courses.Courses;
import javaassigment10.question4.university.faculty.Faculty;
import javaassigment10.question4.university.students.Students;

public class MainMethod {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		Courses c=new Courses();
		System.out.println("Enter the Name of the Course");
                c.setName(sc.nextLine());
                System.out.println("Enter the Course ID");
		c.setId(sc.nextInt());
		sc.nextLine();
		System.out.println(c.toString());
		Students s=new Students();
		System.out.println("Enter the name of the student");
		s.setName(sc.nextLine());
		System.out.println("Enter the Student ID");
		s.setId(sc.nextInt());
		sc.nextLine();
		System.out.println("Enter the Phone Number");
		s.setPhoneNumber(sc.nextLong());
		sc.nextLine();
		System.out.println("Enter the address");
		s.setAddress(sc.nextLine());
		s.setCourse(c);
		System.out.println(s.toString());
		Faculty f=new Faculty();
		System.out.println("Enter the faculty Name");
                f.setName(sc.nextLine());
                System.out.println("Enter the Faculty ID");
                f.setId(sc.nextInt());
                sc.nextLine();
                System.out.println("Enter the Phone Number");
                f.setPhoneNumber(sc.nextLong());
                sc.nextLine();
                System.out.println("Enter the Address");
                f.setAddress(sc.nextLine());
                f.setCourse(c);
	        System.out.println(f.toString());
	}

}
