import java.io.*;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.*;

public class SystemManager {

	/**
	 * 
	 * 
	 * @param inpUser user input for 'username'
	 * @param inpPass user input for 'password'
	 * @return the file's name in which both username and password were found
	 * @throws IOException
	 * @throws ClassNotFoundException
	 */
	@SuppressWarnings("resource")
	public static String loginIsValid(String inpUser, String inpPass) throws ClassNotFoundException, IOException {
		File directory = new File("C:\\Users\\Administrator\\Desktop\\TaskManager\\Employees_LoginData");
		File[] files = directory.listFiles();
		int i = 0;
		if (inpUser.equals("") || inpPass.equals(""))
			return null;
		for (File f : files) {
			Scanner fScanner = new Scanner(files[i]);
			i++;
			while (fScanner.hasNextLine()) {
				String nextToken = fScanner.next();
				if (nextToken.equals(inpUser)) {
					nextToken = fScanner.next();
					if (nextToken.equals(inpPass)) {
						return f.getName();
					}
				}
			}
		}
		return null;
	}

	public static void viewEmployees() {
		File directory = new File("C:\\Users\\Administrator\\Desktop\\TaskManager\\Employees");
		File[] allEmployees = directory.listFiles();
		for (File f : allEmployees) {
			try {
				Employee emp = (Employee) SystemManager.readFile(f);
				SystemManager.printEmployeeData(emp);
			} catch (ClassNotFoundException e) {
				e.printStackTrace();
			} catch (IOException e) {
				e.printStackTrace();
			}

		}

	}

	/**
	 * return Employee for the given fileName
	 * 
	 * @param fileName
	 * @return Employee that is serialized in that File
	 * @throws ClassNotFoundException
	 * @throws IOException
	 */
	public static Employee getEmployeeByFileName(String fileName) throws ClassNotFoundException, IOException {
		File directory = new File("C:\\Users\\Administrator\\Desktop\\TaskManager\\Employees");
		File[] files = directory.listFiles();
		int i = 0;
		for (File f : files) {
			if (f.getName().equals(fileName)) {
				try {
					FileInputStream fis = new FileInputStream(f);
					ObjectInputStream ois = new ObjectInputStream(fis);
					Object obj = ois.readObject();
					return (Employee) obj;
				} catch (FileNotFoundException e) {
					e.printStackTrace();
					return null;
				}

			}
		}
		return null;
	}

	/**
	 * readsFile and returns Object that is serialized in file, if object empty:
	 * return null
	 * 
	 * @param file
	 * @return
	 * @throws IOException
	 * @throws ClassNotFoundException
	 */
	public static Object readFile(File file) throws IOException, ClassNotFoundException {
		try {
			FileInputStream fis = new FileInputStream(file);
			ObjectInputStream ois = new ObjectInputStream(fis);
			Object obj = ois.readObject();
			ois.close();
			return obj;
		} catch (FileNotFoundException e) {
			e.printStackTrace();
			return null;
		}
	}

	public static void copyFileUsingStream(File source, File dest) throws IOException {
		InputStream is = null;
		OutputStream os = null;
		try {
			is = new FileInputStream(source);
			os = new FileOutputStream(dest);
			byte[] buffer = new byte[1024];
			int length;
			while ((length = is.read(buffer)) > 0) {
				os.write(buffer, 0, length);
			}
		} finally {
			is.close();
			os.close();
		}
	}

	public static boolean employeeForIdExists(long id) {
		if (new File("C:\\Users\\Administrator\\Desktop\\TaskManager\\Employees\\Employee" + id + ".txt").exists())
			return true;
		else
			return false;
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

	public static void taskSummaryOutput(Task task) {
		System.out.println("\nId: " + task.getId());
		System.out.println("Title: " + task.getTitle());
		System.out.println("Description: " + task.getDescription());
		System.out.println("Due date: " + task.getDueDate().toString());
		System.out.println("Time exposure: " + task.getHours() + " hours");
		System.out.println("Priority: " + task.getPriority());

	}

	public static void printEmployeeData(Employee emp) {
		System.out.println("\nId: " + emp.getId());
		System.out.println("Name: " + emp.getFirstName() + " " + emp.getLastName());
		System.out.println("Capacity: " + emp.calcCapacity());

	}

}
