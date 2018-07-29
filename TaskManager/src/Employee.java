import java.util.*;


public class Employee {
	private String Employee_id;
	private String firstName, lastName;
	private int workload;
	private LogInData logInDate;
	
	private ArrayList<Task> tasks;
	
	public Employee(String Eployee_id,String firstName, String lastName, int workload) {
		this.Employee_id=Employee_id;
		this.firstName = firstName;
		this.lastName= lastName;
		this.workload=workload;
	}

	public String getEmployee_id() {
		return Employee_id;
	}

	public void setEmployee_id(String Employee_id) {
		this.Employee_id = Employee_id;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public LogInData getLogInDate() {
		return logInDate;
	}

	public int getWorkload() {
		return workload;
	}

	public void setWorkload(int workload) {
		this.workload = workload;
	}

	public void setLogInDate(LogInData logInDate) {
		this.logInDate = logInDate;
	}

	public ArrayList<Task> getTasks() {
		return tasks;
	}

	public void setTasks(ArrayList<Task> tasks) {
		this.tasks = tasks;
	}
	public String toString()
	{
	return Employee_id + " " + firstName+" "+lastName+" "+ workload;
	}
	
	
	
	/*ArrayList<Employee> list= new ArrayList<Employee>();
	Employee emp1 = new Employee("EMP_1000", "Manuel","Mueller", 40);
	Employee emp2 = new Employee("EMP_1001","Jochen","Lauter",40);
	Employee emp3 = new Employee("EMP_1002","Nina","Lambrecht",40);
	Employee emp4 = new Employee("EMP_1003","Giselle","Stecher",40);
	Employee emp5 = new Employee("EMP_1005","Paul","Stehr",30);
	Employee emp6 = new Employee("EMP_1006","Janine","Steinberger",20);
	Employee emp7 = new Employee("EMP_1007","Tom","Lauber",40);
	Employee emp8 = new Employee("EMP_1000", "Manuel","Mueller",40);
	Employee emp9 = new Employee("EMP_1000", "Manuel","Mueller",40);
	Employee emp10 = new Employee("EMP_1000", "Manuel","Mueller",40);
	Employee emp11= new Employee("EMP_1000", "Manuel","Mueller",40);
	Employee emp12 = new Employee("EMP_1000", "Manuel","Mueller",40);
	Employee emp13 = new Employee("EMP_1000", "Manuel","Mueller",40);
	Employee emp14 = new Employee("EMP_1000", "Manuel","Mueller",40);
	Employee emp15 = new Employee("EMP_1000", "Manuel","Mueller",40);
	Employee emp16 = new Employee("EMP_1000", "Manuel","Mueller",40);
	Employee emp17 = new Employee("EMP_1000", "Manuel","Mueller",40);
	Employee emp18 = new Employee("EMP_1000", "Manuel","Mueller",40);
	Employee emp19 = new Employee("EMP_1000", "Manuel","Mueller",40);
	Employee emp20 = new Employee("EMP_1000", "Manuel","Mueller",40);
	Employee emp21 = new Employee("EMP_1000", "Manuel","Mueller",40);
	Employee emp22 = new Employee("EMP_1000", "Manuel","Mueller",40);
	Employee emp23 = new Employee("EMP_1000", "Manuel","Mueller",40);
	Employee emp24 = new Employee("EMP_1000", "Manuel","Mueller",40);
	Employee emp25 = new Employee("EMP_1000", "Manuel","Mueller",40);
	
	list.
	list.add(emp2);
	for (Employee x:list)
	System.out.print(x);
	
	*/
	//if employee is logged in, we have to connect the login data to the correct employeeid 
	//create Task
	
	
	
}

	
	
	
	
