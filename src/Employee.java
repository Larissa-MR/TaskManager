import java.io.*;
import java.util.*;

public abstract class Employee implements Serializable {
	private long id;
	private String firstName, lastName;
	private LoginData loginData;
	private int workload;
	private ArrayList<Task> tasks = new ArrayList<Task>();

	public Employee(long id, String lastName, String firstName, int workload) {
		this.id = id;
		this.lastName = lastName;
		this.firstName = firstName;
		this.workload = workload;
	}

	/**
	 * adds newTask to File that is named after employee id (serialization)
	 * 
	 * @param newTask
	 * @throws IOException
	 */
	public void addTask(Task newTask) throws IOException {
		String employeeId = Long.toString(this.id);
		File employeeFile = new File(
				"C:\\Users\\Administrator\\Desktop\\TaskManager\\Employees_Task" + employeeId + ".txt");
		employeeFile.createNewFile();
		try (FileOutputStream fos = new FileOutputStream(employeeFile, false);
				ObjectOutputStream oos = new ObjectOutputStream(fos)) {
			oos.writeObject(newTask);
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

	public void viewTasks() throws IOException {
		String employeeId = Long.toString(this.id);
		File employeeFile = new File(
				"C:\\Users\\Administrator\\Desktop\\TaskManager\\Employees_Task\\Employee" + employeeId + ".txt");

		FileInputStream fis = new FileInputStream(employeeFile);
		boolean cont = true;
		ObjectInputStream input = new ObjectInputStream(fis);
		while (cont) {
			Task task;
			try {
				task = (Task) input.readObject();
				if (task != null) {
					SystemManager.taskSummaryOutput(task);
					input.close();
				} else
					cont = false;
			} catch (ClassNotFoundException e) {
				System.out.println("No task");
			} catch (IOException e) {
				System.out.println("Exception");
				break;
			}

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
