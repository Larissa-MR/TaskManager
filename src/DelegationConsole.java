import java.util.Scanner;

public class DelegationConsole {
	
	static Scanner keyboard = new Scanner(System.in);
	
	public static long delegationQueryTask(Employee currEmp) {
		String taskId = "";
		long id=-1;
		while (taskId.equals("") || id==-1) {
			System.out.println("Please enter the ID of the task you want to delegate: ");
			taskId = keyboard.nextLine();
			id = Long.parseLong(taskId);
			if(!currEmp.taskForIdExists(id)) id=-1;
		}
		return id;
	}
	
	public static long delegationQueryEmp() {
		String targetEmpId="";
		long id = -1;
		while (targetEmpId.equals("")||id==-1) {
			System.out.println("Please enter the ID of the employee you want to delegate the task to:  ");
			targetEmpId= keyboard.nextLine();
			id = Long.parseLong(targetEmpId);
			if(!SystemManager.employeeForIdExists(id)) id=-1;
		}
		return id;
	}
}
