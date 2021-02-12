package cm.coforge.githubJavaEx.GithubJavaProject;

import java.util.Scanner;

import cm.coforge.githubJavaEx.GithubJavaProject.service.EmployeeServiceImpl;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        EmployeeServiceImpl e=new EmployeeServiceImpl();
        Scanner sc=new Scanner(System.in);
        System.out.println("etner 1 for add emp and 2 for disp emp");
        switch(sc.nextInt()) {
        case 1:
        e.addEmp();
        
        case 2:
        e.displayEmp();
        break;
        default: System.out.println("requesting u to enter only 1 for add emp and 2 for display");
        	break;
        }
    }
}
