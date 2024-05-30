package org.jsp.springempapp.controller;

import java.util.Scanner;

import org.jsp.springempapp.EmployeeConfig;
import org.jsp.springempapp.dao.EmployeeDao;
import org.jsp.springempapp.dto.Employee;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class EmployeeController {

	public static void main(String[] args) {
		ApplicationContext context = new AnnotationConfigApplicationContext(EmployeeConfig.class);
		EmployeeDao employeeDao = context.getBean(EmployeeDao.class);
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your choice :");
		System.out.println("1.Save Employee");
		System.out.println("2.Update Employee");
		System.out.println("3.Find Employee By ID");
		System.out.println("4.Verify Employee by Phone and Password");
		System.out.println("5.Verify Employee by Email and Password");
		System.out.println("6.Verify Employee by ID and Password");
		System.out.println("7.Find Employees By Salary");
		System.out.println("8.Find Employees By Designation");
		System.out.println("9.Find Employees By Name");
		System.out.println("10.Find Employees between an Salary range");
		System.out.println("------------------------------------------");

		switch (sc.nextInt()) {
		case 1: {
			Employee e = new Employee();
			System.out.println("Enter Name,Phone number,Email address,Designation,Salary and Password to save Employee :");
			break;
		}
		case 2: {

			break;
		}
		case 3: {

			break;
		}
		case 4: {

			break;
		}
		case 5: {

			break;
		}
		case 6: {

			break;
		}
		case 7: {

			break;
		}
		case 8: {

			break;
		}
		case 9: {

			break;
		}
		case 10: {

			break;
		}
		default:
			System.err.println("Invalid choice..!!");
			break;
		}

	}
}
