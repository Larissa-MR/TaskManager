import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.InputStreamReader;
import java.time.LocalDate;
import java.util.*;

public class Main {

	public static void main(String[] args) throws FileNotFoundException {
		// TODO Auto-generated method stub
	
		
		
		
		
	
	/*Employee new = DataBase.addnewEmployee(1111, "einVorname", "einNachname", 40, new LoginData("einUsername", "einPasswort"));
	System.out.println(new.getFirstName());
	}
*/
	
	ArrayList<Employee> list= new ArrayList<Employee>();
	Employee emp1 = new Employee("EMP_1000", "Manuel","Mueller", 40);
	Employee emp2 = new Employee("EMP_1001","Jochen","Lauter",40);
	Employee emp3 = new Employee("EMP_1002","Nina","Lambrecht",40);
	Employee emp4 = new Employee("EMP_1003","Giselle","Stecher",40);
	Employee emp5 = new Employee("EMP_1005","Paul","Stehr",30);
	Employee emp6 = new Employee("EMP_1006","Janine","Steinberger",20);
	Employee emp7 = new Employee("EMP_1007","Tom","Lauber",40);
	Employee emp8 = new Employee("EMP_1000", "Manuel","Mueller",40);
	Employee emp9 = new Employee("EMP_1000", "Manuel","Mueller",40);
	Employee emp10 = new Employee("EMP_1000", "Manuel","Mueller",40);
	Employee emp11= new Employee("EMP_1000", "Manuel","Mueller",40);
	Employee emp12 = new Employee("EMP_1000", "Manuel","Mueller",40);
	Employee emp13 = new Employee("EMP_1000", "Manuel","Mueller",40);
	Employee emp14 = new Employee("EMP_1000", "Manuel","Mueller",40);
	Employee emp15 = new Employee("EMP_1000", "Manuel","Mueller",40);
	Employee emp16 = new Employee("EMP_1000", "Manuel","Mueller",40);
	Employee emp17 = new Employee("EMP_1000", "Manuel","Mueller",40);
	Employee emp18 = new Employee("EMP_1000", "Manuel","Mueller",40);
	Employee emp19 = new Employee("EMP_1000", "Manuel","Mueller",40);
	Employee emp20 = new Employee("EMP_1000", "Manuel","Mueller",40);
	Employee emp21 = new Employee("EMP_1000", "Manuel","Mueller",40);
	Employee emp22 = new Employee("EMP_1000", "Manuel","Mueller",40);
	Employee emp23 = new Employee("EMP_1000", "Manuel","Mueller",40);
	Employee emp24 = new Employee("EMP_1000", "Manuel","Mueller",40);
	Employee emp25 = new Employee("EMP_1000", "Manuel","Mueller",40);
	
	list.add(emp1);
	list.add(emp2);
	for (Employee x:list)
	System.out.print(x);
	}

	private static Task addnewTask(long id, String title, String description, LocalDate dueDate, String priority) {
		            Scanner scanner = new Scanner(System.in);
		            	System.out.print("Id: ");
		            	String inputID = scanner.nextLine();
		                System.out.print("Title: ");
		                String input = scanner.nextLine();
		                System.out.println("Description: ");
		                String inputDescription = scanner.nextLine();        
		                System.out.println("-----------\n");
		                System.out.println("Due Date: ");
		                String inputDate = scanner.nextLine();
		                System.out.println("Priority: ");
		                String inputPrio = scanner.nextLine();
		                
		                System.out.print("Taskübersicht: " + id + " \n" +title + " \n" + description + " \n " + dueDate + " \n " + priority);
					
						
						
						System.out.print("Hallo");
						return null;
		               
		}


	
	     

}