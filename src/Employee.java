import java.io.*;
import java.util.*;

/**
 * 
 * @author Aysu Heristchi
 * @version 1.0
 */


public abstract class Employee implements Serializable{
	private long id;
	private String firstName, lastName;
	private LoginData loginData;
	private int workload;
	
	public Employee(long id, String lastName, String firstName, int workload) {
		this.id=id;
		this.lastName=lastName;
		this.firstName=firstName;
		this.workload=workload;
	}
	
	
	
	
	/**
	 * adds newTask to File that is named after employee id (serialization)
	 * @param newTask
	 * @throws IOException
	 */
	public void addTask(Task newTask) throws IOException {
		String employeeId = Long.toString(this.id);
		File employeeFile = new File(employeeId + ".txt");
		 // if file already exists will do nothing 
		employeeFile.createNewFile();
		try (FileOutputStream fos = new FileOutputStream(employeeFile, false); 
				ObjectOutputStream oos = new ObjectOutputStream(fos)){
			oos.writeObject(newTask);
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}
	
	
	
	public int getWorkload() {
		return workload;
	}

	public void setWorkload(int workload) {
		this.workload = workload;
	}


	public void setLoginData(LoginData loginData) {
		this.loginData = loginData;
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

}

	
	
	
	
