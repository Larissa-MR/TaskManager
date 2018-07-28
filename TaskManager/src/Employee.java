import java.util.*;


public class Employee {
	private long id;
	private String firstName, lastName;
	private LogInData logInDate;
	private ArrayList<Task> tasks;
	
	public Employee(long id) {
		this.id=id;
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

	public LogInData getLogInDate() {
		return logInDate;
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
}

	
	
	
	
