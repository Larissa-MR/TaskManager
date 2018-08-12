import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.Scanner;

public class Administrator extends Employee {

	public Administrator(long id, String lastName, String firstName, int workload) {
		super(id, lastName, firstName, workload);
	}

	public Employee newEmployee(long id, String lastName, String firstName, int workload) throws IOException {
		Employee emp = new RegularEmployee(id, lastName, firstName, workload);
		String empId = Long.toString(id);
		File employeeFile = new File("C:\\Users\\Administrator\\Desktop\\TaskManager\\Employees\\Employee" + empId + ".txt");
		employeeFile.createNewFile();
		try (FileOutputStream fos = new FileOutputStream(employeeFile, false);
				ObjectOutputStream oos = new ObjectOutputStream(fos)) {
			oos.writeObject(emp);
		} catch (IOException e) {
			e.printStackTrace();
		}
		return emp;
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
	
}