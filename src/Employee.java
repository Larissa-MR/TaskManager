import java.io.*;
import java.nio.channels.FileChannel;
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
		File parentFile = new File(
				"C:\\Users\\Administrator\\Desktop\\TaskManager\\Employees_Task\\Employee" + employeeId);
		File[] allTasks = parentFile.listFiles();
		newTask.setId(allTasks.length);
		File employeeFile = new File("C:\\Users\\Administrator\\Desktop\\TaskManager\\Employees_Task\\Employee"
				+ employeeId + "\\Task" + newTask.getId() + ".txt");
		employeeFile.createNewFile();
		try (FileOutputStream fos = new FileOutputStream(employeeFile, false);
				ObjectOutputStream oos = new ObjectOutputStream(fos)) {
			oos.writeObject(newTask);
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

	public void viewTasks() {
		File directory = new File("C:\\Users\\Administrator\\Desktop\\TaskManager\\Employees_Task\\Employee" + this.id);
		File[] allTasks = directory.listFiles();
		for (File f : allTasks) {
			try {
				Task t = (Task) SystemManager.readFile(f);
				SystemManager.taskSummaryOutput(t);
			} catch (ClassNotFoundException e) {
				e.printStackTrace();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}

	public boolean deleteTask(long taskId) throws IOException {
		File taskFile = new File("C:\\Users\\Administrator\\Desktop\\TaskManager\\Employees_Task\\Employee" + this.id
				+ "\\Task" + taskId + ".txt");
		taskFile.delete();// Now the file will get deleted
		if(!taskFile.exists())return true;
		else return false;
	}
	
	public void delegateTask(long employeeId, long taskId) throws IOException {
		File srcFile = new File("C:\\Users\\Administrator\\Desktop\\TaskManager\\Employees_Task\\Employee" + this.id
				+ "\\Task" + taskId + ".txt");
		File destFile = new File("C:\\Users\\Administrator\\Desktop\\TaskManager\\Employees_Task\\Employee" + employeeId
				+ "\\Task" + taskId + ".txt");
		FileChannel src = new FileInputStream(srcFile).getChannel();
		  FileChannel dest = new FileOutputStream(destFile).getChannel();
		  dest.transferFrom(src, 0, src.size());
		  srcFile.delete();
	}
	
	public int calcCapacity() {
		File directory = new File("C:\\Users\\Administrator\\Desktop\\TaskManager\\Employees_Task\\Employee" + this.id);
		File[] allTasks = directory.listFiles();
		for (File f : allTasks) {
			try {
				Task t = (Task) SystemManager.readFile(f);
				return (1 - t.getHours()/workload)*100;
			} catch (ClassNotFoundException e) {
				e.printStackTrace();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		return -1;
		
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
