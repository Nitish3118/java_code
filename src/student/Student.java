package student;

public class Student {
	public int RollNumber;
	String Name;
	String Department;
	char section;
	static String collegename="KIET"; //college name
	
	public Student(int RollNumber, String Name, String Department, char section) {
		this.RollNumber=RollNumber;
		this.Name=Name;
		this.Department=Department;
		this.section=section;
	}
	
	public Student() {
	    RollNumber = 0;
	    Name = "Unknown";
	    Department = "Unknown";
	    section = 'A';
	}

	
	public Student(Student obj) {
		this.RollNumber=obj.RollNumber;
		this.Name=obj.Name;
		this.Department=obj.Department;
		this.section=obj.section;
	}
	
	public void studying(int No_of_hours) {
		System.out.println("the student is studying for "+ No_of_hours+ " hours");
	}
	public void playing() {
		System.out.println("Student is playing");
	}
	public void displayInfo() {
		System.out.println("the name of the student is "+ Name+"the college name is " +collegename);
		System.out.println("the department name is "+ Department+"the section is" +section);
	}
	public void payFee() {
		System.out.println("The student"+Name+"has paid the tution fee");
	}
	public void platform() {
		System.out.println("The student"+Name+"has joined the online platform");
	}
	
	public static void main(String args[]) {
		Student student1 = new Student(1, "Rohit", "AI", 'C');
		Student student2 = new Student();
		Student student3 = new Student(student1);
		student1.displayInfo();
		student2.displayInfo();
		Student.collegename = "IIT";
		student1.collegename = "NIT";
		student1.displayInfo();
		student2.displayInfo();
		student1.Department="AI";
		student1.Name="Nitish";
		student1.RollNumber=17;
		student1.section='C';
		student1.displayInfo();
		student1.playing();
		student1.studying(5);
		student2.displayInfo();
	}
}



