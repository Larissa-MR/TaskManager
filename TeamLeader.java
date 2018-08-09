import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.Scanner;

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
	
	public static void deleteEmployee(long id)
    {	
    	try{
    		System.out.println("Bitte geben Sie die ID des zu löschenden Employees ein");
    		Scanner keyboard = new Scanner(System.in);
    		String empIdInput = "";
    		File file = new File("c:\\" + empIdInput + ".txt");
    		if(file.delete()){
    			System.out.println(file.getName() + " is deleted!");
    		}else{
    			System.out.println("Delete operation is failed.");
    		}
    	   
    	}catch(Exception e){
    		
    		e.printStackTrace();
    		
    	}
    }

public Team newTeam(long id, String lastName, String firstName) throws IOException {
	Team team = new Team(id, lastName, firstName);
	String tID = Long.toString(id);
	File TeamFile = new File("C:\\Users\\Administrator\\Desktop\\Team\\" + tID + ".txt");
	TeamFile.createNewFile();
	try (FileOutputStream fos = new FileOutputStream(TeamFile, false);
			ObjectOutputStream oos = new ObjectOutputStream(fos)) {
		oos.writeObject(team);
	} catch (IOException e) {
		e.printStackTrace();
	}
	return team;
}
public static void deleteTeam(long id)
{	
	try{
		System.out.println("Bitte geben Sie die ID des zu löschenden Teams ein");
		Scanner keyboard = new Scanner(System.in);
		String tIdInput = "";
		File file = new File("c:\\" + tIdInput + ".txt");
		if(file.delete()){
			System.out.println(file.getName() + " is deleted!");
		}else{
			System.out.println("Delete operation is failed.");
		}
	   
	}catch(Exception e){
		
		e.printStackTrace();
		
	}

	}

}