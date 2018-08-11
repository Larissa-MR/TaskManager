import java.util.Scanner;

public class DeleteConsole {

	public static Long deleteTaskQuery(Employee currEmp) {
		Scanner keyboard = new Scanner(System.in);
		String taskId = "";
		long id = -1;
		while (taskId.equals("")) {
			System.out.println("Please enter the ID of the task you want to delete: ");
			taskId = keyboard.nextLine();
			id = Long.parseLong(taskId);
			if(!currEmp.taskForIdExists(id)) return (long) -1;
		}
		return id;
	}
}
