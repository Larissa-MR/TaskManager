import java.util.*;


public class Employee {
	private long id;
	private String firstName, lastName;
	private LoginData loginData;
	private ArrayList<Task> tasks;
	private int workload;
	
	public Employee(long id, String firstName, String lastName, int workload, LoginData loginData) {
		this.id=id;
		this.firstName=firstName;
		this.lastName=lastName;
		this.workload=workload;
		this.loginData=loginData;
		
	}
	
	//gibt der Task neue id und fügt diese Task zur Tasklist des Employees hinzu
	public void addTask(Task newTask) {
		newTask.setId(getUniqueTaskId(newTask));
		tasks.add(newTask);
	}
	
	
	 //setzt index der Task=id der Task
	public int getUniqueTaskId(Task task) {
			return tasks.indexOf(task);
		}
	

	
	
	
	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
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

	
	
	
	
	
	
	public LoginData getLoginData() {
		return loginData;
	}

	public void setLogInDate(LoginData loginData) {
		this.loginData = loginData;
	}

	public ArrayList<Task> getTasks() {
		return tasks;
	}

	public void setTasks(ArrayList<Task> tasks) {
		this.tasks = tasks;
	}
}

	
	
	
	
