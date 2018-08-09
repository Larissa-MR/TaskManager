import java.io.*;
import java.util.*;

/**
 * 
 * @author Aysu Heristchi
 * @version 1.0
 */


public abstract class Employee implements Serializable{
	private long id;
	private String firstName, lastName;
	protected static LoginData loginData;
	private int workload;
	
	public Employee(long id, String lastName, String firstName, int workload, LoginData loginData) {
		this.id=id;
		this.lastName=lastName;
		this.firstName=firstName;
		this.workload=workload;
	}
	





	/**
	 * adds newTask to File that is named after employee id (serialization)
	 * @param newTask
	 * @throws IOException
	 */
	public void addTask(Task newTask) throws IOException {
		String employeeId = Long.toString(this.id);
		File employeeFile = new File(employeeId + ".txt");
		 // if file already exists will do nothing 
		employeeFile.createNewFile();
		try (FileOutputStream fos = new FileOutputStream(employeeFile, false); 
				ObjectOutputStream oos = new ObjectOutputStream(fos)){
			oos.writeObject(newTask);
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}
	
	
	
	public int getWorkload() {
		return workload;
	}

	public void setWorkload(int workload) {
		this.workload = workload;
	}


	public void setLoginData(LoginData loginData) {
		this.loginData = loginData;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	
	public LoginData getLoginData() {
		return loginData;
	}

	public void setLogInDate(LoginData loginData) {
		this.loginData = loginData;
	}
	
	
	
	//Task hinzufügen
	public void AddTask(long id ) throws IOException{
		//get FileName from rightEmployee employeeFile
		rightEmployee.employeeFile.getName(); 
		
		//Title
		System.out.print("Title: ");
        Scanner scan = new Scanner(System.in);
        String title = scan.nextLine();
       //FileWriter fWriter = null;
	    BufferedWriter writer = new BufferedWriter(new FileWriter(rightEmployee.employeeFile.getName(), true));
	    writer.append(' ');
	    writer.append(title);
	    
	    System.out.println("Description: ");
	    String description = scan.nextLine();
	    writer.append(' ');
	    writer.append(description);
	    
	    
	    System.out.println("Due Date: ");
	    String dDate = scan.nextLine();
	    writer.append(' ');
	    writer.append(dDate);
	    
	    System.out.println("Priority 1-low to 3-high: ");
	    String prio = scan.nextLine();
	    writer.append(' ');
	    writer.append(prio);
	    
	    System.out.println("Hours: ");
	    String h = scan.nextLine();
	    writer.append(' ');
	    writer.append(h);
	    
	    writer.close();
		
		
		
	}
	
	

	//Methode um Task zu editieren
	public void editTask(long id){
		
		
		Scanner keyboard = new Scanner(System.in);
		String taskOption = "";
		
		
		do {
			System.out.println("(1) Edit Title ");
			System.out.println("(2) Edit Description ");
			System.out.println("(3) Edit Due Date");
			System.out.println("(4) Edit Priority ");
			System.out.println("(5) Edit Hours");
			System.out.println("(0) Log out "); //brauchen wir das 
			
			
			System.out.println("Bitte geben Sie die ID der Task an, die Sie bearbeiten wollen");
			taskOption = keyboard.nextLine();
			keyboard.close();
		
		 switch (taskOption) {
         case "1": System.out.println("Title: + ");
         String line = null;
         try
         {
             File f1 = new File("ightEmployee.employeeFile.getName()");
             FileReader fr = new FileReader(f1);
             BufferedReader br = new BufferedReader(fr);
             while (line = br.readLine() != null)
             {
                 if (line.contains("java"))
                     line = line.replace("java", " ");
                 lines.add(line);	
             }
             FileWriter fw = new FileWriter(f1);
             BufferedWriter out = new BufferedWriter(fw);
             out.write(lines.toString());
         }
         catch (Exception ex)
         {
             ex.printStackTrace();
         }
     }
     /*public statc replace(FileReplace fr)
     {
         FileReplace fr = new FileReplace();
         fr.doIt();
                  break;
          
		}*/
	} while (taskOption.equals("")); // Input-Validation (1,2,3,0)

	}

}

	
	