import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class TeamLeader extends Employee{
	
	Team team;

	public TeamLeader(long id, String firstName, String lastName, int workload, LoginData loginData) {
		super(id, firstName, lastName, workload, loginData);
		
	}
	
	public void addEmployeeToTeam(Employee newEmployee) throws IOException {
		File employeesList = new File("emplpoyeesList.txt");
		employeesList.createNewFile();
		try (FileOutputStream fos = new FileOutputStream(employeesList, false); 
				ObjectOutputStream oos = new ObjectOutputStream(fos)){
			oos.writeObject(newEmployee);
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}
	

}
