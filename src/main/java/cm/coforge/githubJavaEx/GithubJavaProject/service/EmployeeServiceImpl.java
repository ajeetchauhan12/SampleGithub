package cm.coforge.githubJavaEx.GithubJavaProject.service;

import cm.coforge.githubJavaEx.GithubJavaProject.dao.EmployeeDao;
import cm.coforge.githubJavaEx.GithubJavaProject.dao.EmployeeDaoImpl;

public class EmployeeServiceImpl implements EmployeeService {
private EmployeeDao ed=null;
public EmployeeServiceImpl() {
	ed=new EmployeeDaoImpl();
}
	public void addEmp() {
		// TODO Auto-generated method stub
		
		ed.addEmp();
	}

	public void displayEmp() {
		// TODO Auto-generated method stub
		ed.displayEmp();
	}

}
