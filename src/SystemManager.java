import java.io.*;
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
	@SuppressWarnings("resource")
	public static boolean loginIsValid(String inpUser, String inpPass) throws FileNotFoundException {
		File directory = new File("C:\\Users\\Administrator\\Desktop\\Employees");      //erstellt Ordner Employees, falls noch nicht vorhanden
		File[] files = directory.listFiles();        //macht array aus allen dateien in dem Order^
		int i = 0;
		if (inpUser.equals("") || inpPass.equals(""))     
			return false;
		for (File f : files) {                         //für jede Datei in Employees
			Scanner usScanner = new Scanner(files[i]);  // neuer Scanner
			while (usScanner.hasNextLine()) {           //solange wie Zeile vorhanden
				String nextToken1 = usScanner.next();    //lese nächste Zeile
				if (nextToken1.equals(inpUser)) {         //wenn Nutzername in Zeile
					Scanner pwScanner = new Scanner(files[i]);  //neuer Scanner (notwendig, weil man die Datei erneut von Beginn lesen muss, um auf das Passwort zu überprüfen
					while (usScanner.hasNextLine()) {
						String nextToken2 = pwScanner.next();
						if (nextToken2.equals(inpPass))     //wenn auch das Passwort übereinstimmt
							return true;
					}
				}
			}
		}
		return false;

	}
	
	public static Object readFile(String fileName) throws IOException, ClassNotFoundException {
		try {
			FileInputStream fis= new FileInputStream(fileName);
			ObjectInputStream ois= new ObjectInputStream(fis);
			Object obj = ois.readObject();
			return obj;
		} catch (FileNotFoundException e) {
			e.printStackTrace();
			return null;
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
