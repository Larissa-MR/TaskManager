import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.Scanner;
import java.util.UUID;

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
//creating a new Team/directory

	
public void newTeam(long id, String lastName, String firstName) throws IOException {
	
	Scanner line = new Scanner(System.in);
	//unique TeamID - question do we need it?
	String TeamID = UUID.randomUUID().toString();
	String TeamName ="";
	System.out.println("Bitte geben Sie einen Teamnamen ein");
	TeamName = line.nextLine();
	File theDir = new File(TeamName);

	// if the directory does not exist, create it
	if (!theDir.exists()) {
	    System.out.println("creating directory: " + theDir.getName());
	    boolean result = false;

	    try{
	        theDir.mkdir();
	        result = true;
	    } 
	    catch(SecurityException se){
	        //handle it
	    }        
	    if(result) {    
	        System.out.println("Team " + theDir + "wurde erstellt");  
	    }
	}
	try (FileOutputStream fos = new FileOutputStream(TeamName, false);
			ObjectOutputStream oos = new ObjectOutputStream(fos)) {
		oos.writeObject(team);
	} catch (IOException e) {
		e.printStackTrace();
	}
	return;
}
public static void deleteTeam(File directory2) throws IOException
{	
	System.out.println("Bitte geben den Namen des zu löschenden Teams ein");
	try{
		Scanner keyboard = new Scanner(System.in);
		String directoryDelete = keyboard.nextLine();
		File directory = new File(directoryDelete);
		//make sure directory exists
    	if(!directory.exists()){
 
           System.out.println("Directory does not exist.");
           System.exit(0);
 
        }else{
 
           deleteTeam(directory);
        }
 
    	System.out.println("Done");
     

	   
	}catch(Exception e){
		
		e.printStackTrace();
		
	}
}
}
