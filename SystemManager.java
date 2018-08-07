import java.io.File;
import java.io.FileNotFoundException;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.*;

public class SystemManager {

	
	/**
	 * geht durch jeden File in Ordner "Employees" und überprüft, ob die Konstellation aus inpUser und 
	 * inpPass zu finden ist
	 * @param inpUser   Nutzername
	 * @param inpPass   Passwort
	 * @return
	 * @throws FileNotFoundException
	 */
	public static boolean loginIsValid(String inpUser, String inpPass) throws FileNotFoundException {
		File directory = new File("Employees");
		File[] files = directory.listFiles();
		int i = 0;
		if (inpUser.equals("") || inpPass.equals(""))
			return false;
		for (File f : files) {
			Scanner usScanner = new Scanner(files[i]);
			while (usScanner.hasNextLine()) {
				String nextToken1 = usScanner.next();
				if (nextToken1.equals(inpUser)) {
					Scanner pwScanner = new Scanner(files[i]);
					while (usScanner.hasNextLine()) {
						String nextToken2 = pwScanner.next();
						if (nextToken2.equals(inpPass))
							return true;
					}
					return false;
				}
			}
		}

	}

	public static void viewEmpTasks(ArrayList<Task> empTasks) {
		System.out.println("\n_______________________MY TASKS_______________________");
		for (int i = 0; i < empTasks.size(); i++) {
			taskSummaryOutput(empTasks.get(i));
		}
	}

	public static boolean dateIsValid(String dateInput) {
		SimpleDateFormat sdf = new SimpleDateFormat("dd/mm/yyyy");
		Date testDate = null;

		try {
			testDate = sdf.parse(dateInput);
		}

		catch (ParseException e) {
			System.out.println("Wrong date format");
			return false;
		}

		if (!sdf.format(testDate).equals(dateInput)) {
			System.out.println("Wrong date format");
			return false;
		}

		return true;
	}

	public static LocalDate convertStringToLocalDate(String dateString) throws ParseException {
//		DateFormat formatter = new SimpleDateFormat("dd.mm.yyyy");
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("d/MM/yyyy");
		LocalDate localDate = LocalDate.parse(dateString, formatter);
		return localDate;
	}

	public static int priorityIsValid(String priorityInp) {
		if (priorityInp.equals("1") || priorityInp.equals("2") || priorityInp.equals("3")) {
			return Integer.parseInt(priorityInp);
		}
		return 0;
	}

	public static int StringToInt(String inp) {
		try {
			return Integer.parseInt(inp);
		} catch (Exception notInteger) {
			return -1;
		}

	}

	public static void descriptionOutput(ArrayList<String> descriptionStringList) {
		for (int i = 0; i < descriptionStringList.size(); i++) {
			System.out.println(descriptionStringList.get(i));
		}
	}

	public static void taskSummaryOutput(Task task) {
		System.out.println("ID: " + task.getId());
		System.out.println("Title: " + task.getTitle());
		System.out.print("Description: ");
		descriptionOutput(task.getDescription());
		System.out.println("Due date: " + task.getDueDate().toString());
		System.out.println("Time exposure: " + task.getHours());
		System.out.println("Priority: " + task.getPriority() + " hours");

	}

	/*
	 * String choice="3"; do {
	 * 
	 * 
	 * switch (choice) { case "1": System.out.println("Add a task "); choice =
	 * input.nextLine(); break; case "2": System.out.println("Remove a task");
	 * choice = input.nextLine(); break; case "3":
	 * System.out.println("Update a task"); choice = input.nextLine(); break; case
	 * "4": System.out.println("List all tasks"); choice = input.nextLine(); break;
	 * } }
	 * 
	 * while (choice > 0) { System.out.println("Exit"); }
	 */
}
