package cm.coforge.githubJavaEx.GithubJavaProject.dao;

import java.util.Scanner;

import cm.coforge.githubJavaEx.GithubJavaProject.bean.Employee;

public class EmployeeDaoImpl implements EmployeeDao{
	private Employee e=null;
	Scanner sc=new Scanner(System.in);
	public void addEmp() {
		e=new Employee();
		e.setEmpId(sc.nextInt());
	//	sc.nextLine();
		e.setEmpName(sc.next());
		
		e.setEmpPhone(sc.nextLong());
	//	sc.nextLine();
		e.setEmpEmail(sc.next());
		
	}

	public void displayEmp() {
		System.out.println(e.getEmpId());
		System.out.println(e.getEmpName());
		System.out.println(e.getEmpPhone());
		System.out.println(e.getEmpEmail());
		
	}

}
