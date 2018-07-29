import java.util.*;

public final class DataBase {
	
	private static ArrayList<Employee>employees;
	
	
	public static Employee addnewEmployee(long id, String firstName, String lastName, int workload, LoginData loginData) {
		Employee newEmp= new Employee(id, firstName, lastName, workload, loginData);
		employees.add(newEmp);
		return newEmp;
	}
}
