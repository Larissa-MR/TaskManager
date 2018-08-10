import java.util.Scanner;

public class DeleteConsole {

	public static Long deleteTaskQuery() {
		Scanner keyboard = new Scanner(System.in);
		String taskId = "";
		while (taskId.equals("")) {
			System.out.println("Please enter the ID of the task you want to delete: ");
			taskId = keyboard.nextLine();
			return Long.parseLong(taskId);
		}
		return (long) -1;
	}
}
