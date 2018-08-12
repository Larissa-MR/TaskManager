import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.Scanner;
import java.util.UUID;

public class TeamLeader extends Employee{
	
	Team team;
	private long id;

	public TeamLeader(long teamId, String teamName, String lastName, int workload, LoginData loginData) {
		super(teamId, teamName,lastName, workload);
		
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

//creating a new Team/directory

	
public void addTeam(Team newTeam) throws IOException {
	String TeamID = Long.toString(this.id);
	File TeamDir = new File("C:\\Users\\Administrator\\Desktop\\TaskManager\\Team"
			+ TeamID + "\\Task" + newTeam.getTeamID());
	TeamDir.mkdir();
	try (FileOutputStream fos = new FileOutputStream(TeamDir, false);
			ObjectOutputStream oos = new ObjectOutputStream(fos)) {
		oos.writeObject(newTeam);
		oos.close();
	} catch (IOException e) {
		e.printStackTrace();
	}
	System.out.println("Team " + TeamDir + "wurde erstellt");  	 

}


public boolean deleteTeam(long TeamID) throws IOException
{	
	System.out.println("Bitte geben den Namen des zu löschenden Teams ein");
	//try{
	File TeamDir = new File("C:\\Users\\Administrator\\Desktop\\TaskManager\\Team" + this.id);
	
	TeamDir.delete();// Now the file will get deleted
	if(!TeamDir.exists())return true;
	else return false;
		
	}
}
//}
