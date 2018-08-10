import java.text.ParseException;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Date;
import java.util.Scanner;

public class AddTaskConsole {

	public static Task taskQuery() throws ParseException {

		Scanner keyboard = new Scanner(System.in);
		System.out.println("\n\n\n______Add task______");
		String titleInp = "";
		while (titleInp.equals("")) {
			System.out.println("Title: ");
			titleInp = keyboard.nextLine();
		}

		String descriptionInp = "";
		while (descriptionInp.equals("")) {
			System.out.println("Description: ");
			descriptionInp = keyboard.nextLine();
		}

		String dueDateInp = "";
		Date d = null;
		while (dueDateInp.equals("") || !SystemManager.dateIsValid(dueDateInp)) {
			System.out.println("Due date (dd/mm/yyyy): ");
			dueDateInp = keyboard.nextLine();
		}
		LocalDate dueDate = SystemManager.convertStringToLocalDate(dueDateInp);

		String hoursInp = "";
		int hours = 0;
		do {
			System.out.println("Time exposure (in h): ");
			hoursInp = keyboard.nextLine();
		} while (hoursInp.equals("") || SystemManager.StringToInt(hoursInp) == -1);
		hours = SystemManager.StringToInt(hoursInp);

		String priorityInp = "";
		int priority = 0;
		do {
			System.out.println("Priority (1-low to 3-high): ");
			priorityInp = keyboard.nextLine();
		} while (SystemManager.priorityIsValid(priorityInp) == 0);
		priority=SystemManager.StringToInt(priorityInp);
		
		System.out.println("Your task was successfully added!");
		return new Task(titleInp, descriptionInp, dueDate, hours, priority);

	}
}
